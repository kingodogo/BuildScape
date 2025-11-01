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
    
    public static final RegistryObject<Item> BLACK_SAND_ITEM = ITEMS.register("black_sand_item", 
        () -> new BlockItem(ModBlocks.BLACK_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_SAND_ITEM = ITEMS.register("blue_sand_item", 
        () -> new BlockItem(ModBlocks.BLUE_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_SAND_ITEM = ITEMS.register("green_sand_item", 
        () -> new BlockItem(ModBlocks.GREEN_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_SAND_ITEM = ITEMS.register("orange_sand_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_SAND_ITEM = ITEMS.register("pink_sand_item", 
        () -> new BlockItem(ModBlocks.PINK_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_SAND_ITEM = ITEMS.register("red_sand_item", 
        () -> new BlockItem(ModBlocks.RED_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SAND_ITEM = ITEMS.register("white_sand_item", 
        () -> new BlockItem(ModBlocks.WHITE_SAND.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_SAND_ITEM = ITEMS.register("yellow_sand_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SAND.get(), new Item.Properties()));
    
    // Sandstone items
    public static final RegistryObject<Item> BLACK_SANDSTONE_ITEM = ITEMS.register("black_sandstone_item", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_SANDSTONE_ITEM = ITEMS.register("blue_sandstone_item", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_SANDSTONE_ITEM = ITEMS.register("green_sandstone_item", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_SANDSTONE_ITEM = ITEMS.register("orange_sandstone_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_SANDSTONE_ITEM = ITEMS.register("pink_sandstone_item", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_SANDSTONE_ITEM = ITEMS.register("red_sandstone_item", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SANDSTONE_ITEM = ITEMS.register("white_sandstone_item", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_SANDSTONE_ITEM = ITEMS.register("yellow_sandstone_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE.get(), new Item.Properties()));
    
    // Smooth sandstone items
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE_ITEM = ITEMS.register("black_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE_ITEM = ITEMS.register("blue_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE_ITEM = ITEMS.register("green_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE_ITEM = ITEMS.register("orange_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE_ITEM = ITEMS.register("pink_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE_ITEM = ITEMS.register("red_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE_ITEM = ITEMS.register("white_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE_ITEM = ITEMS.register("yellow_smooth_sandstone_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE.get(), new Item.Properties()));
    
    // Tile items
    public static final RegistryObject<Item> BLACK_TILES_ITEM = ITEMS.register("black_tiles_item", 
        () -> new BlockItem(ModBlocks.BLACK_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_TILES_ITEM = ITEMS.register("blue_tiles_item", 
        () -> new BlockItem(ModBlocks.BLUE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BROWN_TILES_ITEM = ITEMS.register("brown_tiles_item", 
        () -> new BlockItem(ModBlocks.BROWN_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> CYAN_TILES_ITEM = ITEMS.register("cyan_tiles_item", 
        () -> new BlockItem(ModBlocks.CYAN_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GRAY_TILES_ITEM = ITEMS.register("gray_tiles_item", 
        () -> new BlockItem(ModBlocks.GRAY_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_TILES_ITEM = ITEMS.register("green_tiles_item", 
        () -> new BlockItem(ModBlocks.GREEN_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_ITEM = ITEMS.register("light_blue_tiles_item", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_ITEM = ITEMS.register("light_gray_tiles_item", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIME_TILES_ITEM = ITEMS.register("lime_tiles_item", 
        () -> new BlockItem(ModBlocks.LIME_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MAGENTA_TILES_ITEM = ITEMS.register("magenta_tiles_item", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_TILES_ITEM = ITEMS.register("orange_tiles_item", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_TILES_ITEM = ITEMS.register("pink_tiles_item", 
        () -> new BlockItem(ModBlocks.PINK_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PURPLE_TILES_ITEM = ITEMS.register("purple_tiles_item", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_TILES_ITEM = ITEMS.register("red_tiles_item", 
        () -> new BlockItem(ModBlocks.RED_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_TILES_ITEM = ITEMS.register("white_tiles_item", 
        () -> new BlockItem(ModBlocks.WHITE_TILES.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_TILES_ITEM = ITEMS.register("yellow_tiles_item", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES.get(), new Item.Properties()));
    
    // Mosaic glass items
    public static final RegistryObject<Item> BLACK_MOSAIC_GLASS_ITEM = ITEMS.register("black_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.BLACK_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_MOSAIC_GLASS_ITEM = ITEMS.register("blue_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.BLUE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BROWN_MOSAIC_GLASS_ITEM = ITEMS.register("brown_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.BROWN_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> CYAN_MOSAIC_GLASS_ITEM = ITEMS.register("cyan_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.CYAN_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GRAY_MOSAIC_GLASS_ITEM = ITEMS.register("gray_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.GRAY_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_MOSAIC_GLASS_ITEM = ITEMS.register("green_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.GREEN_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_MOSAIC_GLASS_ITEM = ITEMS.register("light_blue_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_MOSAIC_GLASS_ITEM = ITEMS.register("light_gray_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIME_MOSAIC_GLASS_ITEM = ITEMS.register("lime_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.LIME_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MAGENTA_MOSAIC_GLASS_ITEM = ITEMS.register("magenta_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.MAGENTA_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_MOSAIC_GLASS_ITEM = ITEMS.register("orange_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.ORANGE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_MOSAIC_GLASS_ITEM = ITEMS.register("pink_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.PINK_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PURPLE_MOSAIC_GLASS_ITEM = ITEMS.register("purple_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.PURPLE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_MOSAIC_GLASS_ITEM = ITEMS.register("red_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.RED_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_MOSAIC_GLASS_ITEM = ITEMS.register("white_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.WHITE_MOSAIC_GLASS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_MOSAIC_GLASS_ITEM = ITEMS.register("yellow_mosaic_glass_item", 
        () -> new BlockItem(ModBlocks.YELLOW_MOSAIC_GLASS.get(), new Item.Properties()));
    
    // Mosaic glass pane items
    public static final RegistryObject<Item> BLACK_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("black_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.BLACK_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BLUE_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("blue_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.BLUE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BROWN_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("brown_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.BROWN_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> CYAN_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("cyan_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.CYAN_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GRAY_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("gray_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.GRAY_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> GREEN_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("green_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.GREEN_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_BLUE_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("light_blue_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIGHT_GRAY_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("light_gray_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> LIME_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("lime_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.LIME_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MAGENTA_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("magenta_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> ORANGE_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("orange_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PINK_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("pink_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.PINK_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PURPLE_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("purple_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> RED_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("red_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.RED_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> WHITE_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("white_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.WHITE_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> YELLOW_MOSAIC_GLASS_PANE_ITEM = ITEMS.register("yellow_mosaic_glass_pane_item", 
        () -> new BlockItem(ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get(), new Item.Properties()));
    
    // Copper variant items
    public static final RegistryObject<Item> BIT_CHISELED_COPPER_ITEM = ITEMS.register("bit_chiseled_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_ITEM = ITEMS.register("bit_copper_block_item", 
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_COPPER_BULB_ITEM = ITEMS.register("bit_copper_bulb_item", 
        () -> new BlockItem(ModBlocks.BIT_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_COPPER_GRATE_ITEM = ITEMS.register("bit_copper_grate_item", 
        () -> new BlockItem(ModBlocks.BIT_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_CUT_COPPER_ITEM = ITEMS.register("bit_cut_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER.get(), new Item.Properties()));
    
    // Exposed copper items
    public static final RegistryObject<Item> BIT_EXPOSED_CHISELED_COPPER_ITEM = ITEMS.register("bit_exposed_chiseled_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_ITEM = ITEMS.register("bit_exposed_copper_block_item", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BULB_ITEM = ITEMS.register("bit_exposed_copper_bulb_item", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_GRATE_ITEM = ITEMS.register("bit_exposed_copper_grate_item", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_ITEM = ITEMS.register("bit_exposed_cut_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER.get(), new Item.Properties()));
    
    // Weathered copper items
    public static final RegistryObject<Item> BIT_WEATHERED_CHISELED_COPPER_ITEM = ITEMS.register("bit_weathered_chiseled_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_ITEM = ITEMS.register("bit_weathered_copper_block_item", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BULB_ITEM = ITEMS.register("bit_weathered_copper_bulb_item", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_GRATE_ITEM = ITEMS.register("bit_weathered_copper_grate_item", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_ITEM = ITEMS.register("bit_weathered_cut_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER.get(), new Item.Properties()));
    
    // Oxidized copper items
    public static final RegistryObject<Item> BIT_OXIDIZED_CHISELED_COPPER_ITEM = ITEMS.register("bit_oxidized_chiseled_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CHISELED_COPPER.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_ITEM = ITEMS.register("bit_oxidized_copper_block_item", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BULB_ITEM = ITEMS.register("bit_oxidized_copper_bulb_item", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BULB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_GRATE_ITEM = ITEMS.register("bit_oxidized_copper_grate_item", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_GRATE.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_ITEM = ITEMS.register("bit_oxidized_cut_copper_item", 
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER.get(), new Item.Properties()));
    
    // Tuff variant items
    public static final RegistryObject<Item> BIT_CHISELED_TUFF_ITEM = ITEMS.register("bit_chiseled_tuff_item", 
        () -> new BlockItem(ModBlocks.BIT_CHISELED_TUFF.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_CHISELED_TUFF_BRICKS_ITEM = ITEMS.register("bit_chiseled_tuff_bricks_item", 
        () -> new BlockItem(ModBlocks.BIT_CHISELED_TUFF_BRICKS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_POLISHED_TUFF_ITEM = ITEMS.register("bit_polished_tuff_item", 
        () -> new BlockItem(ModBlocks.BIT_POLISHED_TUFF.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> BIT_TUFF_BRICKS_ITEM = ITEMS.register("bit_tuff_bricks_item", 
        () -> new BlockItem(ModBlocks.BIT_TUFF_BRICKS.get(), new Item.Properties()));
    
    // Sandstone stairs items
    public static final RegistryObject<Item> BLACK_SANDSTONE_STAIRS_ITEM = ITEMS.register("black_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SANDSTONE_STAIRS_ITEM = ITEMS.register("blue_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SANDSTONE_STAIRS_ITEM = ITEMS.register("green_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SANDSTONE_STAIRS_ITEM = ITEMS.register("orange_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SANDSTONE_STAIRS_ITEM = ITEMS.register("pink_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_STAIRS_ITEM = ITEMS.register("red_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SANDSTONE_STAIRS_ITEM = ITEMS.register("white_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SANDSTONE_STAIRS_ITEM = ITEMS.register("yellow_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE_STAIRS.get(), new Item.Properties()));
    
    // Sandstone slab items
    public static final RegistryObject<Item> BLACK_SANDSTONE_SLAB_ITEM = ITEMS.register("black_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SANDSTONE_SLAB_ITEM = ITEMS.register("blue_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SANDSTONE_SLAB_ITEM = ITEMS.register("green_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SANDSTONE_SLAB_ITEM = ITEMS.register("orange_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SANDSTONE_SLAB_ITEM = ITEMS.register("pink_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_SLAB_ITEM = ITEMS.register("red_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SANDSTONE_SLAB_ITEM = ITEMS.register("white_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SANDSTONE_SLAB_ITEM = ITEMS.register("yellow_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE_SLAB.get(), new Item.Properties()));
    
    // Sandstone wall items
    public static final RegistryObject<Item> BLACK_SANDSTONE_WALL_ITEM = ITEMS.register("black_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.BLACK_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SANDSTONE_WALL_ITEM = ITEMS.register("blue_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.BLUE_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SANDSTONE_WALL_ITEM = ITEMS.register("green_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.GREEN_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SANDSTONE_WALL_ITEM = ITEMS.register("orange_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SANDSTONE_WALL_ITEM = ITEMS.register("pink_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.PINK_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SANDSTONE_WALL_ITEM = ITEMS.register("red_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.RED_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SANDSTONE_WALL_ITEM = ITEMS.register("white_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.WHITE_SANDSTONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SANDSTONE_WALL_ITEM = ITEMS.register("yellow_sandstone_wall_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SANDSTONE_WALL.get(), new Item.Properties()));
    
    // Smooth sandstone slab items
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("black_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("blue_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("green_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("orange_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("pink_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("red_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("white_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE_SLAB_ITEM = ITEMS.register("yellow_smooth_sandstone_slab_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE_SLAB.get(), new Item.Properties()));
    
    // Smooth sandstone stairs items
    public static final RegistryObject<Item> BLACK_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("black_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("blue_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.BLUE_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("green_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.GREEN_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("orange_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.ORANGE_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("pink_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("red_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.RED_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("white_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_SMOOTH_SANDSTONE_STAIRS_ITEM = ITEMS.register("yellow_smooth_sandstone_stairs_item", 
        () -> new BlockItem(ModBlocks.YELLOW_SMOOTH_SANDSTONE_STAIRS.get(), new Item.Properties()));
    
    // Tiles stairs items
    public static final RegistryObject<Item> BLACK_TILES_STAIRS_ITEM = ITEMS.register("black_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.BLACK_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_STAIRS_ITEM = ITEMS.register("blue_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.BLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TILES_STAIRS_ITEM = ITEMS.register("brown_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.BROWN_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TILES_STAIRS_ITEM = ITEMS.register("cyan_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.CYAN_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TILES_STAIRS_ITEM = ITEMS.register("gray_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.GRAY_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TILES_STAIRS_ITEM = ITEMS.register("green_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.GREEN_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_STAIRS_ITEM = ITEMS.register("light_blue_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_STAIRS_ITEM = ITEMS.register("light_gray_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_TILES_STAIRS_ITEM = ITEMS.register("lime_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.LIME_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TILES_STAIRS_ITEM = ITEMS.register("magenta_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_STAIRS_ITEM = ITEMS.register("orange_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_TILES_STAIRS_ITEM = ITEMS.register("pink_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.PINK_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TILES_STAIRS_ITEM = ITEMS.register("purple_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_STAIRS_ITEM = ITEMS.register("red_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.RED_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_STAIRS_ITEM = ITEMS.register("white_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.WHITE_TILES_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_STAIRS_ITEM = ITEMS.register("yellow_tiles_stairs_item", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES_STAIRS.get(), new Item.Properties()));
    
    // Tiles slab items
    public static final RegistryObject<Item> BLACK_TILES_SLAB_ITEM = ITEMS.register("black_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.BLACK_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_SLAB_ITEM = ITEMS.register("blue_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.BLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TILES_SLAB_ITEM = ITEMS.register("brown_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.BROWN_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TILES_SLAB_ITEM = ITEMS.register("cyan_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.CYAN_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TILES_SLAB_ITEM = ITEMS.register("gray_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.GRAY_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TILES_SLAB_ITEM = ITEMS.register("green_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.GREEN_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_SLAB_ITEM = ITEMS.register("light_blue_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_SLAB_ITEM = ITEMS.register("light_gray_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_TILES_SLAB_ITEM = ITEMS.register("lime_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.LIME_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TILES_SLAB_ITEM = ITEMS.register("magenta_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_SLAB_ITEM = ITEMS.register("orange_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_TILES_SLAB_ITEM = ITEMS.register("pink_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.PINK_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TILES_SLAB_ITEM = ITEMS.register("purple_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_SLAB_ITEM = ITEMS.register("red_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.RED_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_SLAB_ITEM = ITEMS.register("white_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.WHITE_TILES_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_SLAB_ITEM = ITEMS.register("yellow_tiles_slab_item", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES_SLAB.get(), new Item.Properties()));
    
    // Tiles wall items
    public static final RegistryObject<Item> BLACK_TILES_WALL_ITEM = ITEMS.register("black_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.BLACK_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_TILES_WALL_ITEM = ITEMS.register("blue_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.BLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_TILES_WALL_ITEM = ITEMS.register("brown_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.BROWN_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_TILES_WALL_ITEM = ITEMS.register("cyan_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.CYAN_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_TILES_WALL_ITEM = ITEMS.register("gray_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.GRAY_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_TILES_WALL_ITEM = ITEMS.register("green_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.GREEN_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILES_WALL_ITEM = ITEMS.register("light_blue_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.LIGHT_BLUE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILES_WALL_ITEM = ITEMS.register("light_gray_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.LIGHT_GRAY_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_TILES_WALL_ITEM = ITEMS.register("lime_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.LIME_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_TILES_WALL_ITEM = ITEMS.register("magenta_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.MAGENTA_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TILES_WALL_ITEM = ITEMS.register("orange_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.ORANGE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_TILES_WALL_ITEM = ITEMS.register("pink_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.PINK_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_TILES_WALL_ITEM = ITEMS.register("purple_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.PURPLE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_TILES_WALL_ITEM = ITEMS.register("red_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.RED_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TILES_WALL_ITEM = ITEMS.register("white_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.WHITE_TILES_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_TILES_WALL_ITEM = ITEMS.register("yellow_tiles_wall_item", 
        () -> new BlockItem(ModBlocks.YELLOW_TILES_WALL.get(), new Item.Properties()));
    
    // Vanilla block variants
    public static final RegistryObject<Item> POLISHED_BASALT_STAIRS_ITEM = ITEMS.register("polished_basalt_stairs_item",
        () -> new BlockItem(ModBlocks.POLISHED_BASALT_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BASALT_SLAB_ITEM = ITEMS.register("polished_basalt_slab_item",
        () -> new BlockItem(ModBlocks.POLISHED_BASALT_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> POLISHED_BASALT_WALL_ITEM = ITEMS.register("polished_basalt_wall_item",
        () -> new BlockItem(ModBlocks.POLISHED_BASALT_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_STAIRS_ITEM = ITEMS.register("dripstone_block_stairs_item",
        () -> new BlockItem(ModBlocks.DRIPSTONE_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_SLAB_ITEM = ITEMS.register("dripstone_block_slab_item",
        () -> new BlockItem(ModBlocks.DRIPSTONE_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRIPSTONE_BLOCK_WALL_ITEM = ITEMS.register("dripstone_block_wall_item",
        () -> new BlockItem(ModBlocks.DRIPSTONE_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_STAIRS_ITEM = ITEMS.register("end_stone_stairs_item",
        () -> new BlockItem(ModBlocks.END_STONE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_SLAB_ITEM = ITEMS.register("end_stone_slab_item",
        () -> new BlockItem(ModBlocks.END_STONE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> END_STONE_WALL_ITEM = ITEMS.register("end_stone_wall_item",
        () -> new BlockItem(ModBlocks.END_STONE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_STAIRS_ITEM = ITEMS.register("quartz_bricks_stairs_item",
        () -> new BlockItem(ModBlocks.QUARTZ_BRICKS_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_SLAB_ITEM = ITEMS.register("quartz_bricks_slab_item",
        () -> new BlockItem(ModBlocks.QUARTZ_BRICKS_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BRICKS_WALL_ITEM = ITEMS.register("quartz_bricks_wall_item",
        () -> new BlockItem(ModBlocks.QUARTZ_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_STAIRS_ITEM = ITEMS.register("calcite_stairs_item",
        () -> new BlockItem(ModBlocks.CALCITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_SLAB_ITEM = ITEMS.register("calcite_slab_item",
        () -> new BlockItem(ModBlocks.CALCITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CALCITE_WALL_ITEM = ITEMS.register("calcite_wall_item",
        () -> new BlockItem(ModBlocks.CALCITE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_SLAB_ITEM = ITEMS.register("bedrock_slab_item",
        () -> new BlockItem(ModBlocks.BEDROCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_STAIRS_ITEM = ITEMS.register("bedrock_stairs_item",
        () -> new BlockItem(ModBlocks.BEDROCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BEDROCK_WALL_ITEM = ITEMS.register("bedrock_wall_item",
        () -> new BlockItem(ModBlocks.BEDROCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PRISMARINE_BRICKS_WALL_ITEM = ITEMS.register("prismarine_bricks_wall_item",
        () -> new BlockItem(ModBlocks.PRISMARINE_BRICKS_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_PRISMARINE_WALL_ITEM = ITEMS.register("dark_prismarine_wall_item",
        () -> new BlockItem(ModBlocks.DARK_PRISMARINE_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_BLOCK_WALL_ITEM = ITEMS.register("quartz_block_wall_item",
        () -> new BlockItem(ModBlocks.QUARTZ_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_QUARTZ_WALL_ITEM = ITEMS.register("smooth_quartz_wall_item",
        () -> new BlockItem(ModBlocks.SMOOTH_QUARTZ_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_STAIRS_ITEM = ITEMS.register("smooth_basalt_stairs_item",
        () -> new BlockItem(ModBlocks.SMOOTH_BASALT_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SMOOTH_BASALT_SLAB_ITEM = ITEMS.register("smooth_basalt_slab_item",
        () -> new BlockItem(ModBlocks.SMOOTH_BASALT_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSS_BLOCK_SLAB_ITEM = ITEMS.register("moss_block_slab_item",
        () -> new BlockItem(ModBlocks.MOSS_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BLOCK_SLAB_ITEM = ITEMS.register("amethyst_block_slab_item",
        () -> new BlockItem(ModBlocks.AMETHYST_BLOCK_SLAB.get(), new Item.Properties()));
    // Bit copper variants
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_STAIRS_ITEM = ITEMS.register("bit_copper_block_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_SLAB_ITEM = ITEMS.register("bit_copper_block_slab_item",
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_COPPER_BLOCK_WALL_ITEM = ITEMS.register("bit_copper_block_wall_item",
        () -> new BlockItem(ModBlocks.BIT_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_STAIRS_ITEM = ITEMS.register("bit_exposed_copper_block_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_SLAB_ITEM = ITEMS.register("bit_exposed_copper_block_slab_item",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_COPPER_BLOCK_WALL_ITEM = ITEMS.register("bit_exposed_copper_block_wall_item",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_STAIRS_ITEM = ITEMS.register("bit_weathered_copper_block_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_SLAB_ITEM = ITEMS.register("bit_weathered_copper_block_slab_item",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_COPPER_BLOCK_WALL_ITEM = ITEMS.register("bit_weathered_copper_block_wall_item",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_STAIRS_ITEM = ITEMS.register("bit_oxidized_copper_block_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_SLAB_ITEM = ITEMS.register("bit_oxidized_copper_block_slab_item",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_COPPER_BLOCK_WALL_ITEM = ITEMS.register("bit_oxidized_copper_block_wall_item",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_CUT_COPPER_STAIRS_ITEM = ITEMS.register("bit_cut_copper_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_CUT_COPPER_SLAB_ITEM = ITEMS.register("bit_cut_copper_slab_item",
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_CUT_COPPER_WALL_ITEM = ITEMS.register("bit_cut_copper_wall_item",
        () -> new BlockItem(ModBlocks.BIT_CUT_COPPER_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_STAIRS_ITEM = ITEMS.register("bit_exposed_cut_copper_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_SLAB_ITEM = ITEMS.register("bit_exposed_cut_copper_slab_item",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_EXPOSED_CUT_COPPER_WALL_ITEM = ITEMS.register("bit_exposed_cut_copper_wall_item",
        () -> new BlockItem(ModBlocks.BIT_EXPOSED_CUT_COPPER_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_STAIRS_ITEM = ITEMS.register("bit_weathered_cut_copper_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_SLAB_ITEM = ITEMS.register("bit_weathered_cut_copper_slab_item",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_WEATHERED_CUT_COPPER_WALL_ITEM = ITEMS.register("bit_weathered_cut_copper_wall_item",
        () -> new BlockItem(ModBlocks.BIT_WEATHERED_CUT_COPPER_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_STAIRS_ITEM = ITEMS.register("bit_oxidized_cut_copper_stairs_item",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_SLAB_ITEM = ITEMS.register("bit_oxidized_cut_copper_slab_item",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIT_OXIDIZED_CUT_COPPER_WALL_ITEM = ITEMS.register("bit_oxidized_cut_copper_wall_item",
        () -> new BlockItem(ModBlocks.BIT_OXIDIZED_CUT_COPPER_WALL.get(), new Item.Properties()));
    
    // Mossy calcite items
    public static final RegistryObject<Item> MOSSY_CALCITE_ITEM = ITEMS.register("mossy_calcite_item",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_CALCITE_STAIRS_ITEM = ITEMS.register("mossy_calcite_stairs_item",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_CALCITE_SLAB_ITEM = ITEMS.register("mossy_calcite_slab_item",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MOSSY_CALCITE_WALL_ITEM = ITEMS.register("mossy_calcite_wall_item",
        () -> new BlockItem(ModBlocks.MOSSY_CALCITE_WALL.get(), new Item.Properties()));
    
    // Grass, podzol, dirt, mud, and mycelium slab items
    // public static final RegistryObject<Item> GRASS_BLOCK_SLAB_ITEM = ITEMS.register("grass_block_slab_item",
    //     () -> new BlockItem(ModBlocks.GRASS_BLOCK_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> PODZOL_SLAB_ITEM = ITEMS.register("podzol_slab_item",
        () -> new BlockItem(ModBlocks.PODZOL_SLAB.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> DIRT_SLAB_ITEM = ITEMS.register("dirt_slab_item",
        () -> new BlockItem(ModBlocks.DIRT_SLAB.get(), new Item.Properties()));
    
    // MUD_SLAB_ITEM removed - MUD block doesn't exist in 1.18.2
    
    public static final RegistryObject<Item> MYCELIUM_SLAB_ITEM = ITEMS.register("mycelium_slab_item",
        () -> new BlockItem(ModBlocks.MYCELIUM_SLAB.get(), new Item.Properties()));
    
    // Moss layers and overlay items
    public static final RegistryObject<Item> MOSS_LAYERS_ITEM = ITEMS.register("moss_layers_item",
        () -> new BlockItem(ModBlocks.MOSS_LAYERS.get(), new Item.Properties()));
    
    public static final RegistryObject<Item> MOSS_OVERLAY_ITEM = ITEMS.register("moss_overlay_item",
        () -> new BlockItem(ModBlocks.MOSS_OVERLAY.get(), new Item.Properties()));
}
