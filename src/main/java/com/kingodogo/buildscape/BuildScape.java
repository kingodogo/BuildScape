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
import org.slf4j.Logger;

import com.kingodogo.buildscape.block.ModBlocks;
import com.kingodogo.buildscape.item.ModItems;

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
                // Add all items to the creative tab (items represent the blocks)
                ModItems.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
            })
            .build());

    private static ItemStack getModIcon() {
        // Try to use the mod icon if available, otherwise fall back to polished stone
        try {
            // For now, use polished stone as icon until user adds their icon
            // TODO: Implement custom icon loading when buildscape.png is added
            return ModItems.POLISHED_STONE_ITEM.get().getDefaultInstance();
        } catch (Exception e) {
            // Fallback to polished stone if icon loading fails
            return ModItems.POLISHED_STONE_ITEM.get().getDefaultInstance();
        }
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
    }
}