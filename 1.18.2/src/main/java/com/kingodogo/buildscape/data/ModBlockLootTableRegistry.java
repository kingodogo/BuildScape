package com.kingodogo.buildscape.data;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.block.SilkTouchOnlyGlassBlock;
import com.kingodogo.buildscape.block.SilkTouchOnlyPaneBlock;
import com.kingodogo.buildscape.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

// [Architect]: Runtime loot table registration for all mod blocks
// Registers loot tables programmatically when loot tables are loaded
@Mod.EventBusSubscriber(modid = BuildScape.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModBlockLootTableRegistry {
    
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Map<String, RegistryObject<Item>> itemMap = new HashMap<>();
    private static boolean initialized = false;
    
    // Initialize item map once
    private static void initialize() {
        if (initialized) return;
        
        ModItems.ITEMS.getEntries().forEach(item -> {
            String path = item.getId().getPath();
            itemMap.put(path, item);
        });
        
        initialized = true;
        LOGGER.info("Initialized ModBlockLootTableRegistry with {} items", itemMap.size());
    }
    
    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        initialize();
        
        String name = event.getName().toString();
        
        // Check if this is one of our block loot tables
        if (name.startsWith("buildscape:blocks/")) {
            String blockPath = name.substring("buildscape:blocks/".length());
            
            // Find the block
            ModBlocks.BLOCKS.getEntries().stream()
                .filter(block -> block.getId().getPath().equals(blockPath))
                .findFirst()
                .ifPresent(block -> {
                    Block blockInstance = block.get();
                    
                    // Check if this is a mosaic glass block/pane (requires Silk Touch)
                    boolean isMosaicGlass = blockInstance instanceof SilkTouchOnlyGlassBlock || 
                                          blockInstance instanceof SilkTouchOnlyPaneBlock;
                    
                    // Find corresponding item - items are named with _item suffix
                    String itemPath = blockPath + "_item";
                    RegistryObject<Item> item = itemMap.get(itemPath);
                    
                    if (item != null) {
                        LootTable.Builder builder;
                        
                        if (isMosaicGlass) {
                            // Mosaic glass requires Silk Touch
                            builder = createSilkTouchTable(item.get());
                        } else {
                            // Regular blocks drop their item
                            builder = createDropSelfTable(item.get());
                        }
                        
                        // Replace the loot table
                        event.setTable(builder.setParamSet(net.minecraft.world.level.storage.loot.parameters.LootContextParamSets.BLOCK).build());
                        LOGGER.debug("Registered loot table for block: {}", blockPath);
                    } else {
                        LOGGER.warn("Could not find item for block: {} (expected: {})", blockPath, itemPath);
                    }
                });
        }
    }
    
    private static LootTable.Builder createDropSelfTable(Item item) {
        return LootTable.lootTable()
            .withPool(LootPool.lootPool()
                .name("main")
                .setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(item)
                    .when(ExplosionCondition.survivesExplosion()))
            );
    }
    
    private static LootTable.Builder createSilkTouchTable(Item item) {
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

