package com.kingodogo.buildscape;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.item.ModItems;
import com.kingodogo.buildscape.data.ModLootTableProvider;
import com.kingodogo.buildscape.data.ModBlockTagsProvider;

@Mod(BuildScape.MODID)
public class BuildScape {
    
    public static final String MODID = "buildscape";
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    
    public static final RegistryObject<CreativeModeTab> BUILDSCAPE_TAB = CREATIVE_MODE_TABS.register("buildscape", 
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
            .title(net.minecraft.network.chat.Component.translatable("itemGroup.buildscape"))
            .icon(() -> getModIcon())
            .displayItems((parameters, output) -> {
                // Add items in organized order matching ModBlocks.java pattern
                // Bit copper variants - Fresh
                output.accept(ModItems.BIT_COPPER_BLOCK_ITEM.get());
                output.accept(ModItems.BIT_COPPER_BLOCK_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_COPPER_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.BIT_COPPER_BLOCK_WALL_ITEM.get());
                output.accept(ModItems.BIT_CUT_COPPER_ITEM.get());
                output.accept(ModItems.BIT_CUT_COPPER_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_CUT_COPPER_SLAB_ITEM.get());
                output.accept(ModItems.BIT_CUT_COPPER_WALL_ITEM.get());
                output.accept(ModItems.BIT_CHISELED_COPPER_ITEM.get());
                output.accept(ModItems.BIT_COPPER_BULB_ITEM.get());
                output.accept(ModItems.BIT_COPPER_GRATE_ITEM.get());
                
                // Bit copper variants - Exposed
                output.accept(ModItems.BIT_EXPOSED_COPPER_BLOCK_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_COPPER_BLOCK_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_COPPER_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_COPPER_BLOCK_WALL_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_CUT_COPPER_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_CUT_COPPER_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_CUT_COPPER_SLAB_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_CUT_COPPER_WALL_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_CHISELED_COPPER_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_COPPER_BULB_ITEM.get());
                output.accept(ModItems.BIT_EXPOSED_COPPER_GRATE_ITEM.get());
                
                // Bit copper variants - Weathered
                output.accept(ModItems.BIT_WEATHERED_COPPER_BLOCK_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_COPPER_BLOCK_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_COPPER_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_COPPER_BLOCK_WALL_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_CUT_COPPER_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_CUT_COPPER_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_CUT_COPPER_SLAB_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_CUT_COPPER_WALL_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_CHISELED_COPPER_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_COPPER_BULB_ITEM.get());
                output.accept(ModItems.BIT_WEATHERED_COPPER_GRATE_ITEM.get());
                
                // Bit copper variants - Oxidized
                output.accept(ModItems.BIT_OXIDIZED_COPPER_BLOCK_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_COPPER_BLOCK_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_COPPER_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_COPPER_BLOCK_WALL_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_CUT_COPPER_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_CUT_COPPER_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_CUT_COPPER_SLAB_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_CUT_COPPER_WALL_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_CHISELED_COPPER_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_COPPER_BULB_ITEM.get());
                output.accept(ModItems.BIT_OXIDIZED_COPPER_GRATE_ITEM.get());
                
                // Tuff variants
                output.accept(ModItems.BIT_CHISELED_TUFF_ITEM.get());
                output.accept(ModItems.BIT_CHISELED_TUFF_BRICKS_ITEM.get());
                output.accept(ModItems.BIT_POLISHED_TUFF_ITEM.get());
                output.accept(ModItems.BIT_POLISHED_TUFF_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_POLISHED_TUFF_SLAB_ITEM.get());
                output.accept(ModItems.BIT_POLISHED_TUFF_WALL_ITEM.get());
                output.accept(ModItems.BIT_TUFF_BRICKS_ITEM.get());
                output.accept(ModItems.BIT_TUFF_BRICKS_STAIRS_ITEM.get());
                output.accept(ModItems.BIT_TUFF_BRICKS_SLAB_ITEM.get());
                output.accept(ModItems.BIT_TUFF_BRICKS_WALL_ITEM.get());
                
                // Colored tiles - grouped by color (tile -> stairs -> slabs -> walls)
                // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
                
                // White tiles
                output.accept(ModItems.WHITE_TILES_ITEM.get());
                output.accept(ModItems.WHITE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.WHITE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.WHITE_TILES_WALL_ITEM.get());
                
                // Light gray tiles
                output.accept(ModItems.LIGHT_GRAY_TILES_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_TILES_SLAB_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_TILES_WALL_ITEM.get());
                
                // Gray tiles
                output.accept(ModItems.GRAY_TILES_ITEM.get());
                output.accept(ModItems.GRAY_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.GRAY_TILES_SLAB_ITEM.get());
                output.accept(ModItems.GRAY_TILES_WALL_ITEM.get());
                
                // Black tiles
                output.accept(ModItems.BLACK_TILES_ITEM.get());
                output.accept(ModItems.BLACK_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.BLACK_TILES_SLAB_ITEM.get());
                output.accept(ModItems.BLACK_TILES_WALL_ITEM.get());
                
                // Brown tiles
                output.accept(ModItems.BROWN_TILES_ITEM.get());
                output.accept(ModItems.BROWN_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.BROWN_TILES_SLAB_ITEM.get());
                output.accept(ModItems.BROWN_TILES_WALL_ITEM.get());
                
                // Red tiles
                output.accept(ModItems.RED_TILES_ITEM.get());
                output.accept(ModItems.RED_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.RED_TILES_SLAB_ITEM.get());
                output.accept(ModItems.RED_TILES_WALL_ITEM.get());
                
                // Orange tiles
                output.accept(ModItems.ORANGE_TILES_ITEM.get());
                output.accept(ModItems.ORANGE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.ORANGE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.ORANGE_TILES_WALL_ITEM.get());
                
                // Yellow tiles
                output.accept(ModItems.YELLOW_TILES_ITEM.get());
                output.accept(ModItems.YELLOW_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.YELLOW_TILES_SLAB_ITEM.get());
                output.accept(ModItems.YELLOW_TILES_WALL_ITEM.get());
                
                // Lime tiles
                output.accept(ModItems.LIME_TILES_ITEM.get());
                output.accept(ModItems.LIME_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.LIME_TILES_SLAB_ITEM.get());
                output.accept(ModItems.LIME_TILES_WALL_ITEM.get());
                
                // Green tiles
                output.accept(ModItems.GREEN_TILES_ITEM.get());
                output.accept(ModItems.GREEN_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.GREEN_TILES_SLAB_ITEM.get());
                output.accept(ModItems.GREEN_TILES_WALL_ITEM.get());
                
                // Cyan tiles
                output.accept(ModItems.CYAN_TILES_ITEM.get());
                output.accept(ModItems.CYAN_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.CYAN_TILES_SLAB_ITEM.get());
                output.accept(ModItems.CYAN_TILES_WALL_ITEM.get());
                
                // Light blue tiles
                output.accept(ModItems.LIGHT_BLUE_TILES_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_TILES_WALL_ITEM.get());
                
                // Blue tiles
                output.accept(ModItems.BLUE_TILES_ITEM.get());
                output.accept(ModItems.BLUE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.BLUE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.BLUE_TILES_WALL_ITEM.get());
                
                // Purple tiles
                output.accept(ModItems.PURPLE_TILES_ITEM.get());
                output.accept(ModItems.PURPLE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.PURPLE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.PURPLE_TILES_WALL_ITEM.get());
                
                // Magenta tiles
                output.accept(ModItems.MAGENTA_TILES_ITEM.get());
                output.accept(ModItems.MAGENTA_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.MAGENTA_TILES_SLAB_ITEM.get());
                output.accept(ModItems.MAGENTA_TILES_WALL_ITEM.get());
                
                // Pink tiles
                output.accept(ModItems.PINK_TILES_ITEM.get());
                output.accept(ModItems.PINK_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.PINK_TILES_SLAB_ITEM.get());
                output.accept(ModItems.PINK_TILES_WALL_ITEM.get());
                
                // Colored mosaic glass - grouped by color (mosaic glass -> pane)
                // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
                
                // White mosaic glass
                output.accept(ModItems.WHITE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.WHITE_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Light gray mosaic glass
                output.accept(ModItems.LIGHT_GRAY_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Gray mosaic glass
                output.accept(ModItems.GRAY_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.GRAY_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Black mosaic glass
                output.accept(ModItems.BLACK_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.BLACK_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Brown mosaic glass
                output.accept(ModItems.BROWN_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.BROWN_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Red mosaic glass
                output.accept(ModItems.RED_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.RED_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Orange mosaic glass
                output.accept(ModItems.ORANGE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.ORANGE_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Yellow mosaic glass
                output.accept(ModItems.YELLOW_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.YELLOW_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Lime mosaic glass
                output.accept(ModItems.LIME_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.LIME_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Green mosaic glass
                output.accept(ModItems.GREEN_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.GREEN_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Cyan mosaic glass
                output.accept(ModItems.CYAN_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.CYAN_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Light blue mosaic glass
                output.accept(ModItems.LIGHT_BLUE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Blue mosaic glass
                output.accept(ModItems.BLUE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.BLUE_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Purple mosaic glass
                output.accept(ModItems.PURPLE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.PURPLE_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Magenta mosaic glass
                output.accept(ModItems.MAGENTA_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.MAGENTA_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Pink mosaic glass
                output.accept(ModItems.PINK_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.PINK_MOSAIC_GLASS_PANE_ITEM.get());
                
                // Calcite variants
                output.accept(ModItems.CALCITE_STAIRS_ITEM.get());
                output.accept(ModItems.CALCITE_SLAB_ITEM.get());
                output.accept(ModItems.CALCITE_WALL_ITEM.get());
                
                // Mossy calcite variants
                output.accept(ModItems.MOSSY_CALCITE_ITEM.get());
                output.accept(ModItems.MOSSY_CALCITE_STAIRS_ITEM.get());
                output.accept(ModItems.MOSSY_CALCITE_SLAB_ITEM.get());
                output.accept(ModItems.MOSSY_CALCITE_WALL_ITEM.get());
                
                // Moss variants
                output.accept(ModItems.MOSS_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.MOSS_LAYERS_ITEM.get());
                output.accept(ModItems.MOSS_OVERLAY_ITEM.get());
                
                // Various slabs
                output.accept(ModItems.PODZOL_SLAB_ITEM.get());
                output.accept(ModItems.MYCELIUM_SLAB_ITEM.get());
                output.accept(ModItems.DIRT_SLAB_ITEM.get());
                output.accept(ModItems.MUD_SLAB_ITEM.get());
                output.accept(ModItems.AMETHYST_BLOCK_SLAB_ITEM.get());
                
                // Colored sand variants - grouped by color (sand -> sandstone -> stairs -> slabs -> walls -> smooth sandstone -> smooth sandstone stairs -> smooth sandstone slabs)
                // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink
                
                // White sand
                output.accept(ModItems.WHITE_SAND_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.WHITE_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.WHITE_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.WHITE_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Black sand
                output.accept(ModItems.BLACK_SAND_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.BLACK_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLACK_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLACK_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Red sand
                output.accept(ModItems.RED_SAND_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.RED_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.RED_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.RED_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Orange sand
                output.accept(ModItems.ORANGE_SAND_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.ORANGE_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.ORANGE_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.ORANGE_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Yellow sand
                output.accept(ModItems.YELLOW_SAND_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.YELLOW_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.YELLOW_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.YELLOW_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Green sand
                output.accept(ModItems.GREEN_SAND_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.GREEN_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.GREEN_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.GREEN_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Blue sand
                output.accept(ModItems.BLUE_SAND_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.BLUE_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLUE_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLUE_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Pink sand
                output.accept(ModItems.PINK_SAND_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.PINK_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.PINK_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.PINK_SMOOTH_SANDSTONE_SLAB_ITEM.get());
                
                // Dripstone variants
                output.accept(ModItems.DRIPSTONE_BLOCK_STAIRS_ITEM.get());
                output.accept(ModItems.DRIPSTONE_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.DRIPSTONE_BLOCK_WALL_ITEM.get());
                
                // Polished basalt variants
                output.accept(ModItems.POLISHED_BASALT_STAIRS_ITEM.get());
                output.accept(ModItems.POLISHED_BASALT_SLAB_ITEM.get());
                output.accept(ModItems.POLISHED_BASALT_WALL_ITEM.get());
                
                // Smooth basalt variants
                output.accept(ModItems.SMOOTH_BASALT_STAIRS_ITEM.get());
                output.accept(ModItems.SMOOTH_BASALT_SLAB_ITEM.get());
                
                // Endstone variants
                output.accept(ModItems.END_STONE_STAIRS_ITEM.get());
                output.accept(ModItems.END_STONE_SLAB_ITEM.get());
                output.accept(ModItems.END_STONE_WALL_ITEM.get());
                
                // Quartz variants
                output.accept(ModItems.QUARTZ_BLOCK_WALL_ITEM.get());
                output.accept(ModItems.SMOOTH_QUARTZ_WALL_ITEM.get());
                output.accept(ModItems.QUARTZ_BRICKS_STAIRS_ITEM.get());
                output.accept(ModItems.QUARTZ_BRICKS_SLAB_ITEM.get());
                output.accept(ModItems.QUARTZ_BRICKS_WALL_ITEM.get());
                
                // Prismarine variants
                output.accept(ModItems.PRISMARINE_BRICKS_WALL_ITEM.get());
                output.accept(ModItems.DARK_PRISMARINE_WALL_ITEM.get());
                
                // Bedrock variants
                output.accept(ModItems.BEDROCK_STAIRS_ITEM.get());
                output.accept(ModItems.BEDROCK_SLAB_ITEM.get());
                output.accept(ModItems.BEDROCK_WALL_ITEM.get());
                output.accept(ModItems.BEDROCK_PANE_ITEM.get());
            })
            .build());

    private static ItemStack getModIcon() {
        // Use bit copper block as icon
        return new ItemStack(ModItems.BIT_COPPER_BLOCK_ITEM.get());
    }
    public BuildScape(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Buildscape mod initialized!");
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
        }
        
        // @SubscribeEvent
        // public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        //     // Register biome color handler for grass slab
        //     event.register((state, reader, pos, tintIndex) -> {
        //         if (reader == null || pos == null) {
        //             return -1;
        //         }
        //         return net.minecraft.client.renderer.BiomeColors.getAverageGrassColor(reader, pos);
        //     }, ModBlocks.GRASS_BLOCK_SLAB.get());
        // }

        // @SubscribeEvent
        // public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        //     event.register(
        //         (stack, tintIndex) ->
        //             net.minecraft.client.Minecraft.getInstance().getBlockColors()
        //                 .getColor(ModBlocks.GRASS_BLOCK_SLAB.get().defaultBlockState(), null, null, tintIndex),
        //         com.kingodogo.buildscape.item.ModItems.GRASS_BLOCK_SLAB_ITEM.get()
        //     );
        // }
    }
    
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusSubscriber {
        @SubscribeEvent
        public static void onGatherData(GatherDataEvent event) {
            var generator = event.getGenerator();
            var packOutput = generator.getPackOutput();
            var lookupProvider = event.getLookupProvider();
            
            // Add loot table provider
            generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput, lookupProvider));
            
            // Add block tags provider
            generator.addProvider(event.includeServer(), new ModBlockTagsProvider(packOutput, lookupProvider, event.getExistingFileHelper()));
        }
    }
}