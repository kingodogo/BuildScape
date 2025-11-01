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
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import com.kingodogo.buildscape.data.ModBlockLootTables;

@Mod(BuildScape.MODID)
public class BuildScape {
    
    public static final String MODID = "buildscape";
    private static final Logger LOGGER = LogManager.getLogger();
    
    // Creative mode tab - registered directly in 1.18.2
    public static final CreativeModeTab BUILDSCAPE_TAB = new CreativeModeTab("buildscape") {
        @Override
        public ItemStack makeIcon() {
            return getModIcon();
        }
        
        @Override
        public void fillItemList(net.minecraft.core.NonNullList<ItemStack> items) {
            // Add all items to the creative tab (items represent the blocks)
            ModItems.ITEMS.getEntries().forEach(item -> items.add(new ItemStack(item.get())));
        }
    };

    private static ItemStack getModIcon() {
        // Use bit copper block as icon
        return new ItemStack(ModItems.BIT_COPPER_BLOCK_ITEM.get());
    }

    public BuildScape() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::gatherData);

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
    }
    
    // [Architect]: Register data generators for loot tables
    private void gatherData(final GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new ModBlockLootTables(generator));
        }
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
            // [Texturist]: Setting translucent render type for all mosaic glass blocks and panes
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
            });
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
    
    // Data generation removed - using static JSON files instead
    // For 1.18.2, all recipes, loot tables, and tags are in JSON format
}
