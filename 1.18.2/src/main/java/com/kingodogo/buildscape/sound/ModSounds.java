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
    
    // Sound Events
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
        DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BuildScape.MODID);

    // Copper Grate Sounds
    public static final RegistryObject<SoundEvent> COPPER_GRATE_BREAK = registerSoundEvent("block.copper_grate.break");
    public static final RegistryObject<SoundEvent> COPPER_GRATE_STEP = registerSoundEvent("block.copper_grate.step");
    
    public static final RegistryObject<SoundEvent> COPPER_GRATE_PLACE = COPPER_GRATE_STEP;
    public static final RegistryObject<SoundEvent> COPPER_GRATE_HIT = COPPER_GRATE_STEP;
    public static final RegistryObject<SoundEvent> COPPER_GRATE_FALL = COPPER_GRATE_STEP;

    // Copper Bulb Sounds
    public static final RegistryObject<SoundEvent> COPPER_BULB_BREAK = registerSoundEvent("block.copper_bulb.break");
    public static final RegistryObject<SoundEvent> COPPER_BULB_PLACE = registerSoundEvent("block.copper_bulb.place");
    public static final RegistryObject<SoundEvent> COPPER_BULB_STEP = registerSoundEvent("block.copper_bulb.step");
    public static final RegistryObject<SoundEvent> COPPER_BULB_TOGGLE = registerSoundEvent("block.copper_bulb.toggle");
    
    public static final RegistryObject<SoundEvent> COPPER_BULB_HIT = COPPER_BULB_STEP;
    public static final RegistryObject<SoundEvent> COPPER_BULB_FALL = COPPER_BULB_STEP;

    // Mud Sounds
    public static final RegistryObject<SoundEvent> MUD_BREAK = registerSoundEvent("block.mud.break");
    public static final RegistryObject<SoundEvent> MUD_STEP = registerSoundEvent("block.mud.step");
    
    public static final RegistryObject<SoundEvent> MUD_PLACE = MUD_STEP;
    public static final RegistryObject<SoundEvent> MUD_HIT = MUD_STEP;
    public static final RegistryObject<SoundEvent> MUD_FALL = MUD_STEP;
    
    // Decorated Pot Sounds
    public static final RegistryObject<SoundEvent> DECORATED_POT_PLACE = registerSoundEvent("block.decorated_pot.place");
    public static final RegistryObject<SoundEvent> DECORATED_POT_BREAK = registerSoundEvent("block.decorated_pot.break");
    public static final RegistryObject<SoundEvent> DECORATED_POT_HIT = registerSoundEvent("block.decorated_pot.hit");
    public static final RegistryObject<SoundEvent> DECORATED_POT_STEP = registerSoundEvent("block.decorated_pot.step");
    public static final RegistryObject<SoundEvent> DECORATED_POT_FALL = registerSoundEvent("block.decorated_pot.fall");
    public static final RegistryObject<SoundEvent> DECORATED_POT_INSERT_ITEM = registerSoundEvent("block.decorated_pot.insert_item");
    public static final RegistryObject<SoundEvent> DECORATED_POT_INSERT_FAIL = registerSoundEvent("block.decorated_pot.insert_fail");
    public static final RegistryObject<SoundEvent> DECORATED_POT_SHATTER = registerSoundEvent("block.decorated_pot.shatter");
    
    // Flower Bed Sounds
    public static final RegistryObject<SoundEvent> FLOWER_BED_BREAK = registerSoundEvent("block.flower_bed.break");
    public static final RegistryObject<SoundEvent> FLOWER_BED_STEP = registerSoundEvent("block.flower_bed.step");
    public static final RegistryObject<SoundEvent> FLOWER_BED_PLACE = registerSoundEvent("block.flower_bed.place");
    public static final RegistryObject<SoundEvent> FLOWER_BED_HIT = registerSoundEvent("block.flower_bed.hit");
    public static final RegistryObject<SoundEvent> FLOWER_BED_FALL = registerSoundEvent("block.flower_bed.fall");

    // Sound Types
    private static ForgeSoundType copperGrateSounds = null;
    private static ForgeSoundType copperBulbSounds = null;
    // Mud sounds: don't cache to allow volume/pitch changes from sounds.json to take effect
    
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
        // Don't cache - always create new instance so volume/pitch from sounds.json takes effect
        // Volume and pitch are set in sounds.json (0.4 volume, 0.9 pitch), so use 1.0f here
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
            
            // Volume and pitch are set in sounds.json, so use 1.0f here (will be overridden by JSON)
            return new ForgeSoundType(1.0f, 1.0f,
                breakSound, 
                stepSound, 
                stepSound, // place
                stepSound, // hit
                stepSound); // fall
        } catch (Exception e) {
            LOGGER.error("Failed to create mud sound type: " + e.getMessage(), e);
            // Create fallback ForgeSoundType using vanilla gravel sounds
            return new ForgeSoundType(1.0f, 1.0f,
                () -> net.minecraft.sounds.SoundEvents.GRAVEL_BREAK,
                () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP,
                () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP,
                () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP,
                () -> net.minecraft.sounds.SoundEvents.GRAVEL_STEP);
        }
    }

    // Petals & Clover use cherry leaves sounds (FLOWERING_AZALEA in 1.18.2)
    // Note: This method is kept for backwards compatibility but is no longer used
    // Petals and clover now use FLOWER_BED_SOUNDS() instead
    public static com.kingodogo.buildscape.block.CustomSoundType PETAL_CLOVER_SOUNDS() {
        return new com.kingodogo.buildscape.block.CustomSoundType(
            0.8f, 0.96f,  // break volume, pitch
            0.12f, 1.2f,  // step volume, pitch
            0.8f, 0.96f,  // place volume, pitch
            0.2f, 0.6f,   // hit volume, pitch
            0.4f, 0.9f,   // fall volume, pitch
            () -> net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_BREAK,
            () -> net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_STEP,
            () -> net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_PLACE,
            () -> net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_HIT,
            () -> net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_FALL);
    }
    
    // Flower bed sounds for petals and clover
    public static com.kingodogo.buildscape.block.CustomSoundType FLOWER_BED_SOUNDS() {
        return new com.kingodogo.buildscape.block.CustomSoundType(
            0.8f, 0.96f,  // break volume, pitch
            0.25f, 1.2f,  // step volume, pitch (slightly louder than vanilla)
            0.8f, 0.96f,  // place volume, pitch
            0.2f, 0.6f,   // hit volume, pitch
            0.4f, 0.9f,   // fall volume, pitch
            () -> {
                if (FLOWER_BED_BREAK.isPresent()) {
                    return FLOWER_BED_BREAK.get();
                }
                LOGGER.warn("Flower bed break sound not ready, using FLOWERING_AZALEA fallback");
                return net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_BREAK;
            },
            () -> {
                if (FLOWER_BED_STEP.isPresent()) {
                    return FLOWER_BED_STEP.get();
                }
                LOGGER.warn("Flower bed step sound not ready, using FLOWERING_AZALEA fallback");
                return net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_STEP;
            },
            () -> {
                if (FLOWER_BED_PLACE.isPresent()) {
                    return FLOWER_BED_PLACE.get();
                }
                LOGGER.warn("Flower bed place sound not ready, using FLOWERING_AZALEA fallback");
                return net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_PLACE;
            },
            () -> {
                if (FLOWER_BED_HIT.isPresent()) {
                    return FLOWER_BED_HIT.get();
                }
                LOGGER.warn("Flower bed hit sound not ready, using FLOWERING_AZALEA fallback");
                return net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_HIT;
            },
            () -> {
                if (FLOWER_BED_FALL.isPresent()) {
                    return FLOWER_BED_FALL.get();
                }
                LOGGER.warn("Flower bed fall sound not ready, using FLOWERING_AZALEA fallback");
                return net.minecraft.sounds.SoundEvents.FLOWERING_AZALEA_FALL;
            });
    }
    
    public static com.kingodogo.buildscape.block.CustomSoundType VINE_SOUNDS() {
        return new com.kingodogo.buildscape.block.CustomSoundType(
            0.9f, 0.8f,   // break volume, pitch
            0.15f, 1.0f,  // step volume, pitch
            0.9f, 0.8f,   // place volume, pitch
            0.25f, 0.5f,  // hit volume, pitch
            0.5f, 0.75f,  // fall volume, pitch
            () -> net.minecraft.sounds.SoundEvents.VINE_BREAK,
            () -> net.minecraft.sounds.SoundEvents.VINE_STEP,
            () -> net.minecraft.sounds.SoundEvents.VINE_PLACE,
            () -> net.minecraft.sounds.SoundEvents.VINE_HIT,
            () -> net.minecraft.sounds.SoundEvents.VINE_FALL);
    }
    
    public static com.kingodogo.buildscape.block.CustomSoundType AZALEA_SOUNDS() {
        return new com.kingodogo.buildscape.block.CustomSoundType(
            1.0f, 1.0f,   // break volume, pitch
            1.0f, 1.0f,   // step volume, pitch
            1.0f, 1.0f,   // place volume, pitch
            1.0f, 1.0f,   // hit volume, pitch
            1.0f, 1.0f,   // fall volume, pitch
            () -> net.minecraft.sounds.SoundEvents.AZALEA_BREAK,
            () -> net.minecraft.sounds.SoundEvents.AZALEA_STEP,
            () -> net.minecraft.sounds.SoundEvents.AZALEA_PLACE,
            () -> net.minecraft.sounds.SoundEvents.AZALEA_HIT,
            () -> net.minecraft.sounds.SoundEvents.AZALEA_FALL);
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
// Kingodogo finished the project – 2025-11-27 | 17:12:00
