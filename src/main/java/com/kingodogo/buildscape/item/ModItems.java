package com.kingodogo.buildscape.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.block.ModBlocks;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BuildScape.MODID);
    
    public static final RegistryObject<Item> POLISHED_STONE_ITEM = ITEMS.register("polished_stone_item", 
        () -> new BlockItem(ModBlocks.POLISHED_STONE_BLOCK.get(), new Item.Properties()));
    
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
}
