package com.kingodogo.buildscape.util;

import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

// [Architect]: Central registry for block-to-item drop mappings
// This ensures all blocks drop their correct _item versions
public class BlockDropRegistry {
    
    private static final Map<RegistryObject<Block>, RegistryObject<Item>> DROP_MAP = new HashMap<>();
    
    public static void registerDrops() {
        // Register all block-to-item mappings
        // This is called during mod initialization to set up drop mappings
        
        // Regular blocks
        // Sand blocks - handled by FallingSandBlock, but we can override if needed
        // registerDrop(ModBlocks.BLACK_SAND, ModItems.BLACK_SAND_ITEM);
        
        // Sandstone blocks
        registerDrop(ModBlocks.BLACK_SANDSTONE, ModItems.BLACK_SANDSTONE_ITEM);
        registerDrop(ModBlocks.BLUE_SANDSTONE, ModItems.BLUE_SANDSTONE_ITEM);
        registerDrop(ModBlocks.GREEN_SANDSTONE, ModItems.GREEN_SANDSTONE_ITEM);
        registerDrop(ModBlocks.ORANGE_SANDSTONE, ModItems.ORANGE_SANDSTONE_ITEM);
        registerDrop(ModBlocks.PINK_SANDSTONE, ModItems.PINK_SANDSTONE_ITEM);
        registerDrop(ModBlocks.RED_SANDSTONE, ModItems.RED_SANDSTONE_ITEM);
        registerDrop(ModBlocks.WHITE_SANDSTONE, ModItems.WHITE_SANDSTONE_ITEM);
        registerDrop(ModBlocks.YELLOW_SANDSTONE, ModItems.YELLOW_SANDSTONE_ITEM);
        
        // Tile blocks
        registerDrop(ModBlocks.BLACK_TILES, ModItems.BLACK_TILES_ITEM);
        registerDrop(ModBlocks.BLUE_TILES, ModItems.BLUE_TILES_ITEM);
        registerDrop(ModBlocks.BROWN_TILES, ModItems.BROWN_TILES_ITEM);
        registerDrop(ModBlocks.CYAN_TILES, ModItems.CYAN_TILES_ITEM);
        registerDrop(ModBlocks.GRAY_TILES, ModItems.GRAY_TILES_ITEM);
        registerDrop(ModBlocks.GREEN_TILES, ModItems.GREEN_TILES_ITEM);
        registerDrop(ModBlocks.LIGHT_BLUE_TILES, ModItems.LIGHT_BLUE_TILES_ITEM);
        registerDrop(ModBlocks.LIGHT_GRAY_TILES, ModItems.LIGHT_GRAY_TILES_ITEM);
        registerDrop(ModBlocks.LIME_TILES, ModItems.LIME_TILES_ITEM);
        registerDrop(ModBlocks.MAGENTA_TILES, ModItems.MAGENTA_TILES_ITEM);
        registerDrop(ModBlocks.ORANGE_TILES, ModItems.ORANGE_TILES_ITEM);
        registerDrop(ModBlocks.PINK_TILES, ModItems.PINK_TILES_ITEM);
        registerDrop(ModBlocks.PURPLE_TILES, ModItems.PURPLE_TILES_ITEM);
        registerDrop(ModBlocks.RED_TILES, ModItems.RED_TILES_ITEM);
        registerDrop(ModBlocks.WHITE_TILES, ModItems.WHITE_TILES_ITEM);
        registerDrop(ModBlocks.YELLOW_TILES, ModItems.YELLOW_TILES_ITEM);
        
        // Note: Mosaic glass blocks have their own drop handling via SilkTouchOnlyGlassBlock
        // Note: Sand blocks use FallingSandBlock which handles drops differently
        
        // Add more mappings as needed...
    }
    
    private static void registerDrop(RegistryObject<Block> block, RegistryObject<Item> item) {
        DROP_MAP.put(block, item);
    }
    
    public static Item getDropItem(Block block) {
        for (Map.Entry<RegistryObject<Block>, RegistryObject<Item>> entry : DROP_MAP.entrySet()) {
            if (entry.getKey().isPresent() && entry.getKey().get() == block) {
                return entry.getValue().isPresent() ? entry.getValue().get() : null;
            }
        }
        return null;
    }
}

