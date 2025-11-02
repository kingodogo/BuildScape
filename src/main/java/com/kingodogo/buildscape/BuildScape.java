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

    // <colored> Creative mode tab registration for BuildScape mod items
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // <colored> Main creative tab displaying all mod blocks and items in organized groups
    public static final RegistryObject<CreativeModeTab> BUILDSCAPE_TAB = CREATIVE_MODE_TABS.register("buildscape",
        () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS)
            .title(net.minecraft.network.chat.Component.translatable("itemGroup.buildscape"))
            .icon(() -> getModIcon())
            .displayItems((parameters, output) -> {
                // <colored> Bit copper variants - Fresh
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

                // <colored> Bit copper variants - Exposed
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

                // <colored> Bit copper variants - Weathered
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

                // <colored> Bit copper variants - Oxidized
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

                // <colored> Tuff variants
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

                // <colored> Colored tiles - grouped by color (tile -> stairs -> slabs -> walls)
                // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink

                output.accept(ModItems.WHITE_TILES_ITEM.get());
                output.accept(ModItems.WHITE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.WHITE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.WHITE_TILES_WALL_ITEM.get());

                output.accept(ModItems.LIGHT_GRAY_TILES_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_TILES_SLAB_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_TILES_WALL_ITEM.get());

                output.accept(ModItems.GRAY_TILES_ITEM.get());
                output.accept(ModItems.GRAY_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.GRAY_TILES_SLAB_ITEM.get());
                output.accept(ModItems.GRAY_TILES_WALL_ITEM.get());

                output.accept(ModItems.BLACK_TILES_ITEM.get());
                output.accept(ModItems.BLACK_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.BLACK_TILES_SLAB_ITEM.get());
                output.accept(ModItems.BLACK_TILES_WALL_ITEM.get());

                output.accept(ModItems.BROWN_TILES_ITEM.get());
                output.accept(ModItems.BROWN_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.BROWN_TILES_SLAB_ITEM.get());
                output.accept(ModItems.BROWN_TILES_WALL_ITEM.get());

                output.accept(ModItems.RED_TILES_ITEM.get());
                output.accept(ModItems.RED_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.RED_TILES_SLAB_ITEM.get());
                output.accept(ModItems.RED_TILES_WALL_ITEM.get());

                output.accept(ModItems.ORANGE_TILES_ITEM.get());
                output.accept(ModItems.ORANGE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.ORANGE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.ORANGE_TILES_WALL_ITEM.get());

                output.accept(ModItems.YELLOW_TILES_ITEM.get());
                output.accept(ModItems.YELLOW_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.YELLOW_TILES_SLAB_ITEM.get());
                output.accept(ModItems.YELLOW_TILES_WALL_ITEM.get());

                output.accept(ModItems.LIME_TILES_ITEM.get());
                output.accept(ModItems.LIME_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.LIME_TILES_SLAB_ITEM.get());
                output.accept(ModItems.LIME_TILES_WALL_ITEM.get());

                output.accept(ModItems.GREEN_TILES_ITEM.get());
                output.accept(ModItems.GREEN_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.GREEN_TILES_SLAB_ITEM.get());
                output.accept(ModItems.GREEN_TILES_WALL_ITEM.get());

                output.accept(ModItems.CYAN_TILES_ITEM.get());
                output.accept(ModItems.CYAN_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.CYAN_TILES_SLAB_ITEM.get());
                output.accept(ModItems.CYAN_TILES_WALL_ITEM.get());

                output.accept(ModItems.LIGHT_BLUE_TILES_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_TILES_WALL_ITEM.get());

                output.accept(ModItems.BLUE_TILES_ITEM.get());
                output.accept(ModItems.BLUE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.BLUE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.BLUE_TILES_WALL_ITEM.get());

                output.accept(ModItems.PURPLE_TILES_ITEM.get());
                output.accept(ModItems.PURPLE_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.PURPLE_TILES_SLAB_ITEM.get());
                output.accept(ModItems.PURPLE_TILES_WALL_ITEM.get());

                output.accept(ModItems.MAGENTA_TILES_ITEM.get());
                output.accept(ModItems.MAGENTA_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.MAGENTA_TILES_SLAB_ITEM.get());
                output.accept(ModItems.MAGENTA_TILES_WALL_ITEM.get());

                output.accept(ModItems.PINK_TILES_ITEM.get());
                output.accept(ModItems.PINK_TILES_STAIRS_ITEM.get());
                output.accept(ModItems.PINK_TILES_SLAB_ITEM.get());
                output.accept(ModItems.PINK_TILES_WALL_ITEM.get());

                // <colored> Colored mosaic glass - grouped by color (mosaic glass -> pane)
                // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink

                output.accept(ModItems.WHITE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.WHITE_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.LIGHT_GRAY_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.LIGHT_GRAY_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.GRAY_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.GRAY_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.BLACK_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.BLACK_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.BROWN_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.BROWN_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.RED_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.RED_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.ORANGE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.ORANGE_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.YELLOW_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.YELLOW_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.LIME_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.LIME_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.GREEN_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.GREEN_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.CYAN_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.CYAN_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.LIGHT_BLUE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.LIGHT_BLUE_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.BLUE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.BLUE_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.PURPLE_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.PURPLE_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.MAGENTA_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.MAGENTA_MOSAIC_GLASS_PANE_ITEM.get());

                output.accept(ModItems.PINK_MOSAIC_GLASS_ITEM.get());
                output.accept(ModItems.PINK_MOSAIC_GLASS_PANE_ITEM.get());

                // <colored> Calcite variants
                output.accept(ModItems.CALCITE_STAIRS_ITEM.get());
                output.accept(ModItems.CALCITE_SLAB_ITEM.get());
                output.accept(ModItems.CALCITE_WALL_ITEM.get());

                // <colored> Mossy calcite variants
                output.accept(ModItems.MOSSY_CALCITE_ITEM.get());
                output.accept(ModItems.MOSSY_CALCITE_STAIRS_ITEM.get());
                output.accept(ModItems.MOSSY_CALCITE_SLAB_ITEM.get());
                output.accept(ModItems.MOSSY_CALCITE_WALL_ITEM.get());

                // <colored> Moss variants
                output.accept(ModItems.MOSS_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.MOSS_LAYERS_ITEM.get());
                output.accept(ModItems.MOSS_OVERLAY_ITEM.get());

                // <colored> Various slabs
                output.accept(ModItems.PODZOL_SLAB_ITEM.get());
                output.accept(ModItems.MYCELIUM_SLAB_ITEM.get());
                output.accept(ModItems.DIRT_SLAB_ITEM.get());
                output.accept(ModItems.MUD_SLAB_ITEM.get());
                output.accept(ModItems.AMETHYST_BLOCK_SLAB_ITEM.get());

                // <colored> Colored sand variants - grouped by color (sand -> sandstone -> stairs -> slabs -> walls -> smooth sandstone -> smooth sandstone stairs -> smooth sandstone slabs)
                // Order: white, light grey, gray, black, brown, red, orange, yellow, lime, green, cyan, light blue, blue, purple, magenta, pink

                output.accept(ModItems.WHITE_SAND_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.WHITE_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.WHITE_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.WHITE_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.WHITE_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.BLACK_SAND_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.BLACK_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.BLACK_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLACK_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLACK_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.RED_SAND_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.RED_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.RED_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.RED_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.RED_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.ORANGE_SAND_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.ORANGE_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.ORANGE_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.ORANGE_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.ORANGE_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.YELLOW_SAND_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.YELLOW_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.YELLOW_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.YELLOW_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.YELLOW_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.GREEN_SAND_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.GREEN_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.GREEN_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.GREEN_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.GREEN_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.BLUE_SAND_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.BLUE_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.BLUE_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.BLUE_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.BLUE_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                output.accept(ModItems.PINK_SAND_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_SLAB_ITEM.get());
                output.accept(ModItems.PINK_SANDSTONE_WALL_ITEM.get());
                output.accept(ModItems.PINK_SMOOTH_SANDSTONE_ITEM.get());
                output.accept(ModItems.PINK_SMOOTH_SANDSTONE_STAIRS_ITEM.get());
                output.accept(ModItems.PINK_SMOOTH_SANDSTONE_SLAB_ITEM.get());

                // <colored> Dripstone variants
                output.accept(ModItems.DRIPSTONE_BLOCK_STAIRS_ITEM.get());
                output.accept(ModItems.DRIPSTONE_BLOCK_SLAB_ITEM.get());
                output.accept(ModItems.DRIPSTONE_BLOCK_WALL_ITEM.get());

                // <colored> Polished basalt variants
                output.accept(ModItems.POLISHED_BASALT_STAIRS_ITEM.get());
                output.accept(ModItems.POLISHED_BASALT_SLAB_ITEM.get());
                output.accept(ModItems.POLISHED_BASALT_WALL_ITEM.get());

                // <colored> Smooth basalt variants
                output.accept(ModItems.SMOOTH_BASALT_STAIRS_ITEM.get());
                output.accept(ModItems.SMOOTH_BASALT_SLAB_ITEM.get());

                // <colored> Endstone variants
                output.accept(ModItems.END_STONE_STAIRS_ITEM.get());
                output.accept(ModItems.END_STONE_SLAB_ITEM.get());
                output.accept(ModItems.END_STONE_WALL_ITEM.get());

                // <colored> Quartz variants
                output.accept(ModItems.QUARTZ_BLOCK_WALL_ITEM.get());
                output.accept(ModItems.SMOOTH_QUARTZ_WALL_ITEM.get());
                output.accept(ModItems.QUARTZ_BRICKS_STAIRS_ITEM.get());
                output.accept(ModItems.QUARTZ_BRICKS_SLAB_ITEM.get());
                output.accept(ModItems.QUARTZ_BRICKS_WALL_ITEM.get());

                // <colored> Prismarine variants
                output.accept(ModItems.PRISMARINE_BRICKS_WALL_ITEM.get());
                output.accept(ModItems.DARK_PRISMARINE_WALL_ITEM.get());

                // <colored> Bedrock variants
                output.accept(ModItems.BEDROCK_STAIRS_ITEM.get());
                output.accept(ModItems.BEDROCK_SLAB_ITEM.get());
                output.accept(ModItems.BEDROCK_WALL_ITEM.get());
                output.accept(ModItems.BEDROCK_PANE_ITEM.get());

                // <colored> Obsidian variants
                output.accept(ModItems.OBSIDIAN_STAIRS_ITEM.get());
                output.accept(ModItems.OBSIDIAN_SLAB_ITEM.get());
            })
            .build());

    // <item> Returns the item stack used as the creative tab icon
    private static ItemStack getModIcon() {
        return new ItemStack(ModItems.BIT_COPPER_BLOCK_ITEM.get());
    }

    // <item> Mod constructor - registers blocks, items, creative tabs, and event handlers
    public BuildScape(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    // <item> Common setup method called during mod initialization
    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Buildscape mod initialized!");
    }

    // <item> Server startup event handler
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Buildscape mod loaded on server");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        // <item> Client setup event handler
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Buildscape mod client setup complete");
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusSubscriber {
        // <item> Registers data providers for loot tables and block tags during data generation
        @SubscribeEvent
        public static void onGatherData(GatherDataEvent event) {
            var generator = event.getGenerator();
            var packOutput = generator.getPackOutput();
            var lookupProvider = event.getLookupProvider();

            generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput, lookupProvider));
            generator.addProvider(event.includeServer(), new ModBlockTagsProvider(packOutput, lookupProvider, event.getExistingFileHelper()));
        }
    }
}