package com.kingodogo.buildscape.item;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BuildScape.MODID);
    
    // Helper method to create BlockItem with creative tab
    private static Item.Properties createBlockItemProperties() {
        return new Item.Properties().tab(BuildScape.BUILDSCAPE_TAB);
    }
    
    public static final RegistryObject<Item> BLACK_SAND = ITEMS.register("black_sand", 
        () -> new BlockItem(ModBlocks.BLACK_SAND.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> BLUE_SAND = ITEMS.register("blue_sand", 
        () -> new BlockItem(ModBlocks.BLUE_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_SAND = ITEMS.register("green_sand", 
        () -> new BlockItem(ModBlocks.GREEN_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_SAND = ITEMS.register("orange_sand", 
        () -> new BlockItem(ModBlocks.ORANGE_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_SAND = ITEMS.register("pink_sand", 
        () -> new BlockItem(ModBlocks.PINK_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_SAND = ITEMS.register("red_sand", 
        () -> new BlockItem(ModBlocks.RED_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SAND = ITEMS.register("white_sand", 
        () -> new BlockItem(ModBlocks.WHITE_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_SAND = ITEMS.register("yellow_sand", 
        () -> new BlockItem(ModBlocks.YELLOW_SAND.get(), new Item.Properties()));
    
    // Sandstone items
    public static final RegistryObject<Item> BLACK_SANDSTONE = ITEMS.register("black_sandstone", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_SANDSTONE = ITEMS.register("blue_sandstone", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_SANDSTONE = ITEMS.register("green_sandstone", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_SANDSTONE = ITEMS.register("orange_sandstone", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_SANDSTONE = ITEMS.register("pink_sandstone", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_SANDSTONE = ITEMS.register("red_sandstone", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SANDSTONE = ITEMS.register("white_sandstone", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_SANDSTONE = ITEMS.register("yellow_sandstone", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE.get(), new Item.Properties()));
    
    // Smooth sandstone items
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE = ITEMS.register("black_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE = ITEMS.register("blue_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE = ITEMS.register("green_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE = ITEMS.register("orange_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE = ITEMS.register("pink_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE = ITEMS.register("red_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE = ITEMS.register("white_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE = ITEMS.register("yellow_smooth_sandstone", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    // Tile items
    public static final RegistryObject<Item> BLACK_TILES = ITEMS.register("black_tiles", 
        () -> new BlockItem(ModBlocks.BLACK_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_TILES = ITEMS.register("blue_tiles", 
        () -> new BlockItem(ModBlocks.BLUE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BROWN_TILES = ITEMS.register("brown_tiles", 
        () -> new BlockItem(ModBlocks.BROWN_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> CYAN_TILES = ITEMS.register("cyan_tiles", 
        () -> new BlockItem(ModBlocks.CYAN_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GRAY_TILES = ITEMS.register("gray_tiles", 
        () -> new BlockItem(ModBlocks.GRAY_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_TILES = ITEMS.register("green_tiles", 
        () -> new BlockItem(ModBlocks.GREEN_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_TILES = ITEMS.register("light_blue_tiles", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_TILES = ITEMS.register("light_gray_tiles", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIME_TILES = ITEMS.register("lime_tiles", 
        () -> new BlockItem(ModBlocks.LIME_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MAGENTA_TILES = ITEMS.register("magenta_tiles", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_TILES = ITEMS.register("orange_tiles", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_TILES = ITEMS.register("pink_tiles", 
        () -> new BlockItem(ModBlocks.PINK_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PURPLE_TILES = ITEMS.register("purple_tiles", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_TILES = ITEMS.register("red_tiles", 
        () -> new BlockItem(ModBlocks.RED_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_TILES = ITEMS.register("white_tiles", 
        () -> new BlockItem(ModBlocks.WHITE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_TILES = ITEMS.register("yellow_tiles", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES.get(), new Item.Properties()));
    
    // Mosaic glass items
    public static final RegistryObject<Item> BLACK_MOSAIC_GLASS = ITEMS.register("black_mosaic_glass", 
        () -> new BlockItem(ModBlocks.BLACK_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_MOSAIC_GLASS = ITEMS.register("blue_mosaic_glass", 
        () -> new BlockItem(ModBlocks.BLUE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BROWN_MOSAIC_GLASS = ITEMS.register("brown_mosaic_glass", 
        () -> new BlockItem(ModBlocks.BROWN_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> CYAN_MOSAIC_GLASS = ITEMS.register("cyan_mosaic_glass", 
        () -> new BlockItem(ModBlocks.CYAN_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GRAY_MOSAIC_GLASS = ITEMS.register("gray_mosaic_glass", 
        () -> new BlockItem(ModBlocks.GRAY_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_MOSAIC_GLASS = ITEMS.register("green_mosaic_glass", 
        () -> new BlockItem(ModBlocks.GREEN_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_MOSAIC_GLASS = ITEMS.register("light_blue_mosaic_glass", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_MOSAIC_GLASS = ITEMS.register("light_gray_mosaic_glass", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIME_MOSAIC_GLASS = ITEMS.register("lime_mosaic_glass", 
        () -> new BlockItem(ModBlocks.LIME_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MAGENTA_MOSAIC_GLASS = ITEMS.register("magenta_mosaic_glass", 
        () -> new BlockItem(ModBlocks.MAGENTA_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_MOSAIC_GLASS = ITEMS.register("orange_mosaic_glass", 
        () -> new BlockItem(ModBlocks.ORANGE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_MOSAIC_GLASS = ITEMS.register("pink_mosaic_glass", 
        () -> new BlockItem(ModBlocks.PINK_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PURPLE_MOSAIC_GLASS = ITEMS.register("purple_mosaic_glass", 
        () -> new BlockItem(ModBlocks.PURPLE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_MOSAIC_GLASS = ITEMS.register("red_mosaic_glass", 
        () -> new BlockItem(ModBlocks.RED_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_MOSAIC_GLASS = ITEMS.register("white_mosaic_glass", 
        () -> new BlockItem(ModBlocks.WHITE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_MOSAIC_GLASS = ITEMS.register("yellow_mosaic_glass", 
        () -> new BlockItem(ModBlocks.YELLOW_MOSAIC_GLASS.get(), new Item.Properties()));
    
    // Mosaic glass pane items
    public static final RegistryObject<Item> BLACK_MOSAIC_GLASS_PANE = ITEMS.register("black_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.BLACK_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_MOSAIC_GLASS_PANE = ITEMS.register("blue_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.BLUE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BROWN_MOSAIC_GLASS_PANE = ITEMS.register("brown_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.BROWN_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> CYAN_MOSAIC_GLASS_PANE = ITEMS.register("cyan_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.CYAN_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GRAY_MOSAIC_GLASS_PANE = ITEMS.register("gray_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.GRAY_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_MOSAIC_GLASS_PANE = ITEMS.register("green_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.GREEN_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_MOSAIC_GLASS_PANE = ITEMS.register("light_blue_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_MOSAIC_GLASS_PANE = ITEMS.register("light_gray_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIME_MOSAIC_GLASS_PANE = ITEMS.register("lime_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.LIME_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MAGENTA_MOSAIC_GLASS_PANE = ITEMS.register("magenta_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_MOSAIC_GLASS_PANE = ITEMS.register("orange_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_MOSAIC_GLASS_PANE = ITEMS.register("pink_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.PINK_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PURPLE_MOSAIC_GLASS_PANE = ITEMS.register("purple_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_MOSAIC_GLASS_PANE = ITEMS.register("red_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.RED_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_MOSAIC_GLASS_PANE = ITEMS.register("white_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.WHITE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_MOSAIC_GLASS_PANE = ITEMS.register("yellow_mosaic_glass_pane", 
        () -> new BlockItem(ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    // Disabled obsidian glass pane for now
    // public static final RegistryObject<Item> OBSIDIAN_GLASS_PANE = ITEMS.register("obsidian_glass_pane", 
    //     () -> new BlockItem(ModBlocks.OBSIDIAN_GLASS_PANE.get(), new Item.Properties()));
    
    // Copper variant items
    public static final RegistryObject<Item> BIT_CHISELED_COPPER = ITEMS.register("bit_chiseled_copper", 
        () -> new BlockItem(ModBlocks.BIT_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_COPPER_BLOCK = ITEMS.register("bit_copper_block", 
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_COPPER_BULB = ITEMS.register("bit_copper_bulb", 
        () -> new BlockItem(ModBlocks.BIT_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_COPPER_GRATE = ITEMS.register("bit_copper_grate", 
        () -> new BlockItem(ModBlocks.BIT_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_CUT_COPPER = ITEMS.register("bit_cut_copper", 
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER.get(), new Item.Properties()));
    
    // Exposed copper items
    public static final RegistryObject<Item> BIT_EXPOSED_CHISELED_COPPER = ITEMS.register("bit_exposed_chiseled_copper", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK = ITEMS.register("bit_exposed_copper_block", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BULB = ITEMS.register("bit_exposed_copper_bulb", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_GRATE = ITEMS.register("bit_exposed_copper_grate", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER = ITEMS.register("bit_exposed_cut_copper", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER.get(), new Item.Properties()));
    
    // Weathered copper items
    public static final RegistryObject<Item> BIT_WEATHERED_CHISELED_COPPER = ITEMS.register("bit_weathered_chiseled_copper", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK = ITEMS.register("bit_weathered_copper_block", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BULB = ITEMS.register("bit_weathered_copper_bulb", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_GRATE = ITEMS.register("bit_weathered_copper_grate", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER = ITEMS.register("bit_weathered_cut_copper", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER.get(), new Item.Properties()));
    
    // Oxidized copper items
    public static final RegistryObject<Item> BIT_OXIDIZED_CHISELED_COPPER = ITEMS.register("bit_oxidized_chiseled_copper", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK = ITEMS.register("bit_oxidized_copper_block", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BULB = ITEMS.register("bit_oxidized_copper_bulb", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_GRATE = ITEMS.register("bit_oxidized_copper_grate", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER = ITEMS.register("bit_oxidized_cut_copper", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER.get(), new Item.Properties()));
    
    // Tuff variant items
    public static final RegistryObject<Item> BIT_CHISELED_TUFF = ITEMS.register("bit_chiseled_tuff", 
        () -> new BlockItem(ModBlocks.BIT_CHISELED_TUFF.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_CHISELED_TUFF_BRICKS = ITEMS.register("bit_chiseled_tuff_bricks", 
        () -> new BlockItem(ModBlocks.BIT_CHISELED_TUFF_BRICKS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_POLISHED_TUFF = ITEMS.register("bit_polished_tuff", 
        () -> new BlockItem(ModBlocks.BIT_POLISHED_TUFF.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_POLISHED_TUFF_STAIRS = ITEMS.register("bit_polished_tuff_stairs",
        () -> new BlockItem(ModBlocks.BIT_POLISHED_TUFF_STAIRS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_POLISHED_TUFF_SLAB = ITEMS.register("bit_polished_tuff_slab",
        () -> new BlockItem(ModBlocks.BIT_POLISHED_TUFF_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_POLISHED_TUFF_WALL = ITEMS.register("bit_polished_tuff_wall",
        () -> new BlockItem(ModBlocks.BIT_POLISHED_TUFF_WALL.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_TUFF_BRICKS = ITEMS.register("bit_tuff_bricks", 
        () -> new BlockItem(ModBlocks.BIT_TUFF_BRICKS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_TUFF_BRICKS_STAIRS = ITEMS.register("bit_tuff_bricks_stairs",
        () -> new BlockItem(ModBlocks.BIT_TUFF_BRICKS_STAIRS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_TUFF_BRICKS_SLAB = ITEMS.register("bit_tuff_bricks_slab",
        () -> new BlockItem(ModBlocks.BIT_TUFF_BRICKS_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_TUFF_BRICKS_WALL = ITEMS.register("bit_tuff_bricks_wall",
        () -> new BlockItem(ModBlocks.BIT_TUFF_BRICKS_WALL.get(), new Item.Properties()));
    
    // Sandstone stairs items
    public static final RegistryObject<Item> BLACK_SANDSTONE_STAIRS = ITEMS.register("black_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SANDSTONE_STAIRS = ITEMS.register("blue_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SANDSTONE_STAIRS = ITEMS.register("green_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SANDSTONE_STAIRS = ITEMS.register("orange_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SANDSTONE_STAIRS = ITEMS.register("pink_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_STAIRS = ITEMS.register("red_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SANDSTONE_STAIRS = ITEMS.register("white_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SANDSTONE_STAIRS = ITEMS.register("yellow_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE_STAIRS.get(), new Item.Properties()));
    
    // Sandstone slab items
    public static final RegistryObject<Item> BLACK_SANDSTONE_SLAB = ITEMS.register("black_sandstone_slab", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SANDSTONE_SLAB = ITEMS.register("blue_sandstone_slab", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SANDSTONE_SLAB = ITEMS.register("green_sandstone_slab", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SANDSTONE_SLAB = ITEMS.register("orange_sandstone_slab", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SANDSTONE_SLAB = ITEMS.register("pink_sandstone_slab", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_SLAB = ITEMS.register("red_sandstone_slab", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SANDSTONE_SLAB = ITEMS.register("white_sandstone_slab", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SANDSTONE_SLAB = ITEMS.register("yellow_sandstone_slab", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE_SLAB.get(), new Item.Properties()));
    
    // Sandstone wall items
    public static final RegistryObject<Item> BLACK_SANDSTONE_WALL = ITEMS.register("black_sandstone_wall", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SANDSTONE_WALL = ITEMS.register("blue_sandstone_wall", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SANDSTONE_WALL = ITEMS.register("green_sandstone_wall", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SANDSTONE_WALL = ITEMS.register("orange_sandstone_wall", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SANDSTONE_WALL = ITEMS.register("pink_sandstone_wall", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_WALL = ITEMS.register("red_sandstone_wall", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SANDSTONE_WALL = ITEMS.register("white_sandstone_wall", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SANDSTONE_WALL = ITEMS.register("yellow_sandstone_wall", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE_WALL.get(), new Item.Properties()));
    
    // Smooth sandstone wall items
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE_WALL = ITEMS.register("white_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE_WALL = ITEMS.register("black_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE_WALL = ITEMS.register("red_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE_WALL = ITEMS.register("orange_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE_WALL = ITEMS.register("yellow_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE_WALL = ITEMS.register("green_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE_WALL = ITEMS.register("blue_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE_WALL = ITEMS.register("pink_smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_SANDSTONE_WALL = ITEMS.register("smooth_sandstone_wall", 
        () -> new BlockItem(ModBlocks.SMOOTH_SANDSTONE_WALL.get(), new Item.Properties()));
    
    // Smooth sandstone slab items
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE_SLAB = ITEMS.register("black_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE_SLAB = ITEMS.register("blue_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE_SLAB = ITEMS.register("green_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE_SLAB = ITEMS.register("orange_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE_SLAB = ITEMS.register("pink_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE_SLAB = ITEMS.register("red_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE_SLAB = ITEMS.register("white_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE_SLAB = ITEMS.register("yellow_smooth_sandstone_slab", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    
    // Smooth sandstone stairs items
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("black_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("blue_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("green_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("orange_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("pink_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("red_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("white_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE_STAIRS = ITEMS.register("yellow_smooth_sandstone_stairs", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    
    // Tiles stairs items
    public static final RegistryObject<Item> BLACK_TILES_STAIRS = ITEMS.register("black_tiles_stairs", 
        () -> new BlockItem(ModBlocks.BLACK_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_STAIRS = ITEMS.register("blue_tiles_stairs", 
        () -> new BlockItem(ModBlocks.BLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TILES_STAIRS = ITEMS.register("brown_tiles_stairs", 
        () -> new BlockItem(ModBlocks.BROWN_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TILES_STAIRS = ITEMS.register("cyan_tiles_stairs", 
        () -> new BlockItem(ModBlocks.CYAN_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TILES_STAIRS = ITEMS.register("gray_tiles_stairs", 
        () -> new BlockItem(ModBlocks.GRAY_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TILES_STAIRS = ITEMS.register("green_tiles_stairs", 
        () -> new BlockItem(ModBlocks.GREEN_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_STAIRS = ITEMS.register("light_blue_tiles_stairs", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_STAIRS = ITEMS.register("light_gray_tiles_stairs", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_TILES_STAIRS = ITEMS.register("lime_tiles_stairs", 
        () -> new BlockItem(ModBlocks.LIME_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TILES_STAIRS = ITEMS.register("magenta_tiles_stairs", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_STAIRS = ITEMS.register("orange_tiles_stairs", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_TILES_STAIRS = ITEMS.register("pink_tiles_stairs", 
        () -> new BlockItem(ModBlocks.PINK_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TILES_STAIRS = ITEMS.register("purple_tiles_stairs", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_STAIRS = ITEMS.register("red_tiles_stairs", 
        () -> new BlockItem(ModBlocks.RED_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_STAIRS = ITEMS.register("white_tiles_stairs", 
        () -> new BlockItem(ModBlocks.WHITE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_STAIRS = ITEMS.register("yellow_tiles_stairs", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES_STAIRS.get(), new Item.Properties()));
    
    // Tiles slab items
    public static final RegistryObject<Item> BLACK_TILES_SLAB = ITEMS.register("black_tiles_slab", 
        () -> new BlockItem(ModBlocks.BLACK_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_SLAB = ITEMS.register("blue_tiles_slab", 
        () -> new BlockItem(ModBlocks.BLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TILES_SLAB = ITEMS.register("brown_tiles_slab", 
        () -> new BlockItem(ModBlocks.BROWN_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TILES_SLAB = ITEMS.register("cyan_tiles_slab", 
        () -> new BlockItem(ModBlocks.CYAN_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TILES_SLAB = ITEMS.register("gray_tiles_slab", 
        () -> new BlockItem(ModBlocks.GRAY_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TILES_SLAB = ITEMS.register("green_tiles_slab", 
        () -> new BlockItem(ModBlocks.GREEN_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_SLAB = ITEMS.register("light_blue_tiles_slab", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_SLAB = ITEMS.register("light_gray_tiles_slab", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_TILES_SLAB = ITEMS.register("lime_tiles_slab", 
        () -> new BlockItem(ModBlocks.LIME_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TILES_SLAB = ITEMS.register("magenta_tiles_slab", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_SLAB = ITEMS.register("orange_tiles_slab", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_TILES_SLAB = ITEMS.register("pink_tiles_slab", 
        () -> new BlockItem(ModBlocks.PINK_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TILES_SLAB = ITEMS.register("purple_tiles_slab", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_SLAB = ITEMS.register("red_tiles_slab", 
        () -> new BlockItem(ModBlocks.RED_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_SLAB = ITEMS.register("white_tiles_slab", 
        () -> new BlockItem(ModBlocks.WHITE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_SLAB = ITEMS.register("yellow_tiles_slab", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES_SLAB.get(), new Item.Properties()));
    
    // Tiles wall items
    public static final RegistryObject<Item> BLACK_TILES_WALL = ITEMS.register("black_tiles_wall", 
        () -> new BlockItem(ModBlocks.BLACK_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_WALL = ITEMS.register("blue_tiles_wall", 
        () -> new BlockItem(ModBlocks.BLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TILES_WALL = ITEMS.register("brown_tiles_wall", 
        () -> new BlockItem(ModBlocks.BROWN_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TILES_WALL = ITEMS.register("cyan_tiles_wall", 
        () -> new BlockItem(ModBlocks.CYAN_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TILES_WALL = ITEMS.register("gray_tiles_wall", 
        () -> new BlockItem(ModBlocks.GRAY_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TILES_WALL = ITEMS.register("green_tiles_wall", 
        () -> new BlockItem(ModBlocks.GREEN_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_WALL = ITEMS.register("light_blue_tiles_wall", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_WALL = ITEMS.register("light_gray_tiles_wall", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_TILES_WALL = ITEMS.register("lime_tiles_wall", 
        () -> new BlockItem(ModBlocks.LIME_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TILES_WALL = ITEMS.register("magenta_tiles_wall", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_WALL = ITEMS.register("orange_tiles_wall", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_TILES_WALL = ITEMS.register("pink_tiles_wall", 
        () -> new BlockItem(ModBlocks.PINK_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TILES_WALL = ITEMS.register("purple_tiles_wall", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_WALL = ITEMS.register("red_tiles_wall", 
        () -> new BlockItem(ModBlocks.RED_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_WALL = ITEMS.register("white_tiles_wall", 
        () -> new BlockItem(ModBlocks.WHITE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_WALL = ITEMS.register("yellow_tiles_wall", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES_WALL.get(), new Item.Properties()));
    
    // Vanilla block variants
    public static final RegistryObject<Item> POLISHED_BASALT_STAIRS = ITEMS.register("polished_basalt_stairs",
        () -> new BlockItem(ModBlocks.POLISHED_BASALT_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BASALT_SLAB = ITEMS.register("polished_basalt_slab",
        () -> new BlockItem(ModBlocks.POLISHED_BASALT_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BASALT_WALL = ITEMS.register("polished_basalt_wall",
        () -> new BlockItem(ModBlocks.POLISHED_BASALT_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_STAIRS = ITEMS.register("dripstone_block_stairs",
        () -> new BlockItem(ModBlocks.DRIPSTONE_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_SLAB = ITEMS.register("dripstone_block_slab",
        () -> new BlockItem(ModBlocks.DRIPSTONE_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_WALL = ITEMS.register("dripstone_block_wall",
        () -> new BlockItem(ModBlocks.DRIPSTONE_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_STAIRS = ITEMS.register("end_stone_stairs",
        () -> new BlockItem(ModBlocks.END_STONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_SLAB = ITEMS.register("end_stone_slab",
        () -> new BlockItem(ModBlocks.END_STONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_WALL = ITEMS.register("end_stone_wall",
        () -> new BlockItem(ModBlocks.END_STONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> STONE_WALL = ITEMS.register("stone_wall",
        () -> new BlockItem(ModBlocks.STONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_STAIRS = ITEMS.register("quartz_bricks_stairs",
        () -> new BlockItem(ModBlocks.QUARTZ_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_SLAB = ITEMS.register("quartz_bricks_slab",
        () -> new BlockItem(ModBlocks.QUARTZ_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_WALL = ITEMS.register("quartz_bricks_wall",
        () -> new BlockItem(ModBlocks.QUARTZ_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_STAIRS = ITEMS.register("calcite_stairs",
        () -> new BlockItem(ModBlocks.CALCITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_SLAB = ITEMS.register("calcite_slab",
        () -> new BlockItem(ModBlocks.CALCITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_WALL = ITEMS.register("calcite_wall",
        () -> new BlockItem(ModBlocks.CALCITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_SLAB = ITEMS.register("bedrock_slab",
        () -> new BlockItem(ModBlocks.BEDROCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_STAIRS = ITEMS.register("bedrock_stairs",
        () -> new BlockItem(ModBlocks.BEDROCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_WALL = ITEMS.register("bedrock_wall",
        () -> new BlockItem(ModBlocks.BEDROCK_WALL.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BEDROCK_PANE = ITEMS.register("bedrock_pane",
        () -> new BlockItem(ModBlocks.BEDROCK_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> OBSIDIAN_STAIRS = ITEMS.register("obsidian_stairs",
        () -> new BlockItem(ModBlocks.OBSIDIAN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SLAB = ITEMS.register("obsidian_slab",
        () -> new BlockItem(ModBlocks.OBSIDIAN_SLAB.get(), new Item.Properties()));
    // Disabled obsidian wall for now
    // public static final RegistryObject<Item> OBSIDIAN_WALL = ITEMS.register("obsidian_wall",
    //     () -> new BlockItem(ModBlocks.OBSIDIAN_WALL.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PRISMARINE_BRICKS_WALL = ITEMS.register("prismarine_bricks_wall",
        () -> new BlockItem(ModBlocks.PRISMARINE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_PRISMARINE_WALL = ITEMS.register("dark_prismarine_wall",
        () -> new BlockItem(ModBlocks.DARK_PRISMARINE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BLOCK_WALL = ITEMS.register("quartz_block_wall",
        () -> new BlockItem(ModBlocks.QUARTZ_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_WALL = ITEMS.register("smooth_quartz_wall",
        () -> new BlockItem(ModBlocks.SMOOTH_QUARTZ_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_STAIRS = ITEMS.register("smooth_basalt_stairs",
        () -> new BlockItem(ModBlocks.SMOOTH_BASALT_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_SLAB = ITEMS.register("smooth_basalt_slab",
        () -> new BlockItem(ModBlocks.SMOOTH_BASALT_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSS_BLOCK_SLAB = ITEMS.register("moss_block_slab",
        () -> new BlockItem(ModBlocks.MOSS_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BLOCK_SLAB = ITEMS.register("amethyst_block_slab",
        () -> new BlockItem(ModBlocks.AMETHYST_BLOCK_SLAB.get(), new Item.Properties()));
    // Bit copper variants
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_STAIRS = ITEMS.register("bit_copper_block_stairs",
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_SLAB = ITEMS.register("bit_copper_block_slab",
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_WALL = ITEMS.register("bit_copper_block_wall",
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_STAIRS = ITEMS.register("bit_exposed_copper_block_stairs",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_SLAB = ITEMS.register("bit_exposed_copper_block_slab",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_WALL = ITEMS.register("bit_exposed_copper_block_wall",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_STAIRS = ITEMS.register("bit_weathered_copper_block_stairs",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_SLAB = ITEMS.register("bit_weathered_copper_block_slab",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_WALL = ITEMS.register("bit_weathered_copper_block_wall",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_STAIRS = ITEMS.register("bit_oxidized_copper_block_stairs",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_SLAB = ITEMS.register("bit_oxidized_copper_block_slab",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_WALL = ITEMS.register("bit_oxidized_copper_block_wall",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_CUT_COPPER_STAIRS = ITEMS.register("bit_cut_copper_stairs",
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_CUT_COPPER_SLAB = ITEMS.register("bit_cut_copper_slab",
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_CUT_COPPER_WALL = ITEMS.register("bit_cut_copper_wall",
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_STAIRS = ITEMS.register("bit_exposed_cut_copper_stairs",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_SLAB = ITEMS.register("bit_exposed_cut_copper_slab",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_WALL = ITEMS.register("bit_exposed_cut_copper_wall",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_STAIRS = ITEMS.register("bit_weathered_cut_copper_stairs",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_SLAB = ITEMS.register("bit_weathered_cut_copper_slab",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_WALL = ITEMS.register("bit_weathered_cut_copper_wall",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_STAIRS = ITEMS.register("bit_oxidized_cut_copper_stairs",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_SLAB = ITEMS.register("bit_oxidized_cut_copper_slab",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_WALL = ITEMS.register("bit_oxidized_cut_copper_wall",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER_WALL.get(), new Item.Properties()));
    
    // Mossy calcite items
    public static final RegistryObject<Item> MOSSY_CALCITE = ITEMS.register("mossy_calcite",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_CALCITE_STAIRS = ITEMS.register("mossy_calcite_stairs",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_CALCITE_SLAB = ITEMS.register("mossy_calcite_slab",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_CALCITE_WALL = ITEMS.register("mossy_calcite_wall",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE_WALL.get(), new Item.Properties()));
    
    // Grass, podzol, dirt, mud, and mycelium slab items
    // public static final RegistryObject<Item> GRASS_BLOCK_SLAB = ITEMS.register("grass_block_slab",
    //     () -> new BlockItem(ModBlocks.GRASS_BLOCK_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PODZOL_SLAB = ITEMS.register("podzol_slab",
        () -> new BlockItem(ModBlocks.PODZOL_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> DIRT_SLAB = ITEMS.register("dirt_slab",
        () -> new BlockItem(ModBlocks.DIRT_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MUD = ITEMS.register("mud",
        () -> new BlockItem(ModBlocks.MUD.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MUD_SLAB = ITEMS.register("mud_slab",
        () -> new BlockItem(ModBlocks.MUD_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MYCELIUM_SLAB = ITEMS.register("mycelium_slab",
        () -> new BlockItem(ModBlocks.MYCELIUM_SLAB.get(), new Item.Properties()));
    
    // Moss layers and overlay items
    public static final RegistryObject<Item> MOSS_LAYERS = ITEMS.register("moss_layers",
        () -> new BlockItem(ModBlocks.MOSS_LAYERS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MOSS_OVERLAY = ITEMS.register("moss_overlay",
        () -> new BlockItem(ModBlocks.MOSS_OVERLAY.get(), new Item.Properties()));
    
    // Concrete stairs items
    public static final RegistryObject<Item> BLACK_CONCRETE_STAIRS = ITEMS.register("black_concrete_stairs",
        () -> new BlockItem(ModBlocks.BLACK_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CONCRETE_STAIRS = ITEMS.register("blue_concrete_stairs",
        () -> new BlockItem(ModBlocks.BLUE_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CONCRETE_STAIRS = ITEMS.register("brown_concrete_stairs",
        () -> new BlockItem(ModBlocks.BROWN_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CONCRETE_STAIRS = ITEMS.register("cyan_concrete_stairs",
        () -> new BlockItem(ModBlocks.CYAN_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_CONCRETE_STAIRS = ITEMS.register("gray_concrete_stairs",
        () -> new BlockItem(ModBlocks.GRAY_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CONCRETE_STAIRS = ITEMS.register("green_concrete_stairs",
        () -> new BlockItem(ModBlocks.GREEN_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("light_blue_concrete_stairs",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("light_gray_concrete_stairs",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_CONCRETE_STAIRS = ITEMS.register("lime_concrete_stairs",
        () -> new BlockItem(ModBlocks.LIME_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_STAIRS = ITEMS.register("magenta_concrete_stairs",
        () -> new BlockItem(ModBlocks.MAGENTA_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_STAIRS = ITEMS.register("orange_concrete_stairs",
        () -> new BlockItem(ModBlocks.ORANGE_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_CONCRETE_STAIRS = ITEMS.register("pink_concrete_stairs",
        () -> new BlockItem(ModBlocks.PINK_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_STAIRS = ITEMS.register("purple_concrete_stairs",
        () -> new BlockItem(ModBlocks.PURPLE_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_CONCRETE_STAIRS = ITEMS.register("red_concrete_stairs",
        () -> new BlockItem(ModBlocks.RED_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_STAIRS = ITEMS.register("white_concrete_stairs",
        () -> new BlockItem(ModBlocks.WHITE_CONCRETE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_STAIRS = ITEMS.register("yellow_concrete_stairs",
        () -> new BlockItem(ModBlocks.YELLOW_CONCRETE_STAIRS.get(), new Item.Properties()));
    
    // Concrete wall items
    public static final RegistryObject<Item> WHITE_CONCRETE_WALL = ITEMS.register("white_concrete_wall",
        () -> new BlockItem(ModBlocks.WHITE_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("light_gray_concrete_wall",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_CONCRETE_WALL = ITEMS.register("gray_concrete_wall",
        () -> new BlockItem(ModBlocks.GRAY_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CONCRETE_WALL = ITEMS.register("black_concrete_wall",
        () -> new BlockItem(ModBlocks.BLACK_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CONCRETE_WALL = ITEMS.register("brown_concrete_wall",
        () -> new BlockItem(ModBlocks.BROWN_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_CONCRETE_WALL = ITEMS.register("red_concrete_wall",
        () -> new BlockItem(ModBlocks.RED_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_WALL = ITEMS.register("orange_concrete_wall",
        () -> new BlockItem(ModBlocks.ORANGE_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_WALL = ITEMS.register("yellow_concrete_wall",
        () -> new BlockItem(ModBlocks.YELLOW_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_CONCRETE_WALL = ITEMS.register("lime_concrete_wall",
        () -> new BlockItem(ModBlocks.LIME_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CONCRETE_WALL = ITEMS.register("green_concrete_wall",
        () -> new BlockItem(ModBlocks.GREEN_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CONCRETE_WALL = ITEMS.register("cyan_concrete_wall",
        () -> new BlockItem(ModBlocks.CYAN_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("light_blue_concrete_wall",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CONCRETE_WALL = ITEMS.register("blue_concrete_wall",
        () -> new BlockItem(ModBlocks.BLUE_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_WALL = ITEMS.register("purple_concrete_wall",
        () -> new BlockItem(ModBlocks.PURPLE_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_WALL = ITEMS.register("magenta_concrete_wall",
        () -> new BlockItem(ModBlocks.MAGENTA_CONCRETE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_CONCRETE_WALL = ITEMS.register("pink_concrete_wall",
        () -> new BlockItem(ModBlocks.PINK_CONCRETE_WALL.get(), new Item.Properties()));
    
    // Concrete slab items
    public static final RegistryObject<Item> BLACK_CONCRETE_SLAB = ITEMS.register("black_concrete_slab",
        () -> new BlockItem(ModBlocks.BLACK_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SLAB = ITEMS.register("blue_concrete_slab",
        () -> new BlockItem(ModBlocks.BLUE_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SLAB = ITEMS.register("brown_concrete_slab",
        () -> new BlockItem(ModBlocks.BROWN_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SLAB = ITEMS.register("cyan_concrete_slab",
        () -> new BlockItem(ModBlocks.CYAN_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SLAB = ITEMS.register("gray_concrete_slab",
        () -> new BlockItem(ModBlocks.GRAY_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SLAB = ITEMS.register("green_concrete_slab",
        () -> new BlockItem(ModBlocks.GREEN_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("light_blue_concrete_slab",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("light_gray_concrete_slab",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_CONCRETE_SLAB = ITEMS.register("lime_concrete_slab",
        () -> new BlockItem(ModBlocks.LIME_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SLAB = ITEMS.register("magenta_concrete_slab",
        () -> new BlockItem(ModBlocks.MAGENTA_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SLAB = ITEMS.register("orange_concrete_slab",
        () -> new BlockItem(ModBlocks.ORANGE_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_CONCRETE_SLAB = ITEMS.register("pink_concrete_slab",
        () -> new BlockItem(ModBlocks.PINK_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SLAB = ITEMS.register("purple_concrete_slab",
        () -> new BlockItem(ModBlocks.PURPLE_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_CONCRETE_SLAB = ITEMS.register("red_concrete_slab",
        () -> new BlockItem(ModBlocks.RED_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CONCRETE_SLAB = ITEMS.register("white_concrete_slab",
        () -> new BlockItem(ModBlocks.WHITE_CONCRETE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SLAB = ITEMS.register("yellow_concrete_slab",
        () -> new BlockItem(ModBlocks.YELLOW_CONCRETE_SLAB.get(), new Item.Properties()));
    
    // Mushroom shelves items
    public static final RegistryObject<Item> BROWN_MUSHROOM_SHELVES = ITEMS.register("brown_mushroom_shelves",
        () -> new BlockItem(ModBlocks.BROWN_MUSHROOM_SHELVES.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> RED_MUSHROOM_SHELVES = ITEMS.register("red_mushroom_shelves",
        () -> new BlockItem(ModBlocks.RED_MUSHROOM_SHELVES.get(), createBlockItemProperties()));
    
    // Quartz pillar item (renamed original)
    public static final RegistryObject<Item> QUARTZ_PILLAR = ITEMS.register("quartz_pillar",
        () -> new BlockItem(ModBlocks.QUARTZ_PILLAR.get(), createBlockItemProperties()));

    // Stone pillar item
    public static final RegistryObject<Item> STONE_PILLAR = ITEMS.register("stone_pillar",
        () -> new BlockItem(ModBlocks.STONE_PILLAR.get(), createBlockItemProperties()));

    // Deepslate pillar item
    public static final RegistryObject<Item> DEEPSLATE_PILLAR = ITEMS.register("deepslate_pillar",
        () -> new BlockItem(ModBlocks.DEEPSLATE_PILLAR.get(), createBlockItemProperties()));

    // Mossy pillar item
    public static final RegistryObject<Item> MOSSY_PILLAR = ITEMS.register("mossy_pillar",
        () -> new BlockItem(ModBlocks.MOSSY_PILLAR.get(), createBlockItemProperties()));
    
    // Decorated Pot - Base
    public static final RegistryObject<Item> DECORATED_POT = ITEMS.register("decorated_pot",
        () -> new BlockItem(ModBlocks.DECORATED_POT.get(), createBlockItemProperties()));
    
    // Decorated Pot - Color Variants
    public static final RegistryObject<Item> BLACK_DECORATED_POT = ITEMS.register("black_decorated_pot",
        () -> new BlockItem(ModBlocks.BLACK_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_DECORATED_POT = ITEMS.register("blue_decorated_pot",
        () -> new BlockItem(ModBlocks.BLUE_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_DECORATED_POT = ITEMS.register("brown_decorated_pot",
        () -> new BlockItem(ModBlocks.BROWN_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_DECORATED_POT = ITEMS.register("cyan_decorated_pot",
        () -> new BlockItem(ModBlocks.CYAN_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_DECORATED_POT = ITEMS.register("gray_decorated_pot",
        () -> new BlockItem(ModBlocks.GRAY_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_DECORATED_POT = ITEMS.register("green_decorated_pot",
        () -> new BlockItem(ModBlocks.GREEN_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_DECORATED_POT = ITEMS.register("light_blue_decorated_pot",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_DECORATED_POT = ITEMS.register("light_gray_decorated_pot",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_DECORATED_POT = ITEMS.register("lime_decorated_pot",
        () -> new BlockItem(ModBlocks.LIME_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_DECORATED_POT = ITEMS.register("magenta_decorated_pot",
        () -> new BlockItem(ModBlocks.MAGENTA_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_DECORATED_POT = ITEMS.register("orange_decorated_pot",
        () -> new BlockItem(ModBlocks.ORANGE_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_DECORATED_POT = ITEMS.register("pink_decorated_pot",
        () -> new BlockItem(ModBlocks.PINK_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_DECORATED_POT = ITEMS.register("purple_decorated_pot",
        () -> new BlockItem(ModBlocks.PURPLE_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_DECORATED_POT = ITEMS.register("red_decorated_pot",
        () -> new BlockItem(ModBlocks.RED_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> WHITE_DECORATED_POT = ITEMS.register("white_decorated_pot",
        () -> new BlockItem(ModBlocks.WHITE_DECORATED_POT.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_DECORATED_POT = ITEMS.register("yellow_decorated_pot",
        () -> new BlockItem(ModBlocks.YELLOW_DECORATED_POT.get(), createBlockItemProperties()));
    
    // Wool layers items
    public static final RegistryObject<Item> BLACK_WOOL_LAYERS = ITEMS.register("black_wool_layers",
        () -> new BlockItem(ModBlocks.BLACK_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_WOOL_LAYERS = ITEMS.register("blue_wool_layers",
        () -> new BlockItem(ModBlocks.BLUE_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_WOOL_LAYERS = ITEMS.register("brown_wool_layers",
        () -> new BlockItem(ModBlocks.BROWN_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_WOOL_LAYERS = ITEMS.register("cyan_wool_layers",
        () -> new BlockItem(ModBlocks.CYAN_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_WOOL_LAYERS = ITEMS.register("gray_wool_layers",
        () -> new BlockItem(ModBlocks.GRAY_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_WOOL_LAYERS = ITEMS.register("green_wool_layers",
        () -> new BlockItem(ModBlocks.GREEN_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_WOOL_LAYERS = ITEMS.register("light_blue_wool_layers",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_WOOL_LAYERS = ITEMS.register("light_gray_wool_layers",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_WOOL_LAYERS = ITEMS.register("lime_wool_layers",
        () -> new BlockItem(ModBlocks.LIME_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_WOOL_LAYERS = ITEMS.register("magenta_wool_layers",
        () -> new BlockItem(ModBlocks.MAGENTA_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_WOOL_LAYERS = ITEMS.register("orange_wool_layers",
        () -> new BlockItem(ModBlocks.ORANGE_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_WOOL_LAYERS = ITEMS.register("pink_wool_layers",
        () -> new BlockItem(ModBlocks.PINK_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_WOOL_LAYERS = ITEMS.register("purple_wool_layers",
        () -> new BlockItem(ModBlocks.PURPLE_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_WOOL_LAYERS = ITEMS.register("red_wool_layers",
        () -> new BlockItem(ModBlocks.RED_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> WHITE_WOOL_LAYERS = ITEMS.register("white_wool_layers",
        () -> new BlockItem(ModBlocks.WHITE_WOOL_LAYERS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_WOOL_LAYERS = ITEMS.register("yellow_wool_layers",
        () -> new BlockItem(ModBlocks.YELLOW_WOOL_LAYERS.get(), createBlockItemProperties()));
    
    // Hay bale slab
    public static final RegistryObject<Item> HAY_BALE_SLAB = ITEMS.register("hay_bale_slab",
        () -> new BlockItem(ModBlocks.HAY_BALE_SLAB.get(), createBlockItemProperties()));
    
    // Bamboo blocks
    public static final RegistryObject<Item> BAMBOO_BLOCK = ITEMS.register("bamboo_block",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK = ITEMS.register("stripped_bamboo_block",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK.get(), createBlockItemProperties()));
    
    // Bamboo block variants
    public static final RegistryObject<Item> BAMBOO_BLOCK_SLAB = ITEMS.register("bamboo_block_slab",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_STAIRS = ITEMS.register("bamboo_block_stairs",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_FENCE = ITEMS.register("bamboo_block_fence",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_FENCE_GATE = ITEMS.register("bamboo_block_fence_gate",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_PRESSURE_PLATE = ITEMS.register("bamboo_block_pressure_plate",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_BUTTON = ITEMS.register("bamboo_block_button",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_BUTTON.get(), createBlockItemProperties()));
    
    // Stripped bamboo block variants
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_SLAB = ITEMS.register("stripped_bamboo_block_slab",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_STAIRS = ITEMS.register("stripped_bamboo_block_stairs",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_FENCE = ITEMS.register("stripped_bamboo_block_fence",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = ITEMS.register("stripped_bamboo_block_fence_gate",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_PRESSURE_PLATE = ITEMS.register("stripped_bamboo_block_pressure_plate",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_BUTTON = ITEMS.register("stripped_bamboo_block_button",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_BUTTON.get(), createBlockItemProperties()));
    
    // Climbable chains
    public static final RegistryObject<Item> DIAMOND_CHAIN = ITEMS.register("diamond_chain",
        () -> new BlockItem(ModBlocks.DIAMOND_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GOLD_CHAIN = ITEMS.register("gold_chain",
        () -> new BlockItem(ModBlocks.GOLD_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> EMERALD_CHAIN = ITEMS.register("emerald_chain",
        () -> new BlockItem(ModBlocks.EMERALD_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ANCIENT_STEEL_CHAIN = ITEMS.register("ancient_steel_chain",
        () -> new BlockItem(ModBlocks.ANCIENT_STEEL_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> NETHERITE_CHAIN = ITEMS.register("netherite_chain",
        () -> new BlockItem(ModBlocks.NETHERITE_CHAIN.get(), createBlockItemProperties()));
    
    // Large chain items
    public static final RegistryObject<Item> LARGE_IRON_CHAIN = ITEMS.register("large_iron_chain",
        () -> new BlockItem(ModBlocks.LARGE_IRON_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LARGE_GOLD_CHAIN = ITEMS.register("large_gold_chain",
        () -> new BlockItem(ModBlocks.LARGE_GOLD_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LARGE_DIAMOND_CHAIN = ITEMS.register("large_diamond_chain",
        () -> new BlockItem(ModBlocks.LARGE_DIAMOND_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LARGE_EMERALD_CHAIN = ITEMS.register("large_emerald_chain",
        () -> new BlockItem(ModBlocks.LARGE_EMERALD_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LARGE_ANCIENT_STEEL_CHAIN = ITEMS.register("large_ancient_steel_chain",
        () -> new BlockItem(ModBlocks.LARGE_ANCIENT_STEEL_CHAIN.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LARGE_NETHERITE_CHAIN = ITEMS.register("large_netherite_chain",
        () -> new BlockItem(ModBlocks.LARGE_NETHERITE_CHAIN.get(), createBlockItemProperties()));
    
    // Wood walls
    public static final RegistryObject<Item> OAK_WOOD_WALL = ITEMS.register("oak_wood_wall",
        () -> new BlockItem(ModBlocks.OAK_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> SPRUCE_WOOD_WALL = ITEMS.register("spruce_wood_wall",
        () -> new BlockItem(ModBlocks.SPRUCE_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BIRCH_WOOD_WALL = ITEMS.register("birch_wood_wall",
        () -> new BlockItem(ModBlocks.BIRCH_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> DARK_OAK_WOOD_WALL = ITEMS.register("dark_oak_wood_wall",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> JUNGLE_WOOD_WALL = ITEMS.register("jungle_wood_wall",
        () -> new BlockItem(ModBlocks.JUNGLE_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ACACIA_WOOD_WALL = ITEMS.register("acacia_wood_wall",
        () -> new BlockItem(ModBlocks.ACACIA_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BAMBOO_BLOCK_WALL = ITEMS.register("bamboo_block_wall",
        () -> new BlockItem(ModBlocks.BAMBOO_BLOCK_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_OAK_WOOD_WALL = ITEMS.register("stripped_oak_wood_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_OAK_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_WOOD_WALL = ITEMS.register("stripped_spruce_wood_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_SPRUCE_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_WOOD_WALL = ITEMS.register("stripped_birch_wood_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_BIRCH_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_WOOD_WALL = ITEMS.register("stripped_dark_oak_wood_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_DARK_OAK_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_WOOD_WALL = ITEMS.register("stripped_jungle_wood_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_JUNGLE_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_WOOD_WALL = ITEMS.register("stripped_acacia_wood_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_ACACIA_WOOD_WALL.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BLOCK_WALL = ITEMS.register("stripped_bamboo_block_wall",
        () -> new BlockItem(ModBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get(), createBlockItemProperties()));
    
    // Ashpen Plank Family - White (Default)
    public static final RegistryObject<Item> ASHPEN_WHITE_PLANKS = ITEMS.register("ashpen_white_planks",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ASHPEN_WHITE_STAIRS = ITEMS.register("ashpen_white_stairs",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ASHPEN_WHITE_SLAB = ITEMS.register("ashpen_white_slab",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ASHPEN_WHITE_FENCE = ITEMS.register("ashpen_white_fence",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ASHPEN_WHITE_FENCE_GATE = ITEMS.register("ashpen_white_fence_gate",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ASHPEN_WHITE_PRESSURE_PLATE = ITEMS.register("ashpen_white_pressure_plate",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ASHPEN_WHITE_BUTTON = ITEMS.register("ashpen_white_button",
        () -> new BlockItem(ModBlocks.ASHPEN_WHITE_BUTTON.get(), createBlockItemProperties()));
    
    // Ashpen Plank Family - Colored Variants
    public static final RegistryObject<Item> BLACK_ASHPEN_PLANKS = ITEMS.register("ashpen_black_planks",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLACK_ASHPEN_STAIRS = ITEMS.register("ashpen_black_stairs",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLACK_ASHPEN_SLAB = ITEMS.register("ashpen_black_slab",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLACK_ASHPEN_FENCE = ITEMS.register("ashpen_black_fence",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLACK_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_black_fence_gate",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLACK_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_black_pressure_plate",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLACK_ASHPEN_BUTTON = ITEMS.register("ashpen_black_button",
        () -> new BlockItem(ModBlocks.BLACK_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> BLUE_ASHPEN_PLANKS = ITEMS.register("ashpen_blue_planks",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_ASHPEN_STAIRS = ITEMS.register("ashpen_blue_stairs",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_ASHPEN_SLAB = ITEMS.register("ashpen_blue_slab",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_ASHPEN_FENCE = ITEMS.register("ashpen_blue_fence",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_blue_fence_gate",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_blue_pressure_plate",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BLUE_ASHPEN_BUTTON = ITEMS.register("ashpen_blue_button",
        () -> new BlockItem(ModBlocks.BLUE_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> BROWN_ASHPEN_PLANKS = ITEMS.register("ashpen_brown_planks",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_ASHPEN_STAIRS = ITEMS.register("ashpen_brown_stairs",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_ASHPEN_SLAB = ITEMS.register("ashpen_brown_slab",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_ASHPEN_FENCE = ITEMS.register("ashpen_brown_fence",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_brown_fence_gate",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_brown_pressure_plate",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> BROWN_ASHPEN_BUTTON = ITEMS.register("ashpen_brown_button",
        () -> new BlockItem(ModBlocks.BROWN_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> CYAN_ASHPEN_PLANKS = ITEMS.register("ashpen_cyan_planks",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_ASHPEN_STAIRS = ITEMS.register("ashpen_cyan_stairs",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_ASHPEN_SLAB = ITEMS.register("ashpen_cyan_slab",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_ASHPEN_FENCE = ITEMS.register("ashpen_cyan_fence",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_cyan_fence_gate",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_cyan_pressure_plate",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> CYAN_ASHPEN_BUTTON = ITEMS.register("ashpen_cyan_button",
        () -> new BlockItem(ModBlocks.CYAN_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> GRAY_ASHPEN_PLANKS = ITEMS.register("ashpen_gray_planks",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_ASHPEN_STAIRS = ITEMS.register("ashpen_gray_stairs",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_ASHPEN_SLAB = ITEMS.register("ashpen_gray_slab",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_ASHPEN_FENCE = ITEMS.register("ashpen_gray_fence",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_gray_fence_gate",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_gray_pressure_plate",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GRAY_ASHPEN_BUTTON = ITEMS.register("ashpen_gray_button",
        () -> new BlockItem(ModBlocks.GRAY_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> GREEN_ASHPEN_PLANKS = ITEMS.register("ashpen_green_planks",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_ASHPEN_STAIRS = ITEMS.register("ashpen_green_stairs",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_ASHPEN_SLAB = ITEMS.register("ashpen_green_slab",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_ASHPEN_FENCE = ITEMS.register("ashpen_green_fence",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_green_fence_gate",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_green_pressure_plate",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> GREEN_ASHPEN_BUTTON = ITEMS.register("ashpen_green_button",
        () -> new BlockItem(ModBlocks.GREEN_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_PLANKS = ITEMS.register("ashpen_light_blue_planks",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_STAIRS = ITEMS.register("ashpen_light_blue_stairs",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_SLAB = ITEMS.register("ashpen_light_blue_slab",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_FENCE = ITEMS.register("ashpen_light_blue_fence",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_light_blue_fence_gate",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_light_blue_pressure_plate",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_BLUE_ASHPEN_BUTTON = ITEMS.register("ashpen_light_blue_button",
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_PLANKS = ITEMS.register("ashpen_light_gray_planks",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_STAIRS = ITEMS.register("ashpen_light_gray_stairs",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_SLAB = ITEMS.register("ashpen_light_gray_slab",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_FENCE = ITEMS.register("ashpen_light_gray_fence",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_light_gray_fence_gate",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_light_gray_pressure_plate",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIGHT_GRAY_ASHPEN_BUTTON = ITEMS.register("ashpen_light_gray_button",
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> LIME_ASHPEN_PLANKS = ITEMS.register("ashpen_lime_planks",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_ASHPEN_STAIRS = ITEMS.register("ashpen_lime_stairs",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_ASHPEN_SLAB = ITEMS.register("ashpen_lime_slab",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_ASHPEN_FENCE = ITEMS.register("ashpen_lime_fence",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_lime_fence_gate",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_lime_pressure_plate",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> LIME_ASHPEN_BUTTON = ITEMS.register("ashpen_lime_button",
        () -> new BlockItem(ModBlocks.LIME_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> MAGENTA_ASHPEN_PLANKS = ITEMS.register("ashpen_magenta_planks",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_ASHPEN_STAIRS = ITEMS.register("ashpen_magenta_stairs",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_ASHPEN_SLAB = ITEMS.register("ashpen_magenta_slab",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_ASHPEN_FENCE = ITEMS.register("ashpen_magenta_fence",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_magenta_fence_gate",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_magenta_pressure_plate",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> MAGENTA_ASHPEN_BUTTON = ITEMS.register("ashpen_magenta_button",
        () -> new BlockItem(ModBlocks.MAGENTA_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> ORANGE_ASHPEN_PLANKS = ITEMS.register("ashpen_orange_planks",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_ASHPEN_STAIRS = ITEMS.register("ashpen_orange_stairs",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_ASHPEN_SLAB = ITEMS.register("ashpen_orange_slab",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_ASHPEN_FENCE = ITEMS.register("ashpen_orange_fence",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_orange_fence_gate",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_orange_pressure_plate",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> ORANGE_ASHPEN_BUTTON = ITEMS.register("ashpen_orange_button",
        () -> new BlockItem(ModBlocks.ORANGE_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> PINK_ASHPEN_PLANKS = ITEMS.register("ashpen_pink_planks",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_ASHPEN_STAIRS = ITEMS.register("ashpen_pink_stairs",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_ASHPEN_SLAB = ITEMS.register("ashpen_pink_slab",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_ASHPEN_FENCE = ITEMS.register("ashpen_pink_fence",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_pink_fence_gate",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_pink_pressure_plate",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PINK_ASHPEN_BUTTON = ITEMS.register("ashpen_pink_button",
        () -> new BlockItem(ModBlocks.PINK_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> PURPLE_ASHPEN_PLANKS = ITEMS.register("ashpen_purple_planks",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_ASHPEN_STAIRS = ITEMS.register("ashpen_purple_stairs",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_ASHPEN_SLAB = ITEMS.register("ashpen_purple_slab",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_ASHPEN_FENCE = ITEMS.register("ashpen_purple_fence",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_purple_fence_gate",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_purple_pressure_plate",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> PURPLE_ASHPEN_BUTTON = ITEMS.register("ashpen_purple_button",
        () -> new BlockItem(ModBlocks.PURPLE_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> RED_ASHPEN_PLANKS = ITEMS.register("ashpen_red_planks",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_ASHPEN_STAIRS = ITEMS.register("ashpen_red_stairs",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_ASHPEN_SLAB = ITEMS.register("ashpen_red_slab",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_ASHPEN_FENCE = ITEMS.register("ashpen_red_fence",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_red_fence_gate",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_red_pressure_plate",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> RED_ASHPEN_BUTTON = ITEMS.register("ashpen_red_button",
        () -> new BlockItem(ModBlocks.RED_ASHPEN_BUTTON.get(), createBlockItemProperties()));
    
    public static final RegistryObject<Item> YELLOW_ASHPEN_PLANKS = ITEMS.register("ashpen_yellow_planks",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_PLANKS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_ASHPEN_STAIRS = ITEMS.register("ashpen_yellow_stairs",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_STAIRS.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_ASHPEN_SLAB = ITEMS.register("ashpen_yellow_slab",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_SLAB.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_ASHPEN_FENCE = ITEMS.register("ashpen_yellow_fence",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_FENCE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_ASHPEN_FENCE_GATE = ITEMS.register("ashpen_yellow_fence_gate",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_FENCE_GATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_ASHPEN_PRESSURE_PLATE = ITEMS.register("ashpen_yellow_pressure_plate",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_PRESSURE_PLATE.get(), createBlockItemProperties()));
    public static final RegistryObject<Item> YELLOW_ASHPEN_BUTTON = ITEMS.register("ashpen_yellow_button",
        () -> new BlockItem(ModBlocks.YELLOW_ASHPEN_BUTTON.get(), createBlockItemProperties()));
}
// Kingodogo finished the project at 2025-11-02 12:13:45
