package com.kingodogo.buildscape.sound;

import com.kingodogo.buildscape.BuildScape;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class ModSounds {
    private static final Logger LOGGER = LogManager.getLogger();
    
    // Register sound events for copper sounds under our mod namespace
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
        DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BuildScape.MODID);

    // --- Copper Grate Sound Events ---
    public static final RegistryObject<SoundEvent> COPPER_GRATE_BREAK = registerSoundEvent("block.copper_grate.break");
    public static final RegistryObject<SoundEvent> COPPER_GRATE_STEP = registerSoundEvent("block.copper_grate.step");
    
    // For place, hit, and fall, reuse step sound since copper_grate only has break and step sounds
    public static final RegistryObject<SoundEvent> COPPER_GRATE_PLACE = COPPER_GRATE_STEP;
    public static final RegistryObject<SoundEvent> COPPER_GRATE_HIT = COPPER_GRATE_STEP;
    public static final RegistryObject<SoundEvent> COPPER_GRATE_FALL = COPPER_GRATE_STEP;

    // --- Copper Bulb Sound Events ---
    public static final RegistryObject<SoundEvent> COPPER_BULB_BREAK = registerSoundEvent("block.copper_bulb.break");
    public static final RegistryObject<SoundEvent> COPPER_BULB_PLACE = registerSoundEvent("block.copper_bulb.place");
    public static final RegistryObject<SoundEvent> COPPER_BULB_STEP = registerSoundEvent("block.copper_bulb.step");
    public static final RegistryObject<SoundEvent> COPPER_BULB_TOGGLE = registerSoundEvent("block.copper_bulb.toggle");
    
    // For hit and fall, reuse step sound
    public static final RegistryObject<SoundEvent> COPPER_BULB_HIT = COPPER_BULB_STEP;
    public static final RegistryObject<SoundEvent> COPPER_BULB_FALL = COPPER_BULB_STEP;

    // --- Mud Sound Events ---
    public static final RegistryObject<SoundEvent> MUD_BREAK = registerSoundEvent("block.mud.break");
    public static final RegistryObject<SoundEvent> MUD_STEP = registerSoundEvent("block.mud.step");
    
    // For place, hit, and fall, reuse step sound
    public static final RegistryObject<SoundEvent> MUD_PLACE = MUD_STEP;
    public static final RegistryObject<SoundEvent> MUD_HIT = MUD_STEP;
    public static final RegistryObject<SoundEvent> MUD_FALL = MUD_STEP;

    // --- Sound Types using ForgeSoundType ---
    // Lazy initialization with safe Supplier wrappers that check if RegistryObjects are ready
    private static ForgeSoundType copperGrateSounds = null;
    private static ForgeSoundType copperBulbSounds = null;
    private static ForgeSoundType mudSounds = null;
    
    public static ForgeSoundType COPPER_GRATE_SOUNDS() {
        if (copperGrateSounds == null) {
            try {
                // Create Suppliers that safely get the SoundEvents
                Supplier<SoundEvent> breakSound = () -> {
                    if (COPPER_GRATE_BREAK.isPresent()) {
                        return COPPER_GRATE_BREAK.get();
                    }
                    LOGGER.warn("Copper grate break sound not ready, using COPPER fallback");
                    return net.minecraft.sounds.SoundEvents.COPPER_BREAK;
                };
                Supplier<SoundEvent> stepSound = () -> {
                    if (COPPER_GRATE_STEP.isPresent()) {
                        return COPPER_GRATE_STEP.get();
                    }
                    LOGGER.warn("Copper grate step sound not ready, using COPPER fallback");
                    return net.minecraft.sounds.SoundEvents.COPPER_STEP;
                };
                
                copperGrateSounds = new ForgeSoundType(1f, 1f,
                    breakSound, 
                    stepSound, 
                    stepSound, // place
                    stepSound, // hit
                    stepSound); // fall
                LOGGER.info("Copper grate ForgeSoundType initialized successfully");
            } catch (Exception e) {
                LOGGER.error("Failed to create copper grate sound type: " + e.getMessage(), e);
                // Create fallback ForgeSoundType using vanilla copper sounds
                return new ForgeSoundType(1f, 1f,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_BREAK,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP);
            }
        }
        return copperGrateSounds;
    }
    
    public static ForgeSoundType COPPER_BULB_SOUNDS() {
        if (copperBulbSounds == null) {
            try {
                // Create Suppliers that safely get the SoundEvents
                Supplier<SoundEvent> breakSound = () -> {
                    if (COPPER_BULB_BREAK.isPresent()) {
                        return COPPER_BULB_BREAK.get();
                    }
                    LOGGER.warn("Copper bulb break sound not ready, using COPPER fallback");
                    return net.minecraft.sounds.SoundEvents.COPPER_BREAK;
                };
                Supplier<SoundEvent> stepSound = () -> {
                    if (COPPER_BULB_STEP.isPresent()) {
                        return COPPER_BULB_STEP.get();
                    }
                    LOGGER.warn("Copper bulb step sound not ready, using COPPER fallback");
                    return net.minecraft.sounds.SoundEvents.COPPER_STEP;
                };
                Supplier<SoundEvent> placeSound = () -> {
                    if (COPPER_BULB_PLACE.isPresent()) {
                        return COPPER_BULB_PLACE.get();
                    }
                    LOGGER.warn("Copper bulb place sound not ready, using COPPER step fallback");
                    // Use COPPER_STEP as fallback since COPPER_PLACE might not exist in 1.18.2
                    return net.minecraft.sounds.SoundEvents.COPPER_STEP;
                };
                
                copperBulbSounds = new ForgeSoundType(1f, 1f,
                    breakSound, 
                    stepSound, 
                    placeSound,
                    stepSound, // hit
                    stepSound); // fall
                LOGGER.info("Copper bulb ForgeSoundType initialized successfully");
            } catch (Exception e) {
                LOGGER.error("Failed to create copper bulb sound type: " + e.getMessage(), e);
                // Create fallback ForgeSoundType using vanilla copper sounds
                return new ForgeSoundType(1f, 1f,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_BREAK,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP,
                    () -> net.minecraft.sounds.SoundEvents.COPPER_STEP);
            }
        }
        return copperBulbSounds;
    }
    
    public static ForgeSoundType MUD_SOUNDS() {
        if (mudSounds == null) {
            try {
                // Create Suppliers that safely get the SoundEvents
                Supplier<SoundEvent> breakSound = () -> {
                    if (MUD_BREAK.isPresent()) {
                        return MUD_BREAK.get();
                    }
                    LOGGER.warn("Mud break sound not ready, using GRAVEL fallback");
                    return net.minecraft.sounds.SoundEvents.GRAVEL_BREAK;
                };
                Supplier<SoundEvent> stepSound = () -> {
                    if (MUD_STEP.isPresent()) {
                        return MUD_STEP.get();
                    }
                    LOGGER.warn("Mud step sound not ready, using GRAVEL fallback");
                    return net.minecraft.sounds.SoundEvents.GRAVEL_STEP;
                };
                
                mudSounds = new ForgeSoundType(1f, 1f,
                    breakSound, 
                    stepSound, 
                    stepSound, // place
                    stepSound, // hit
                    stepSound); // fall
                LOGGER.info("Mud ForgeSoundType initialized successfully");
            } catch (Exception e) {
                LOGGER.error("Failed to create mud sound type: " + e.getMessage(), e);
                // Create fallback ForgeSoundType using vanilla gravel sounds
                return new ForgeSoundType(1f, 1f,
                    () -> net.minecraft.sounds.SoundEvents.GRAVEL_BREAK,
                    () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP,
                    () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP,
                    () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP,
                    () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP);
            }
        }
        return mudSounds;
    }

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        // Register with underscores for the registry key (standard convention)
        // But keep dots in ResourceLocation path to match sounds.json keys (e.g., "block.copper_grate.break")
        return SOUND_EVENTS.register(name.replace('.', '_'),
                () -> new SoundEvent(new ResourceLocation(BuildScape.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
        LOGGER.info("Registered ModSounds DeferredRegister");
    }
}
