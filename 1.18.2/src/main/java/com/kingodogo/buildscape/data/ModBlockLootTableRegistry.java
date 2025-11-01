package com.kingodogo.buildscape.data;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.block.SilkTouchOnlyGlassBlock;
import com.kingodogo.buildscape.block.SilkTouchOnlyPaneBlock;
import com.kingodogo.buildscape.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
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
// This is the PRIMARY source for loot tables - replaces JSON files
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
        LOGGER.info("Initialized ModBlockLootTableRegistry with {} items, {} blocks", itemMap.size(), ModBlocks.BLOCKS.getEntries().size());
        
        // Debug: Log some example items to verify they're being registered
        LOGGER.info("[DEBUG] Sample items in map: {}", itemMap.keySet().stream()
            .filter(key -> key.contains("black"))
            .limit(10)
            .toList());
    }
    
    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        initialize();
        
        ResourceLocation name = event.getName();
        
        // Check if this is one of our block loot tables (format: buildscape:blocks/<block_name>)
        if (name.getNamespace().equals(BuildScape.MODID) && name.getPath().startsWith("blocks/")) {
            String blockPath = name.getPath().substring("blocks/".length());
            
            // Debug: Log ALL block loot table loads for our namespace
            LOGGER.info("[LOOT TABLE] Processing block loot table: {}", blockPath);
            
            // Find the block
            ModBlocks.BLOCKS.getEntries().stream()
                .filter(block -> {
                    String blockRegistryPath = block.getId().getPath();
                    return blockRegistryPath.equals(blockPath);
                })
                .findFirst()
                .ifPresentOrElse(block -> {
                    Block blockInstance = block.get();
                    
                    // Check if this is a slab block (needs double-slab handling)
                    boolean isSlab = blockInstance instanceof SlabBlock;
                    
                    // Check if this is a mosaic glass block/pane (requires Silk Touch)
                    boolean isMosaicGlass = blockInstance instanceof SilkTouchOnlyGlassBlock || 
                                          blockInstance instanceof SilkTouchOnlyPaneBlock;
                    
                    // Find corresponding item - items are named with _item suffix
                    String itemPath = blockPath + "_item";
                    RegistryObject<Item> item = itemMap.get(itemPath);
                    
                    // Always replace with programmatic loot table to ensure consistency
                    if (item != null && item.isPresent()) {
                        LootTable.Builder builder;
                        
                        if (isMosaicGlass) {
                            // Mosaic glass requires Silk Touch
                            builder = createSilkTouchTable(item.get());
                            LOGGER.info("[LOOT TABLE] Created loot table for GLASS block: {} -> item: {}", blockPath, itemPath);
                        } else if (isSlab) {
                            // Slabs need double-slab handling
                            builder = createSlabTable(item.get(), blockInstance);
                            LOGGER.info("[LOOT TABLE] Created loot table for SLAB block: {} -> item: {}", blockPath, itemPath);
                        } else {
                            // Regular blocks drop their item
                            builder = createDropSelfTable(item.get());
                            LOGGER.info("[LOOT TABLE] Created loot table for REGULAR block: {} -> item: {}", blockPath, itemPath);
                        }
                        
                        // Replace the loot table
                        event.setTable(builder.setParamSet(net.minecraft.world.level.storage.loot.parameters.LootContextParamSets.BLOCK).build());
                    } else {
                        LOGGER.error("[LOOT TABLE] MISSING ITEM for block: {} (expected item path: {}). Available items: {}", 
                            blockPath, itemPath, itemMap.keySet().stream()
                                .filter(key -> key.contains(blockPath.split("_")[0]))
                                .limit(5)
                                .toList());
                    }
                }, () -> {
                    LOGGER.warn("[LOOT TABLE] Block not found in registry: {}", blockPath);
                });
        }
    }
    
    private static LootTable.Builder createDropSelfTable(Item item) {
        return LootTable.lootTable()
            .withPool(LootPool.lootPool()
                .name("main")
                .setRolls(ConstantValue.exactly(1))
                .when(ExplosionCondition.survivesExplosion())
                .add(LootItem.lootTableItem(item))
            );
    }
    
    private static LootTable.Builder createSlabTable(Item item, Block slabBlock) {
        // Create loot table for slabs with double-slab support
        // Cast to SlabBlock to access the TYPE property
        SlabBlock slab = (SlabBlock) slabBlock;
        return LootTable.lootTable()
            .withPool(LootPool.lootPool()
                .name("main")
                .setRolls(ConstantValue.exactly(1))
                .when(ExplosionCondition.survivesExplosion())
                .add(LootItem.lootTableItem(item)
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(slab)
                            .setProperties(net.minecraft.advancements.critereon.StatePropertiesPredicate.Builder.properties()
                                .hasProperty(SlabBlock.TYPE, SlabType.DOUBLE))))
                    .apply(ApplyExplosionDecay.explosionDecay()))
            );
    }
    
    private static LootTable.Builder createSilkTouchTable(Item item) {
        return LootTable.lootTable()
            .withPool(LootPool.lootPool()
                .name("main")
                .setRolls(ConstantValue.exactly(1))
                .when(ExplosionCondition.survivesExplosion())
                .add(LootItem.lootTableItem(item)
                    .when(MatchTool.toolMatches(
                        net.minecraft.advancements.critereon.ItemPredicate.Builder.item()
                            .hasEnchantment(new net.minecraft.advancements.critereon.EnchantmentPredicate(
                                net.minecraft.world.item.enchantment.Enchantments.SILK_TOUCH,
                                net.minecraft.advancements.critereon.MinMaxBounds.Ints.atLeast(1)))
                            .build())))
            );
    }
}

