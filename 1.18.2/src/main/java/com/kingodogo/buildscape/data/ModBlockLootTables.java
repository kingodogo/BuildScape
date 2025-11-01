package com.kingodogo.buildscape.data;

import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.block.SilkTouchOnlyGlassBlock;
import com.kingodogo.buildscape.block.SilkTouchOnlyPaneBlock;
import com.kingodogo.buildscape.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

// [Architect]: Block loot table provider for data generation
// Generates loot tables for all mod blocks
public class ModBlockLootTables extends ModLootTableProvider {
    
    private final Map<String, RegistryObject<Item>> itemMap = new HashMap<>();
    
    public ModBlockLootTables(DataGenerator generator) {
        super(generator);
        // Build item map for quick lookup
        ModItems.ITEMS.getEntries().forEach(item -> {
            itemMap.put(item.getId().getPath(), item);
        });
    }

    @Override
    protected void addTables() {
        // Generate loot tables for all blocks
        ModBlocks.BLOCKS.getEntries().forEach(block -> {
            Block blockInstance = block.get();
            String blockPath = block.getId().getPath();
            
            // Check if this is a mosaic glass block/pane (requires Silk Touch)
            boolean isMosaicGlass = blockInstance instanceof SilkTouchOnlyGlassBlock || blockInstance instanceof SilkTouchOnlyPaneBlock;
            
            // Find corresponding item - items are named with _item suffix
            String itemPath = blockPath + "_item";
            RegistryObject<Item> item = itemMap.get(itemPath);
            
            if (item != null) {
                ResourceLocation itemLocation = ResourceLocation.fromNamespaceAndPath("buildscape", itemPath);
                
                if (isMosaicGlass) {
                    // Mosaic glass requires Silk Touch
                    lootTables.put(blockInstance, createSilkTouchTable(item.get()));
                } else {
                    // Regular blocks drop their item
                    lootTables.put(blockInstance, createDropSelfTable(item.get()));
                }
            }
        });
    }
    
    private LootTable.Builder createDropSelfTable(Item item) {
        return LootTable.lootTable()
            .withPool(LootPool.lootPool()
                .name("main")
                .setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(item)
                    .when(ExplosionCondition.survivesExplosion()))
            );
    }
    
    private LootTable.Builder createSilkTouchTable(Item item) {
        return LootTable.lootTable()
            .withPool(LootPool.lootPool()
                .name("main")
                .setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(item)
                    .when(MatchTool.toolMatches(
                        net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                            .hasEnchantment(new net.minecraft.advancements.critereon.EnchantmentPredicate(
                                net.minecraft.world.item.enchantment.Enchantments.SILK_TOUCH,
                                net.minecraft.advancements.critereon.MinMaxBounds.Ints.atLeast(1)))))
                    .when(ExplosionCondition.survivesExplosion()))
            );
    }
}
