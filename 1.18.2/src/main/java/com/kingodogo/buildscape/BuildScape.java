package com.kingodogo.buildscape;

import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BuildScape.MODID)
public class BuildScape {
    
    public static final String MODID = "buildscape";
    private static final Logger LOGGER = LogManager.getLogger();
    
    // Buildscape creative mode tab item group
    public static final CreativeModeTab BUILDSCAPE_TAB = new CreativeModeTab("buildscape") {
        @Override
        public ItemStack makeIcon() {
            return getModIcon();
        }
        
        @Override
        public void fillItemList(net.minecraft.core.NonNullList<ItemStack> items) {
            
            // Bit copper variants - Fresh
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_CHISELED_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BULB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_GRATE_ITEM.get()));
            
            // Bit copper variants - Exposed
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CHISELED_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BULB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_GRATE_ITEM.get()));
            
            // Bit copper variants - Weathered
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CHISELED_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BULB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_GRATE_ITEM.get()));
            
            // Bit copper variants - Oxidized
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CHISELED_COPPER_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BULB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_GRATE_ITEM.get()));
            
            // Tuff variants
            items.add(new ItemStack(ModItems.BIT_CHISELED_TUFF_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_CHISELED_TUFF_BRICKS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_WALL_ITEM.get()));
            
            // Colored tiles - grouped by color (tile -> stairs -> slabs -> walls)
            // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
            
            // White tiles
            items.add(new ItemStack(ModItems.WHITE_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_TILES_WALL_ITEM.get()));
            
            // Light gray tiles
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_WALL_ITEM.get()));
            
            // Gray tiles
            items.add(new ItemStack(ModItems.GRAY_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.GRAY_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.GRAY_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.GRAY_TILES_WALL_ITEM.get()));
            
            // Black tiles
            items.add(new ItemStack(ModItems.BLACK_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_TILES_WALL_ITEM.get()));
            
            // Brown tiles
            items.add(new ItemStack(ModItems.BROWN_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.BROWN_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BROWN_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BROWN_TILES_WALL_ITEM.get()));
            
            // Red tiles
            items.add(new ItemStack(ModItems.RED_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_TILES_WALL_ITEM.get()));
            
            // Orange tiles
            items.add(new ItemStack(ModItems.ORANGE_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_TILES_WALL_ITEM.get()));
            
            // Yellow tiles
            items.add(new ItemStack(ModItems.YELLOW_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_TILES_WALL_ITEM.get()));
            
            // Lime tiles
            items.add(new ItemStack(ModItems.LIME_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.LIME_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.LIME_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.LIME_TILES_WALL_ITEM.get()));
            
            // Green tiles
            items.add(new ItemStack(ModItems.GREEN_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_TILES_WALL_ITEM.get()));
            
            // Cyan tiles
            items.add(new ItemStack(ModItems.CYAN_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.CYAN_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.CYAN_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.CYAN_TILES_WALL_ITEM.get()));
            
            // Light blue tiles
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_WALL_ITEM.get()));
            
            // Blue tiles
            items.add(new ItemStack(ModItems.BLUE_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_TILES_WALL_ITEM.get()));
            
            // Purple tiles
            items.add(new ItemStack(ModItems.PURPLE_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.PURPLE_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.PURPLE_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.PURPLE_TILES_WALL_ITEM.get()));
            
            // Magenta tiles
            items.add(new ItemStack(ModItems.MAGENTA_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.MAGENTA_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.MAGENTA_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.MAGENTA_TILES_WALL_ITEM.get()));
            
            // Pink tiles
            items.add(new ItemStack(ModItems.PINK_TILES_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_TILES_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_TILES_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_TILES_WALL_ITEM.get()));
            
            // Colored mosaic glass - grouped by color (mosaic glass -> pane)
            // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
            
            // White mosaic glass
            items.add(new ItemStack(ModItems.WHITE_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Light gray mosaic glass
            items.add(new ItemStack(ModItems.LIGHT_GRAY_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Gray mosaic glass
            items.add(new ItemStack(ModItems.GRAY_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.GRAY_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Black mosaic glass
            items.add(new ItemStack(ModItems.BLACK_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Brown mosaic glass
            items.add(new ItemStack(ModItems.BROWN_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.BROWN_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Red mosaic glass
            items.add(new ItemStack(ModItems.RED_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Orange mosaic glass
            items.add(new ItemStack(ModItems.ORANGE_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Yellow mosaic glass
            items.add(new ItemStack(ModItems.YELLOW_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Lime mosaic glass
            items.add(new ItemStack(ModItems.LIME_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.LIME_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Green mosaic glass
            items.add(new ItemStack(ModItems.GREEN_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Cyan mosaic glass
            items.add(new ItemStack(ModItems.CYAN_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.CYAN_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Light blue mosaic glass
            items.add(new ItemStack(ModItems.LIGHT_BLUE_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Blue mosaic glass
            items.add(new ItemStack(ModItems.BLUE_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Purple mosaic glass
            items.add(new ItemStack(ModItems.PURPLE_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.PURPLE_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Magenta mosaic glass
            items.add(new ItemStack(ModItems.MAGENTA_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.MAGENTA_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Pink mosaic glass
            items.add(new ItemStack(ModItems.PINK_MOSAIC_GLASS_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_MOSAIC_GLASS_PANE_ITEM.get()));
            
            // Calcite variants
            items.add(new ItemStack(ModItems.CALCITE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.CALCITE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.CALCITE_WALL_ITEM.get()));
            
            // Mossy calcite variants
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_ITEM.get()));
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_WALL_ITEM.get()));
            
            // Moss variants
            items.add(new ItemStack(ModItems.MOSS_BLOCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.MOSS_LAYERS_ITEM.get()));
            items.add(new ItemStack(ModItems.MOSS_OVERLAY_ITEM.get()));
            
            // Various slabs
            items.add(new ItemStack(ModItems.PODZOL_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.MYCELIUM_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.DIRT_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.MUD_ITEM.get()));
            items.add(new ItemStack(ModItems.MUD_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.AMETHYST_BLOCK_SLAB_ITEM.get()));
            
            // Colored sand variants - grouped by color (sand -> sandstone -> stairs -> slabs -> walls -> smooth sandstone -> smooth sandstone stairs -> smooth sandstone slabs)
            // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
            
            // White sand
            items.add(new ItemStack(ModItems.WHITE_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.WHITE_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Black sand
            items.add(new ItemStack(ModItems.BLACK_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLACK_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Red sand
            items.add(new ItemStack(ModItems.RED_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.RED_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Orange sand
            items.add(new ItemStack(ModItems.ORANGE_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.ORANGE_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Yellow sand
            items.add(new ItemStack(ModItems.YELLOW_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.YELLOW_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Green sand
            items.add(new ItemStack(ModItems.GREEN_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.GREEN_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Blue sand
            items.add(new ItemStack(ModItems.BLUE_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BLUE_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Pink sand
            items.add(new ItemStack(ModItems.PINK_SAND_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SMOOTH_SANDSTONE_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SMOOTH_SANDSTONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.PINK_SMOOTH_SANDSTONE_SLAB_ITEM.get()));
            
            // Dripstone variants
            items.add(new ItemStack(ModItems.DRIPSTONE_BLOCK_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.DRIPSTONE_BLOCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.DRIPSTONE_BLOCK_WALL_ITEM.get()));
            
            // Polished basalt variants
            items.add(new ItemStack(ModItems.POLISHED_BASALT_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.POLISHED_BASALT_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.POLISHED_BASALT_WALL_ITEM.get()));
            
            // Smooth basalt variants
            items.add(new ItemStack(ModItems.SMOOTH_BASALT_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.SMOOTH_BASALT_SLAB_ITEM.get()));
            
            // Endstone variants
            items.add(new ItemStack(ModItems.END_STONE_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.END_STONE_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.END_STONE_WALL_ITEM.get()));
            
            // Quartz variants
            items.add(new ItemStack(ModItems.QUARTZ_BLOCK_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.SMOOTH_QUARTZ_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.QUARTZ_BRICKS_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.QUARTZ_BRICKS_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.QUARTZ_BRICKS_WALL_ITEM.get()));
            
            // Prismarine variants
            items.add(new ItemStack(ModItems.PRISMARINE_BRICKS_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.DARK_PRISMARINE_WALL_ITEM.get()));
            
            // Bedrock variants
            items.add(new ItemStack(ModItems.BEDROCK_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.BEDROCK_SLAB_ITEM.get()));
            items.add(new ItemStack(ModItems.BEDROCK_WALL_ITEM.get()));
            items.add(new ItemStack(ModItems.BEDROCK_PANE_ITEM.get()));
            
            // Obsidian variants
            items.add(new ItemStack(ModItems.OBSIDIAN_STAIRS_ITEM.get()));
            items.add(new ItemStack(ModItems.OBSIDIAN_SLAB_ITEM.get()));
            // items.add(new ItemStack(ModItems.OBSIDIAN_WALL_ITEM.get()));
            // items.add(new ItemStack(ModItems.OBSIDIAN_GLASS_PANE_ITEM.get()));
        }
    };

    private static ItemStack getModIcon() {
        return new ItemStack(ModItems.BIT_COPPER_BLOCK_ITEM.get());
    }

    public BuildScape() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        // Register sound events FIRST so they're available when blocks are created
        com.kingodogo.buildscape.sound.ModSounds.SOUND_EVENTS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        net.minecraftforge.fml.ModLoadingContext.get().registerConfig(
                net.minecraftforge.fml.config.ModConfig.Type.COMMON, Config.SPEC
        );

        LOGGER.info("BuildScape mod initialized!");
    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Buildscape mod initialized!");
        
        // Initialize sound types after registries are loaded
        event.enqueueWork(() -> {
            // Force initialization of ForgeSoundTypes after registries are available
            com.kingodogo.buildscape.sound.ModSounds.COPPER_GRATE_SOUNDS();
            com.kingodogo.buildscape.sound.ModSounds.COPPER_BULB_SOUNDS();
            com.kingodogo.buildscape.sound.ModSounds.MUD_SOUNDS();
            LOGGER.info("Custom sound types initialized");
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Buildscape mod loaded on server");
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Buildscape mod client setup complete");
            
            // Register translucent render layer for mosaic glass blocks and panes
            event.enqueueWork(() -> {
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_MOSAIC_GLASS.get(), net.minecraft.client.renderer.RenderType.translucent());
                
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                // Disabled obsidian glass pane for now
                // net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.OBSIDIAN_GLASS_PANE.get(), net.minecraft.client.renderer.RenderType.translucent());
                
                // Register translucent render layer for copper grates
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_EXPOSED_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_WEATHERED_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_OXIDIZED_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
            });
        }
    }
}
// Kingodogo finished the project at 2025-11-02 12:13:45
