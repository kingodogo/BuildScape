package com.kingodogo.buildscape;

import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BLOCK_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_CUT_COPPER_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_CHISELED_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_BULB.get()));
            items.add(new ItemStack(ModItems.BIT_COPPER_GRATE.get()));
            
            // Bit copper variants - Exposed
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BLOCK_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CUT_COPPER_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_CHISELED_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_BULB.get()));
            items.add(new ItemStack(ModItems.BIT_EXPOSED_COPPER_GRATE.get()));
            
            // Bit copper variants - Weathered
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BLOCK_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CUT_COPPER_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_CHISELED_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_BULB.get()));
            items.add(new ItemStack(ModItems.BIT_WEATHERED_COPPER_GRATE.get()));
            
            // Bit copper variants - Oxidized
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CUT_COPPER_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_CHISELED_COPPER.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BULB.get()));
            items.add(new ItemStack(ModItems.BIT_OXIDIZED_COPPER_GRATE.get()));
            
            // Iron chain (vanilla) -> large iron chain -> ancient steel chain -> large ancient steel chain -> gold chain -> large gold chain -> diamond chain -> large diamond chain -> emerald chain -> large emerald chain -> netherite chain -> large netherite chain
            items.add(new ItemStack(Items.CHAIN));
            items.add(new ItemStack(ModItems.LARGE_IRON_CHAIN.get()));
            items.add(new ItemStack(ModItems.ANCIENT_STEEL_CHAIN.get()));
            items.add(new ItemStack(ModItems.LARGE_ANCIENT_STEEL_CHAIN.get()));
            items.add(new ItemStack(ModItems.GOLD_CHAIN.get()));
            items.add(new ItemStack(ModItems.LARGE_GOLD_CHAIN.get()));
            items.add(new ItemStack(ModItems.DIAMOND_CHAIN.get()));
            items.add(new ItemStack(ModItems.LARGE_DIAMOND_CHAIN.get()));
            items.add(new ItemStack(ModItems.EMERALD_CHAIN.get()));
            items.add(new ItemStack(ModItems.LARGE_EMERALD_CHAIN.get()));
            items.add(new ItemStack(ModItems.NETHERITE_CHAIN.get()));
            items.add(new ItemStack(ModItems.LARGE_NETHERITE_CHAIN.get()));
            
            // Tuff variants
            items.add(new ItemStack(ModItems.BIT_CHISELED_TUFF.get()));
            items.add(new ItemStack(ModItems.BIT_CHISELED_TUFF_BRICKS.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_POLISHED_TUFF_WALL.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_STAIRS.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_SLAB.get()));
            items.add(new ItemStack(ModItems.BIT_TUFF_BRICKS_WALL.get()));
            
            // Colored tiles - grouped by color (tile -> stairs -> slabs -> walls)
            // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
            
            // White tiles
            items.add(new ItemStack(ModItems.WHITE_TILES.get()));
            items.add(new ItemStack(ModItems.WHITE_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.WHITE_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.WHITE_TILES_WALL.get()));
            
            // Light gray tiles
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_TILES_WALL.get()));
            
            // Gray tiles
            items.add(new ItemStack(ModItems.GRAY_TILES.get()));
            items.add(new ItemStack(ModItems.GRAY_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.GRAY_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.GRAY_TILES_WALL.get()));
            
            // Black tiles
            items.add(new ItemStack(ModItems.BLACK_TILES.get()));
            items.add(new ItemStack(ModItems.BLACK_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLACK_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.BLACK_TILES_WALL.get()));
            
            // Brown tiles
            items.add(new ItemStack(ModItems.BROWN_TILES.get()));
            items.add(new ItemStack(ModItems.BROWN_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.BROWN_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.BROWN_TILES_WALL.get()));
            
            // Red tiles
            items.add(new ItemStack(ModItems.RED_TILES.get()));
            items.add(new ItemStack(ModItems.RED_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.RED_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.RED_TILES_WALL.get()));
            
            // Orange tiles
            items.add(new ItemStack(ModItems.ORANGE_TILES.get()));
            items.add(new ItemStack(ModItems.ORANGE_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.ORANGE_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.ORANGE_TILES_WALL.get()));
            
            // Yellow tiles
            items.add(new ItemStack(ModItems.YELLOW_TILES.get()));
            items.add(new ItemStack(ModItems.YELLOW_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.YELLOW_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.YELLOW_TILES_WALL.get()));
            
            // Lime tiles
            items.add(new ItemStack(ModItems.LIME_TILES.get()));
            items.add(new ItemStack(ModItems.LIME_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIME_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.LIME_TILES_WALL.get()));
            
            // Green tiles
            items.add(new ItemStack(ModItems.GREEN_TILES.get()));
            items.add(new ItemStack(ModItems.GREEN_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.GREEN_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.GREEN_TILES_WALL.get()));
            
            // Cyan tiles
            items.add(new ItemStack(ModItems.CYAN_TILES.get()));
            items.add(new ItemStack(ModItems.CYAN_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.CYAN_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.CYAN_TILES_WALL.get()));
            
            // Light blue tiles
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_TILES_WALL.get()));
            
            // Blue tiles
            items.add(new ItemStack(ModItems.BLUE_TILES.get()));
            items.add(new ItemStack(ModItems.BLUE_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLUE_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.BLUE_TILES_WALL.get()));
            
            // Purple tiles
            items.add(new ItemStack(ModItems.PURPLE_TILES.get()));
            items.add(new ItemStack(ModItems.PURPLE_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.PURPLE_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.PURPLE_TILES_WALL.get()));
            
            // Magenta tiles
            items.add(new ItemStack(ModItems.MAGENTA_TILES.get()));
            items.add(new ItemStack(ModItems.MAGENTA_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.MAGENTA_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.MAGENTA_TILES_WALL.get()));
            
            // Pink tiles
            items.add(new ItemStack(ModItems.PINK_TILES.get()));
            items.add(new ItemStack(ModItems.PINK_TILES_STAIRS.get()));
            items.add(new ItemStack(ModItems.PINK_TILES_SLAB.get()));
            items.add(new ItemStack(ModItems.PINK_TILES_WALL.get()));
            
            // Bamboo blocks
            items.add(new ItemStack(ModItems.BAMBOO_BLOCK.get()));
            items.add(new ItemStack(ModItems.BAMBOO_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.BAMBOO_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.BAMBOO_BLOCK_FENCE.get()));
            items.add(new ItemStack(ModItems.BAMBOO_BLOCK_FENCE_GATE.get()));
            items.add(new ItemStack(ModItems.BAMBOO_BLOCK_BUTTON.get()));
            
            // Stripped bamboo blocks
            items.add(new ItemStack(ModItems.STRIPPED_BAMBOO_BLOCK.get()));
            items.add(new ItemStack(ModItems.STRIPPED_BAMBOO_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.STRIPPED_BAMBOO_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.STRIPPED_BAMBOO_BLOCK_FENCE.get()));
            items.add(new ItemStack(ModItems.STRIPPED_BAMBOO_BLOCK_FENCE_GATE.get()));
            items.add(new ItemStack(ModItems.STRIPPED_BAMBOO_BLOCK_BUTTON.get()));
            
            // Wood walls
            items.add(new ItemStack(ModItems.OAK_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.STRIPPED_OAK_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.SPRUCE_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.STRIPPED_SPRUCE_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.BIRCH_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.STRIPPED_BIRCH_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.DARK_OAK_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.STRIPPED_DARK_OAK_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.JUNGLE_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.STRIPPED_JUNGLE_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.ACACIA_WOOD_WALL.get()));
            items.add(new ItemStack(ModItems.STRIPPED_ACACIA_WOOD_WALL.get()));
            
            // Ashpen Plank Family - White
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_PLANKS.get()));
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_STAIRS.get()));
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_SLAB.get()));
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_BUTTON.get()));
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_FENCE.get()));
            items.add(new ItemStack(ModItems.ASHPEN_WHITE_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Light Gray
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Gray
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.GRAY_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Black
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.BLACK_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Brown
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.BROWN_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Red
            items.add(new ItemStack(ModItems.RED_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.RED_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.RED_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.RED_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.RED_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.RED_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.RED_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Orange
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.ORANGE_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Yellow
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.YELLOW_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Lime
            items.add(new ItemStack(ModItems.LIME_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.LIME_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIME_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.LIME_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.LIME_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.LIME_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.LIME_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Green
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.GREEN_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Cyan
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.CYAN_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Light Blue
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Blue
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.BLUE_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Purple
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.PURPLE_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Magenta
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.MAGENTA_ASHPEN_FENCE_GATE.get()));
            
            // Ashpen Plank Family - Pink
            items.add(new ItemStack(ModItems.PINK_ASHPEN_PLANKS.get()));
            items.add(new ItemStack(ModItems.PINK_ASHPEN_STAIRS.get()));
            items.add(new ItemStack(ModItems.PINK_ASHPEN_SLAB.get()));
            items.add(new ItemStack(ModItems.PINK_ASHPEN_BUTTON.get()));
            items.add(new ItemStack(ModItems.PINK_ASHPEN_PRESSURE_PLATE.get()));
            items.add(new ItemStack(ModItems.PINK_ASHPEN_FENCE.get()));
            items.add(new ItemStack(ModItems.PINK_ASHPEN_FENCE_GATE.get()));
            
            // Concrete variants - grouped by color (slab -> stairs -> walls)
            // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
            
            // White concrete
            items.add(new ItemStack(ModItems.WHITE_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.WHITE_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.WHITE_CONCRETE_WALL.get()));
            
            // Light gray concrete
            items.add(new ItemStack(ModItems.LIGHT_GRAY_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_CONCRETE_WALL.get()));
            
            // Gray concrete
            items.add(new ItemStack(ModItems.GRAY_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.GRAY_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.GRAY_CONCRETE_WALL.get()));
            
            // Black concrete
            items.add(new ItemStack(ModItems.BLACK_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.BLACK_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLACK_CONCRETE_WALL.get()));
            
            // Brown concrete
            items.add(new ItemStack(ModItems.BROWN_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.BROWN_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BROWN_CONCRETE_WALL.get()));
            
            // Red concrete
            items.add(new ItemStack(ModItems.RED_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.RED_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.RED_CONCRETE_WALL.get()));
            
            // Orange concrete
            items.add(new ItemStack(ModItems.ORANGE_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.ORANGE_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.ORANGE_CONCRETE_WALL.get()));
            
            // Yellow concrete
            items.add(new ItemStack(ModItems.YELLOW_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.YELLOW_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.YELLOW_CONCRETE_WALL.get()));
            
            // Lime concrete
            items.add(new ItemStack(ModItems.LIME_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.LIME_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIME_CONCRETE_WALL.get()));
            
            // Green concrete
            items.add(new ItemStack(ModItems.GREEN_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.GREEN_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.GREEN_CONCRETE_WALL.get()));
            
            // Cyan concrete
            items.add(new ItemStack(ModItems.CYAN_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.CYAN_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.CYAN_CONCRETE_WALL.get()));
            
            // Light blue concrete
            items.add(new ItemStack(ModItems.LIGHT_BLUE_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_CONCRETE_WALL.get()));
            
            // Blue concrete
            items.add(new ItemStack(ModItems.BLUE_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.BLUE_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLUE_CONCRETE_WALL.get()));
            
            // Purple concrete
            items.add(new ItemStack(ModItems.PURPLE_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.PURPLE_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.PURPLE_CONCRETE_WALL.get()));
            
            // Magenta concrete
            items.add(new ItemStack(ModItems.MAGENTA_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.MAGENTA_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.MAGENTA_CONCRETE_WALL.get()));
            
            // Pink concrete
            items.add(new ItemStack(ModItems.PINK_CONCRETE_SLAB.get()));
            items.add(new ItemStack(ModItems.PINK_CONCRETE_STAIRS.get()));
            items.add(new ItemStack(ModItems.PINK_CONCRETE_WALL.get()));
            
            // Colored sand variants - grouped by color (sand -> sandstone -> stairs -> slabs -> walls -> smooth sandstone -> smooth sandstone stairs -> smooth sandstone slabs)
            // Order: white, black, red, orange, yellow, green, blue, pink
            
            // White sand
            items.add(new ItemStack(ModItems.WHITE_SAND.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.WHITE_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.WHITE_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.WHITE_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.WHITE_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Black sand
            items.add(new ItemStack(ModItems.BLACK_SAND.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.BLACK_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.BLACK_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.BLACK_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLACK_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Red sand
            items.add(new ItemStack(ModItems.RED_SAND.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.RED_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.RED_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.RED_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.RED_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Orange sand
            items.add(new ItemStack(ModItems.ORANGE_SAND.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.ORANGE_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.ORANGE_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.ORANGE_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.ORANGE_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Yellow sand
            items.add(new ItemStack(ModItems.YELLOW_SAND.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.YELLOW_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.YELLOW_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.YELLOW_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.YELLOW_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Green sand
            items.add(new ItemStack(ModItems.GREEN_SAND.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.GREEN_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.GREEN_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.GREEN_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.GREEN_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Blue sand
            items.add(new ItemStack(ModItems.BLUE_SAND.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.BLUE_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.BLUE_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.BLUE_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.BLUE_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Pink sand
            items.add(new ItemStack(ModItems.PINK_SAND.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_SLAB.get()));
            items.add(new ItemStack(ModItems.PINK_SANDSTONE_WALL.get()));
            items.add(new ItemStack(ModItems.PINK_SMOOTH_SANDSTONE.get()));
            items.add(new ItemStack(ModItems.PINK_SMOOTH_SANDSTONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.PINK_SMOOTH_SANDSTONE_SLAB.get()));
            
            // Colored mosaic glass - grouped by color (mosaic glass -> pane)
            // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
            
            // White mosaic glass
            items.add(new ItemStack(ModItems.WHITE_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.WHITE_MOSAIC_GLASS_PANE.get()));
            
            // Light gray mosaic glass
            items.add(new ItemStack(ModItems.LIGHT_GRAY_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.LIGHT_GRAY_MOSAIC_GLASS_PANE.get()));
            
            // Gray mosaic glass
            items.add(new ItemStack(ModItems.GRAY_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.GRAY_MOSAIC_GLASS_PANE.get()));
            
            // Black mosaic glass
            items.add(new ItemStack(ModItems.BLACK_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.BLACK_MOSAIC_GLASS_PANE.get()));
            
            // Brown mosaic glass
            items.add(new ItemStack(ModItems.BROWN_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.BROWN_MOSAIC_GLASS_PANE.get()));
            
            // Red mosaic glass
            items.add(new ItemStack(ModItems.RED_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.RED_MOSAIC_GLASS_PANE.get()));
            
            // Orange mosaic glass
            items.add(new ItemStack(ModItems.ORANGE_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.ORANGE_MOSAIC_GLASS_PANE.get()));
            
            // Yellow mosaic glass
            items.add(new ItemStack(ModItems.YELLOW_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.YELLOW_MOSAIC_GLASS_PANE.get()));
            
            // Lime mosaic glass
            items.add(new ItemStack(ModItems.LIME_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.LIME_MOSAIC_GLASS_PANE.get()));
            
            // Green mosaic glass
            items.add(new ItemStack(ModItems.GREEN_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.GREEN_MOSAIC_GLASS_PANE.get()));
            
            // Cyan mosaic glass
            items.add(new ItemStack(ModItems.CYAN_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.CYAN_MOSAIC_GLASS_PANE.get()));
            
            // Light blue mosaic glass
            items.add(new ItemStack(ModItems.LIGHT_BLUE_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_MOSAIC_GLASS_PANE.get()));
            
            // Blue mosaic glass
            items.add(new ItemStack(ModItems.BLUE_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.BLUE_MOSAIC_GLASS_PANE.get()));
            
            // Purple mosaic glass
            items.add(new ItemStack(ModItems.PURPLE_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.PURPLE_MOSAIC_GLASS_PANE.get()));
            
            // Magenta mosaic glass
            items.add(new ItemStack(ModItems.MAGENTA_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.MAGENTA_MOSAIC_GLASS_PANE.get()));
            
            // Pink mosaic glass
            items.add(new ItemStack(ModItems.PINK_MOSAIC_GLASS.get()));
            items.add(new ItemStack(ModItems.PINK_MOSAIC_GLASS_PANE.get()));
            
            // Decorated Pots
            items.add(new ItemStack(ModItems.DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.WHITE_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.GRAY_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.BLACK_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.BROWN_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.RED_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.ORANGE_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.YELLOW_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.LIME_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.GREEN_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.CYAN_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.BLUE_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.PURPLE_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.MAGENTA_DECORATED_POT.get()));
            items.add(new ItemStack(ModItems.PINK_DECORATED_POT.get()));
            
            // Wool layers - all 16 colors
            items.add(new ItemStack(ModItems.WHITE_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.GRAY_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.BLACK_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.BROWN_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.RED_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.ORANGE_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.YELLOW_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.LIME_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.GREEN_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.CYAN_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.LIGHT_BLUE_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.BLUE_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.PURPLE_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.MAGENTA_WOOL_LAYERS.get()));
            items.add(new ItemStack(ModItems.PINK_WOOL_LAYERS.get()));
            
            // Pillars
            items.add(new ItemStack(ModItems.STONE_PILLAR.get()));
            items.add(new ItemStack(ModItems.MOSSY_PILLAR.get()));
            items.add(new ItemStack(ModItems.DEEPSLATE_PILLAR.get()));
            items.add(new ItemStack(ModItems.QUARTZ_PILLAR.get()));
            
            // Calcite variants
            items.add(new ItemStack(ModItems.CALCITE_STAIRS.get()));
            items.add(new ItemStack(ModItems.CALCITE_SLAB.get()));
            items.add(new ItemStack(ModItems.CALCITE_WALL.get()));
            
            // Mossy calcite variants
            items.add(new ItemStack(ModItems.MOSSY_CALCITE.get()));
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_STAIRS.get()));
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_SLAB.get()));
            items.add(new ItemStack(ModItems.MOSSY_CALCITE_WALL.get()));
            
            // Moss variants
            items.add(new ItemStack(ModItems.MOSS_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.MOSS_LAYERS.get()));
            items.add(new ItemStack(ModItems.MOSS_OVERLAY.get()));
            
            // Various slabs
            items.add(new ItemStack(ModItems.PODZOL_SLAB.get()));
            items.add(new ItemStack(ModItems.MYCELIUM_SLAB.get()));
            items.add(new ItemStack(ModItems.DIRT_SLAB.get()));
            items.add(new ItemStack(ModItems.MUD.get()));
            items.add(new ItemStack(ModItems.MUD_SLAB.get()));
            items.add(new ItemStack(ModItems.AMETHYST_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.HAY_BALE_SLAB.get()));
            
            // Dripstone variants
            items.add(new ItemStack(ModItems.DRIPSTONE_BLOCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.DRIPSTONE_BLOCK_SLAB.get()));
            items.add(new ItemStack(ModItems.DRIPSTONE_BLOCK_WALL.get()));
            
            // Polished basalt variants
            items.add(new ItemStack(ModItems.POLISHED_BASALT_STAIRS.get()));
            items.add(new ItemStack(ModItems.POLISHED_BASALT_SLAB.get()));
            items.add(new ItemStack(ModItems.POLISHED_BASALT_WALL.get()));
            
            // Smooth basalt variants
            items.add(new ItemStack(ModItems.SMOOTH_BASALT_STAIRS.get()));
            items.add(new ItemStack(ModItems.SMOOTH_BASALT_SLAB.get()));
            
            // Endstone variants
            items.add(new ItemStack(ModItems.END_STONE_STAIRS.get()));
            items.add(new ItemStack(ModItems.END_STONE_SLAB.get()));
            items.add(new ItemStack(ModItems.END_STONE_WALL.get()));
            
            // Quartz variants
            items.add(new ItemStack(ModItems.QUARTZ_BLOCK_WALL.get()));
            items.add(new ItemStack(ModItems.SMOOTH_QUARTZ_WALL.get()));
            items.add(new ItemStack(ModItems.QUARTZ_BRICKS_STAIRS.get()));
            items.add(new ItemStack(ModItems.QUARTZ_BRICKS_SLAB.get()));
            items.add(new ItemStack(ModItems.QUARTZ_BRICKS_WALL.get()));
            
            // Prismarine variants
            items.add(new ItemStack(ModItems.PRISMARINE_BRICKS_WALL.get()));
            items.add(new ItemStack(ModItems.DARK_PRISMARINE_WALL.get()));
            
            // Bedrock variants
            items.add(new ItemStack(ModItems.BEDROCK_STAIRS.get()));
            items.add(new ItemStack(ModItems.BEDROCK_SLAB.get()));
            items.add(new ItemStack(ModItems.BEDROCK_WALL.get()));
            items.add(new ItemStack(ModItems.BEDROCK_PANE.get()));
            
            // Obsidian variants
            items.add(new ItemStack(ModItems.OBSIDIAN_STAIRS.get()));
            items.add(new ItemStack(ModItems.OBSIDIAN_SLAB.get()));
            
            // Mushroom shelves
            items.add(new ItemStack(ModItems.BROWN_MUSHROOM_SHELVES.get()));
            items.add(new ItemStack(ModItems.RED_MUSHROOM_SHELVES.get()));
        }
    };

    private static ItemStack getModIcon() {
        return new ItemStack(ModItems.BIT_OXIDIZED_COPPER_BLOCK.get());
    }

    public BuildScape() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        // Register sound events FIRST so they're available when blocks are created
        com.kingodogo.buildscape.sound.ModSounds.SOUND_EVENTS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        com.kingodogo.buildscape.particle.ModParticles.PARTICLES.register(modEventBus);
        com.kingodogo.buildscape.block.ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        net.minecraftforge.fml.ModLoadingContext.get().registerConfig(
                net.minecraftforge.fml.config.ModConfig.Type.COMMON, Config.SPEC
        );

        LOGGER.info("BuildScape mod initialized!");
    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Buildscape mod initialized!");
        
        // Register network messages
        event.enqueueWork(() -> {
            com.kingodogo.buildscape.network.ModMessages.register();
        });
        
        // Initialize sound types after registries are loaded
        event.enqueueWork(() -> {
            // Force initialization of ForgeSoundTypes after registries are available
            // Note: MUD_SOUNDS() is not cached, so it's created fresh each time (volume/pitch from sounds.json)
            com.kingodogo.buildscape.sound.ModSounds.COPPER_GRATE_SOUNDS();
            com.kingodogo.buildscape.sound.ModSounds.COPPER_BULB_SOUNDS();
            // Don't pre-initialize MUD_SOUNDS to avoid caching issues - let it be created on demand
            LOGGER.info("Custom sound types initialized");
            
            // Initialize pillar particle config to ensure default file is created
            com.kingodogo.buildscape.config.PillarParticleConfig.get();
            LOGGER.info("Pillar particle config initialized");
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Buildscape mod loaded on server");
    }
    
    @SubscribeEvent
    public void onRightClickBlock(net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock event) {
        net.minecraft.world.level.block.state.BlockState state = event.getWorld().getBlockState(event.getPos());
        net.minecraft.world.item.ItemStack heldItem = event.getPlayer().getItemInHand(event.getHand());
        
        // Check if player is right-clicking bamboo block with axe (stripping)
        if (state.getBlock() == ModBlocks.BAMBOO_BLOCK.get() && 
            heldItem.getItem() instanceof net.minecraft.world.item.AxeItem) {
            
            net.minecraft.core.BlockPos pos = event.getPos();
            net.minecraft.world.level.Level level = event.getWorld();
            net.minecraft.world.entity.player.Player player = event.getPlayer();
            
            // Preserve block state properties (like axis)
            net.minecraft.core.Direction.Axis axis = 
                state.getValue(net.minecraft.world.level.block.RotatedPillarBlock.AXIS);
            
            // Convert to stripped bamboo block
            level.setBlock(pos, ModBlocks.STRIPPED_BAMBOO_BLOCK.get().defaultBlockState()
                .setValue(net.minecraft.world.level.block.RotatedPillarBlock.AXIS, axis), 3);
            
            // Play stripping sound
            level.playSound(null, pos, net.minecraft.sounds.SoundEvents.AXE_STRIP, 
                net.minecraft.sounds.SoundSource.BLOCKS, 1.0f, 1.0f);
            
            // Damage axe if not in creative
            if (!player.getAbilities().instabuild) {
                heldItem.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(event.getHand()));
            }
            
            event.setCanceled(true);
            event.setCancellationResult(net.minecraft.world.InteractionResult.SUCCESS);
            return;
        }
        
        // Check if player is right-clicking dirt block with water bottle
        if (state.getBlock() == net.minecraft.world.level.block.Blocks.DIRT && 
            heldItem.getItem() == net.minecraft.world.item.Items.POTION) {
            
            // Check if it's a water bottle (potion with no effects)
            if (net.minecraft.world.item.alchemy.PotionUtils.getPotion(heldItem) == 
                net.minecraft.world.item.alchemy.Potions.WATER) {
                
                net.minecraft.core.BlockPos pos = event.getPos();
                net.minecraft.world.level.Level level = event.getWorld();
                net.minecraft.world.entity.player.Player player = event.getPlayer();
                
                // Spawn particles on client-side for immediate visual feedback
                if (level.isClientSide) {
                    spawnSplashParticles(level, pos);
                    return; // Don't process on client, let server handle conversion
                }
                
                // Server-side: convert dirt to mud
                level.setBlock(pos, ModBlocks.MUD.get().defaultBlockState(), 3);
                
                // Play bottle emptying sound (like cauldron)
                level.playSound(null, pos, net.minecraft.sounds.SoundEvents.BOTTLE_EMPTY, 
                    net.minecraft.sounds.SoundSource.BLOCKS, 1.0f, 1.0f);
                
                // Consume water bottle and give empty bottle
                if (!player.getAbilities().instabuild) {
                    heldItem.shrink(1);
                    net.minecraft.world.item.ItemStack emptyBottle = new net.minecraft.world.item.ItemStack(net.minecraft.world.item.Items.GLASS_BOTTLE);
                    if (heldItem.isEmpty()) {
                        player.setItemInHand(event.getHand(), emptyBottle);
                    } else if (!player.getInventory().add(emptyBottle)) {
                        player.drop(emptyBottle, false);
                    }
                }
                
                // Spawn splash particles (server-side, will sync to all clients)
                spawnSplashParticles(level, pos);
                
                event.setCanceled(true);
                event.setCancellationResult(net.minecraft.world.InteractionResult.SUCCESS);
            }
        }
    }
    
    private void spawnSplashParticles(net.minecraft.world.level.Level level, net.minecraft.core.BlockPos pos) {
        // Spawn splash particles at the block position - use sendParticles to sync to all clients
        if (level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
            // Send particles to all nearby players (within 32 blocks)
            // Method signature: sendParticles(ParticleOptions, x, y, z, count, xSpread, ySpread, zSpread, speed)
            serverLevel.sendParticles(
                net.minecraft.core.particles.ParticleTypes.SPLASH,
                pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5, // Center position
                8, // Count
                0.5, 0.3, 0.5, // Spread (x, y, z)
                0.1 // Speed
            );
        } else if (level.isClientSide) {
            // Client-side: spawn particles directly
            for (int i = 0; i < 8; ++i) {
                double x = pos.getX() + 0.5 + (level.random.nextDouble() - 0.5) * 0.5;
                double y = pos.getY() + 1.0 + level.random.nextDouble() * 0.3;
                double z = pos.getZ() + 0.5 + (level.random.nextDouble() - 0.5) * 0.5;
                double vx = (level.random.nextDouble() - 0.5) * 0.1;
                double vy = level.random.nextDouble() * 0.1;
                double vz = (level.random.nextDouble() - 0.5) * 0.1;
                level.addParticle(net.minecraft.core.particles.ParticleTypes.SPLASH, x, y, z, vx, vy, vz);
            }
        }
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Buildscape mod client setup complete");
            
            // Register keybinds
            event.enqueueWork(() -> {
                com.kingodogo.buildscape.client.ModKeyBinds.register();
            });
            
            // Initialize config reload callback for instant particle updates
            event.enqueueWork(() -> {
                com.kingodogo.buildscape.client.ClientEvents.initializeConfigCallback();
            });
            
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
                // Particle factory will be registered via ParticleFactoryRegisterEvent
                
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
                
                // Climbable chains - cutout for full transparency (fully transparent, not semi-transparent)
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIAMOND_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLD_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMERALD_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANCIENT_STEEL_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHERITE_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                
                // Large chains - cutout for full transparency
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_IRON_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_GOLD_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_DIAMOND_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_EMERALD_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_ANCIENT_STEEL_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LARGE_NETHERITE_CHAIN.get(), net.minecraft.client.renderer.RenderType.cutout());
                
                // Register translucent render layer for copper grates
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_EXPOSED_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_WEATHERED_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIT_OXIDIZED_COPPER_GRATE.get(), net.minecraft.client.renderer.RenderType.translucent());
                
                // Register BlockEntity renderers
                net.minecraft.client.renderer.blockentity.BlockEntityRenderers.register(
                    com.kingodogo.buildscape.block.ModBlockEntities.PILLAR_BLOCK_ENTITY.get(),
                    com.kingodogo.buildscape.client.renderer.PillarBlockEntityRenderer::new
                );
                net.minecraft.client.renderer.blockentity.BlockEntityRenderers.register(
                    com.kingodogo.buildscape.block.ModBlockEntities.DECORATED_POT_BLOCK_ENTITY.get(),
                    com.kingodogo.buildscape.client.renderer.DecoratedPotBlockEntityRenderer::new
                );
                
                // Register cutout render type for decorated pots
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
                net.minecraft.client.renderer.ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_DECORATED_POT.get(), net.minecraft.client.renderer.RenderType.cutout());
            });
        }

        @SubscribeEvent
        public static void registerFactories(net.minecraftforge.client.event.ParticleFactoryRegisterEvent event) {
            net.minecraft.client.Minecraft.getInstance().particleEngine.register(
                com.kingodogo.buildscape.particle.ModParticles.GLOW_LIME_SPARKLE.get(),
                sprites -> new com.kingodogo.buildscape.particle.PillarSparkleParticle.Provider(sprites)
            );
        }
    }
}
// Kingodogo finished the project at 2025-11-02 12:13:45
