package com.kingodogo.buildscape.block;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.item.ModItems;
import com.kingodogo.buildscape.sound.ModSounds;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildScape.MODID);
    
    // Colored Sand
    public static final RegistryObject<Block> BLACK_SAND = BLOCKS.register("black_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> BLUE_SAND = BLOCKS.register("blue_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLUE)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> GREEN_SAND = BLOCKS.register("green_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_GREEN)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> ORANGE_SAND = BLOCKS.register("orange_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> PINK_SAND = BLOCKS.register("pink_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> RED_SAND = BLOCKS.register("red_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_RED)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> WHITE_SAND = BLOCKS.register("white_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SNOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> YELLOW_SAND = BLOCKS.register("yellow_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    // Sandstone Blocks
    public static final RegistryObject<Block> BLACK_SANDSTONE = BLOCKS.register("black_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> BLUE_SANDSTONE = BLOCKS.register("blue_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> GREEN_SANDSTONE = BLOCKS.register("green_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> ORANGE_SANDSTONE = BLOCKS.register("orange_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> PINK_SANDSTONE = BLOCKS.register("pink_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> RED_SANDSTONE = BLOCKS.register("red_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> WHITE_SANDSTONE = BLOCKS.register("white_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> YELLOW_SANDSTONE = BLOCKS.register("yellow_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Tiles
    public static final RegistryObject<Block> BLACK_TILES = BLOCKS.register("black_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE), ModItems.BLACK_TILES));
    
    public static final RegistryObject<Block> BLUE_TILES = BLOCKS.register("blue_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> BROWN_TILES = BLOCKS.register("brown_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> CYAN_TILES = BLOCKS.register("cyan_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> GRAY_TILES = BLOCKS.register("gray_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> GREEN_TILES = BLOCKS.register("green_tiles",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> LIGHT_BLUE_TILES = BLOCKS.register("light_blue_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> LIGHT_GRAY_TILES = BLOCKS.register("light_gray_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> LIME_TILES = BLOCKS.register("lime_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> MAGENTA_TILES = BLOCKS.register("magenta_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> ORANGE_TILES = BLOCKS.register("orange_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> PINK_TILES = BLOCKS.register("pink_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> PURPLE_TILES = BLOCKS.register("purple_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> RED_TILES = BLOCKS.register("red_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> WHITE_TILES = BLOCKS.register("white_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> YELLOW_TILES = BLOCKS.register("yellow_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Mosaic Glass
    public static final RegistryObject<Block> BLACK_MOSAIC_GLASS = BLOCKS.register("black_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> BLUE_MOSAIC_GLASS = BLOCKS.register("blue_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> BROWN_MOSAIC_GLASS = BLOCKS.register("brown_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> CYAN_MOSAIC_GLASS = BLOCKS.register("cyan_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> GRAY_MOSAIC_GLASS = BLOCKS.register("gray_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> GREEN_MOSAIC_GLASS = BLOCKS.register("green_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS = BLOCKS.register("light_blue_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS = BLOCKS.register("light_gray_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIME_MOSAIC_GLASS = BLOCKS.register("lime_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS = BLOCKS.register("magenta_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS = BLOCKS.register("orange_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PINK_MOSAIC_GLASS = BLOCKS.register("pink_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS = BLOCKS.register("purple_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> RED_MOSAIC_GLASS = BLOCKS.register("red_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> WHITE_MOSAIC_GLASS = BLOCKS.register("white_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SNOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS = BLOCKS.register("yellow_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    // Copper Variants
    public static final RegistryObject<Block> BIT_CHISELED_COPPER = BLOCKS.register("bit_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_COPPER_BLOCK = BLOCKS.register("bit_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_COPPER_BULB = BLOCKS.register("bit_copper_bulb", 
        () -> new FreshCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));

    public static final RegistryObject<Block> BIT_COPPER_GRATE = BLOCKS.register("bit_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_CUT_COPPER = BLOCKS.register("bit_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Exposed Copper
    public static final RegistryObject<Block> BIT_EXPOSED_CHISELED_COPPER = BLOCKS.register("bit_exposed_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK = BLOCKS.register("bit_exposed_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BULB = BLOCKS.register("bit_exposed_copper_bulb", 
        () -> new ExposedCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_GRATE = BLOCKS.register("bit_exposed_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER = BLOCKS.register("bit_exposed_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Weathered Copper
    public static final RegistryObject<Block> BIT_WEATHERED_CHISELED_COPPER = BLOCKS.register("bit_weathered_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK = BLOCKS.register("bit_weathered_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BULB = BLOCKS.register("bit_weathered_copper_bulb", 
        () -> new WeatheredCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_GRATE = BLOCKS.register("bit_weathered_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER = BLOCKS.register("bit_weathered_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Oxidized Copper
    public static final RegistryObject<Block> BIT_OXIDIZED_CHISELED_COPPER = BLOCKS.register("bit_oxidized_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK = BLOCKS.register("bit_oxidized_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BULB = BLOCKS.register("bit_oxidized_copper_bulb", 
        () -> new OxidizedCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_GRATE = BLOCKS.register("bit_oxidized_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER = BLOCKS.register("bit_oxidized_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Tuff Variants
    public static final RegistryObject<Block> BIT_CHISELED_TUFF = BLOCKS.register("bit_chiseled_tuff", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_CHISELED_TUFF_BRICKS = BLOCKS.register("bit_chiseled_tuff_bricks", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF = BLOCKS.register("bit_polished_tuff", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS = BLOCKS.register("bit_tuff_bricks", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF_STAIRS = BLOCKS.register("bit_polished_tuff_stairs",
        () -> new ModStairBlock(BIT_POLISHED_TUFF.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF_SLAB = BLOCKS.register("bit_polished_tuff_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF_WALL = BLOCKS.register("bit_polished_tuff_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS_STAIRS = BLOCKS.register("bit_tuff_bricks_stairs",
        () -> new ModStairBlock(BIT_TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS_SLAB = BLOCKS.register("bit_tuff_bricks_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS_WALL = BLOCKS.register("bit_tuff_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    // Dirt Slabs
    public static final RegistryObject<Block> PODZOL_SLAB = BLOCKS.register("podzol_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.PODZOL)
            .strength(0.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
            .strength(0.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.GRAVEL)));
    
    public static final RegistryObject<Block> MYCELIUM_SLAB = BLOCKS.register("mycelium_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_PURPLE)
            .strength(0.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    // Mud
    public static final RegistryObject<Block> MUD = BLOCKS.register("mud",
        () -> new MudBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN)
            .strength(0.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.MUD_SOUNDS())));
    
    public static final RegistryObject<Block> MUD_SLAB = BLOCKS.register("mud_slab",
        () -> new MudSlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN)
            .strength(0.5f)
            .requiresCorrectToolForDrops()
            .sound(ModSounds.MUD_SOUNDS())));
    
    // Smooth Sandstone
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE = BLOCKS.register("black_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE = BLOCKS.register("blue_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE = BLOCKS.register("green_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE = BLOCKS.register("orange_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE = BLOCKS.register("pink_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE = BLOCKS.register("red_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE = BLOCKS.register("white_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE = BLOCKS.register("yellow_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Mosaic Glass Panes
    public static final RegistryObject<Block> BLACK_MOSAIC_GLASS_PANE = BLOCKS.register("black_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> BLUE_MOSAIC_GLASS_PANE = BLOCKS.register("blue_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> BROWN_MOSAIC_GLASS_PANE = BLOCKS.register("brown_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> CYAN_MOSAIC_GLASS_PANE = BLOCKS.register("cyan_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> GRAY_MOSAIC_GLASS_PANE = BLOCKS.register("gray_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> GREEN_MOSAIC_GLASS_PANE = BLOCKS.register("green_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS_PANE = BLOCKS.register("light_blue_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS_PANE = BLOCKS.register("light_gray_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIME_MOSAIC_GLASS_PANE = BLOCKS.register("lime_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS_PANE = BLOCKS.register("magenta_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS_PANE = BLOCKS.register("orange_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> PINK_MOSAIC_GLASS_PANE = BLOCKS.register("pink_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS_PANE = BLOCKS.register("purple_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> RED_MOSAIC_GLASS_PANE = BLOCKS.register("red_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> WHITE_MOSAIC_GLASS_PANE = BLOCKS.register("white_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SNOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS_PANE = BLOCKS.register("yellow_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    // Glazed Glass
    public static final RegistryObject<Block> BLACK_GLAZED_GLASS = BLOCKS.register("black_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> BLUE_GLAZED_GLASS = BLOCKS.register("blue_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> BROWN_GLAZED_GLASS = BLOCKS.register("brown_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> CYAN_GLAZED_GLASS = BLOCKS.register("cyan_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> GRAY_GLAZED_GLASS = BLOCKS.register("gray_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> GREEN_GLAZED_GLASS = BLOCKS.register("green_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_GLASS = BLOCKS.register("light_blue_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_GLASS = BLOCKS.register("light_gray_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIME_GLAZED_GLASS = BLOCKS.register("lime_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> MAGENTA_GLAZED_GLASS = BLOCKS.register("magenta_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> ORANGE_GLAZED_GLASS = BLOCKS.register("orange_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PINK_GLAZED_GLASS = BLOCKS.register("pink_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PURPLE_GLAZED_GLASS = BLOCKS.register("purple_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> RED_GLAZED_GLASS = BLOCKS.register("red_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> WHITE_GLAZED_GLASS = BLOCKS.register("white_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SNOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> YELLOW_GLAZED_GLASS = BLOCKS.register("yellow_glazed_glass", 
        () -> new GlazedGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    // Glazed Glass Panes
    public static final RegistryObject<Block> BLACK_GLAZED_GLASS_PANE = BLOCKS.register("black_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> BLUE_GLAZED_GLASS_PANE = BLOCKS.register("blue_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> BROWN_GLAZED_GLASS_PANE = BLOCKS.register("brown_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> CYAN_GLAZED_GLASS_PANE = BLOCKS.register("cyan_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> GRAY_GLAZED_GLASS_PANE = BLOCKS.register("gray_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> GREEN_GLAZED_GLASS_PANE = BLOCKS.register("green_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_GLASS_PANE = BLOCKS.register("light_blue_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_GLASS_PANE = BLOCKS.register("light_gray_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIME_GLAZED_GLASS_PANE = BLOCKS.register("lime_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_GLAZED_GLASS_PANE = BLOCKS.register("magenta_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> ORANGE_GLAZED_GLASS_PANE = BLOCKS.register("orange_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> PINK_GLAZED_GLASS_PANE = BLOCKS.register("pink_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> PURPLE_GLAZED_GLASS_PANE = BLOCKS.register("purple_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> RED_GLAZED_GLASS_PANE = BLOCKS.register("red_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> WHITE_GLAZED_GLASS_PANE = BLOCKS.register("white_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SNOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> YELLOW_GLAZED_GLASS_PANE = BLOCKS.register("yellow_glazed_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    
    // Sandstone Stairs
    public static final RegistryObject<Block> BLACK_SANDSTONE_STAIRS = BLOCKS.register("black_sandstone_stairs",
        () -> new ModStairBlock(BLACK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE), ModItems.BLACK_SANDSTONE_STAIRS));
    public static final RegistryObject<Block> BLUE_SANDSTONE_STAIRS = BLOCKS.register("blue_sandstone_stairs",
        () -> new ModStairBlock(BLUE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SANDSTONE_STAIRS = BLOCKS.register("green_sandstone_stairs",
        () -> new ModStairBlock(GREEN_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_STAIRS = BLOCKS.register("orange_sandstone_stairs",
        () -> new ModStairBlock(ORANGE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SANDSTONE_STAIRS = BLOCKS.register("pink_sandstone_stairs",
        () -> new ModStairBlock(PINK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SANDSTONE_STAIRS = BLOCKS.register("red_sandstone_stairs",
        () -> new ModStairBlock(RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SANDSTONE_STAIRS = BLOCKS.register("white_sandstone_stairs",
        () -> new ModStairBlock(WHITE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SANDSTONE_STAIRS = BLOCKS.register("yellow_sandstone_stairs",
        () -> new ModStairBlock(YELLOW_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Sandstone Slabs
    public static final RegistryObject<Block> BLACK_SANDSTONE_SLAB = BLOCKS.register("black_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SANDSTONE_SLAB = BLOCKS.register("blue_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SANDSTONE_SLAB = BLOCKS.register("green_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_SLAB = BLOCKS.register("orange_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SANDSTONE_SLAB = BLOCKS.register("pink_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SANDSTONE_SLAB = BLOCKS.register("red_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SANDSTONE_SLAB = BLOCKS.register("white_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SANDSTONE_SLAB = BLOCKS.register("yellow_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Sandstone Walls
    public static final RegistryObject<Block> BLACK_SANDSTONE_WALL = BLOCKS.register("black_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SANDSTONE_WALL = BLOCKS.register("blue_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SANDSTONE_WALL = BLOCKS.register("green_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WALL = BLOCKS.register("orange_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SANDSTONE_WALL = BLOCKS.register("pink_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SANDSTONE_WALL = BLOCKS.register("red_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SANDSTONE_WALL = BLOCKS.register("white_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SANDSTONE_WALL = BLOCKS.register("yellow_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Smooth Sandstone Slabs
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("black_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("blue_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("green_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("orange_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("pink_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("red_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("white_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("yellow_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Smooth Sandstone Stairs
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("black_smooth_sandstone_stairs",
        () -> new ModStairBlock(BLACK_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("blue_smooth_sandstone_stairs",
        () -> new ModStairBlock(BLUE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("green_smooth_sandstone_stairs",
        () -> new ModStairBlock(GREEN_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("orange_smooth_sandstone_stairs",
        () -> new ModStairBlock(ORANGE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("pink_smooth_sandstone_stairs",
        () -> new ModStairBlock(PINK_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("red_smooth_sandstone_stairs",
        () -> new ModStairBlock(RED_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("white_smooth_sandstone_stairs",
        () -> new ModStairBlock(WHITE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("yellow_smooth_sandstone_stairs",
        () -> new ModStairBlock(YELLOW_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Smooth Sandstone Walls
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_WALL = BLOCKS.register("white_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_WALL = BLOCKS.register("black_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE_WALL = BLOCKS.register("red_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE_WALL = BLOCKS.register("orange_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE_WALL = BLOCKS.register("yellow_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE_WALL = BLOCKS.register("green_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE_WALL = BLOCKS.register("blue_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_WALL = BLOCKS.register("pink_smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = BLOCKS.register("smooth_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Tile Stairs
    public static final RegistryObject<Block> BLACK_TILES_STAIRS = BLOCKS.register("black_tiles_stairs",
        () -> new ModStairBlock(BLACK_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BLUE_TILES_STAIRS = BLOCKS.register("blue_tiles_stairs",
        () -> new ModStairBlock(BLUE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BROWN_TILES_STAIRS = BLOCKS.register("brown_tiles_stairs",
        () -> new ModStairBlock(BROWN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CYAN_TILES_STAIRS = BLOCKS.register("cyan_tiles_stairs",
        () -> new ModStairBlock(CYAN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GRAY_TILES_STAIRS = BLOCKS.register("gray_tiles_stairs",
        () -> new ModStairBlock(GRAY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GREEN_TILES_STAIRS = BLOCKS.register("green_tiles_stairs",
        () -> new ModStairBlock(GREEN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_BLUE_TILES_STAIRS = BLOCKS.register("light_blue_tiles_stairs",
        () -> new ModStairBlock(LIGHT_BLUE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_GRAY_TILES_STAIRS = BLOCKS.register("light_gray_tiles_stairs",
        () -> new ModStairBlock(LIGHT_GRAY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIME_TILES_STAIRS = BLOCKS.register("lime_tiles_stairs",
        () -> new ModStairBlock(LIME_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MAGENTA_TILES_STAIRS = BLOCKS.register("magenta_tiles_stairs",
        () -> new ModStairBlock(MAGENTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> ORANGE_TILES_STAIRS = BLOCKS.register("orange_tiles_stairs",
        () -> new ModStairBlock(ORANGE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PINK_TILES_STAIRS = BLOCKS.register("pink_tiles_stairs",
        () -> new ModStairBlock(PINK_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PURPLE_TILES_STAIRS = BLOCKS.register("purple_tiles_stairs",
        () -> new ModStairBlock(PURPLE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> RED_TILES_STAIRS = BLOCKS.register("red_tiles_stairs",
        () -> new ModStairBlock(RED_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> WHITE_TILES_STAIRS = BLOCKS.register("white_tiles_stairs",
        () -> new ModStairBlock(WHITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> YELLOW_TILES_STAIRS = BLOCKS.register("yellow_tiles_stairs",
        () -> new ModStairBlock(YELLOW_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Tile Slabs
    public static final RegistryObject<Block> BLACK_TILES_SLAB = BLOCKS.register("black_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BLUE_TILES_SLAB = BLOCKS.register("blue_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BROWN_TILES_SLAB = BLOCKS.register("brown_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CYAN_TILES_SLAB = BLOCKS.register("cyan_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GRAY_TILES_SLAB = BLOCKS.register("gray_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GREEN_TILES_SLAB = BLOCKS.register("green_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_BLUE_TILES_SLAB = BLOCKS.register("light_blue_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_GRAY_TILES_SLAB = BLOCKS.register("light_gray_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIME_TILES_SLAB = BLOCKS.register("lime_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MAGENTA_TILES_SLAB = BLOCKS.register("magenta_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> ORANGE_TILES_SLAB = BLOCKS.register("orange_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PINK_TILES_SLAB = BLOCKS.register("pink_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PURPLE_TILES_SLAB = BLOCKS.register("purple_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> RED_TILES_SLAB = BLOCKS.register("red_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> WHITE_TILES_SLAB = BLOCKS.register("white_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> YELLOW_TILES_SLAB = BLOCKS.register("yellow_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Tile Walls
    public static final RegistryObject<Block> BLACK_TILES_WALL = BLOCKS.register("black_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BLUE_TILES_WALL = BLOCKS.register("blue_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BROWN_TILES_WALL = BLOCKS.register("brown_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CYAN_TILES_WALL = BLOCKS.register("cyan_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GRAY_TILES_WALL = BLOCKS.register("gray_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GREEN_TILES_WALL = BLOCKS.register("green_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_BLUE_TILES_WALL = BLOCKS.register("light_blue_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_GRAY_TILES_WALL = BLOCKS.register("light_gray_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIME_TILES_WALL = BLOCKS.register("lime_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MAGENTA_TILES_WALL = BLOCKS.register("magenta_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> ORANGE_TILES_WALL = BLOCKS.register("orange_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PINK_TILES_WALL = BLOCKS.register("pink_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PURPLE_TILES_WALL = BLOCKS.register("purple_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> RED_TILES_WALL = BLOCKS.register("red_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> WHITE_TILES_WALL = BLOCKS.register("white_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> YELLOW_TILES_WALL = BLOCKS.register("yellow_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Vanilla Block Variants
    public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs",
        () -> new ModStairBlock(Blocks.POLISHED_BASALT.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> POLISHED_BASALT_WALL = BLOCKS.register("polished_basalt_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_STAIRS = BLOCKS.register("dripstone_block_stairs",
        () -> new ModStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.DRIPSTONE_BLOCK)
));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_SLAB = BLOCKS.register("dripstone_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.DRIPSTONE_BLOCK)
));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_WALL = BLOCKS.register("dripstone_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN)
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.DRIPSTONE_BLOCK)
));
    public static final RegistryObject<Block> END_STONE_STAIRS = BLOCKS.register("end_stone_stairs",
        () -> new ModStairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(3.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> END_STONE_SLAB = BLOCKS.register("end_stone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(3.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> END_STONE_WALL = BLOCKS.register("end_stone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(3.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> STONE_WALL = BLOCKS.register("stone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> QUARTZ_BRICKS_STAIRS = BLOCKS.register("quartz_bricks_stairs",
        () -> new ModStairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = BLOCKS.register("quartz_bricks_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BRICKS_WALL = BLOCKS.register("quartz_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> CALCITE_STAIRS = BLOCKS.register("calcite_stairs",
        () -> new ModStairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CALCITE_SLAB = BLOCKS.register("calcite_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CALCITE_WALL = BLOCKS.register("calcite_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    // Bedrock Variants
    public static final RegistryObject<Block> BEDROCK_STAIRS = BLOCKS.register("bedrock_stairs",
        () -> new ModStairBlock(Blocks.BEDROCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(-1.0f, 3600000.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BEDROCK_SLAB = BLOCKS.register("bedrock_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(-1.0f, 3600000.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BEDROCK_WALL = BLOCKS.register("bedrock_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(-1.0f, 3600000.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> BEDROCK_PANE = BLOCKS.register("bedrock_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(-1.0f, 3600000.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .noOcclusion()
));
    
    // Obsidian Variants
    public static final RegistryObject<Block> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs",
        () -> new ModStairBlock(Blocks.OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(50.0f, 1200.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(50.0f, 1200.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> PRISMARINE_BRICKS_WALL = BLOCKS.register("prismarine_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = BLOCKS.register("dark_prismarine_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BLOCK_WALL = BLOCKS.register("quartz_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = BLOCKS.register("smooth_quartz_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = BLOCKS.register("smooth_basalt_stairs",
        () -> new ModStairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = BLOCKS.register("smooth_basalt_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> MOSS_BLOCK_SLAB = BLOCKS.register("moss_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.MOSS, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.MOSS)
));
    public static final RegistryObject<Block> AMETHYST_BLOCK_SLAB = BLOCKS.register("amethyst_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_MAGENTA)
            .strength(0.4f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.AMETHYST)
));
    
    // Mossy Calcite
    public static final RegistryObject<Block> MOSSY_CALCITE = BLOCKS.register("mossy_calcite",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MOSSY_CALCITE_STAIRS = BLOCKS.register("mossy_calcite_stairs",
        () -> new ModStairBlock(MOSSY_CALCITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MOSSY_CALCITE_SLAB = BLOCKS.register("mossy_calcite_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MOSSY_CALCITE_WALL = BLOCKS.register("mossy_calcite_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.75f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Bit Copper Variants
    public static final RegistryObject<Block> BIT_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_copper_block_stairs",
        () -> new ModStairBlock(BIT_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_COPPER_BLOCK_SLAB = BLOCKS.register("bit_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_COPPER_BLOCK_WALL = BLOCKS.register("bit_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_exposed_copper_block_stairs",
        () -> new ModStairBlock(BIT_EXPOSED_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK_SLAB = BLOCKS.register("bit_exposed_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK_WALL = BLOCKS.register("bit_exposed_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_weathered_copper_block_stairs",
        () -> new ModStairBlock(BIT_WEATHERED_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK_SLAB = BLOCKS.register("bit_weathered_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK_WALL = BLOCKS.register("bit_weathered_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_oxidized_copper_block_stairs",
        () -> new ModStairBlock(BIT_OXIDIZED_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK_SLAB = BLOCKS.register("bit_oxidized_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK_WALL = BLOCKS.register("bit_oxidized_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_CUT_COPPER_STAIRS = BLOCKS.register("bit_cut_copper_stairs",
        () -> new ModStairBlock(BIT_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_CUT_COPPER_SLAB = BLOCKS.register("bit_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_CUT_COPPER_WALL = BLOCKS.register("bit_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER_STAIRS = BLOCKS.register("bit_exposed_cut_copper_stairs",
        () -> new ModStairBlock(BIT_EXPOSED_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER_SLAB = BLOCKS.register("bit_exposed_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER_WALL = BLOCKS.register("bit_exposed_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER_STAIRS = BLOCKS.register("bit_weathered_cut_copper_stairs",
        () -> new ModStairBlock(BIT_WEATHERED_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER_SLAB = BLOCKS.register("bit_weathered_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER_WALL = BLOCKS.register("bit_weathered_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER_STAIRS = BLOCKS.register("bit_oxidized_cut_copper_stairs",
        () -> new ModStairBlock(BIT_OXIDIZED_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER_SLAB = BLOCKS.register("bit_oxidized_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER_WALL = BLOCKS.register("bit_oxidized_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));

    public static final RegistryObject<Block> MOSS_LAYERS = BLOCKS.register("moss_layers",
        () -> new MossLayersBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.MOSS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> MOSS_OVERLAY = BLOCKS.register("moss_overlay",
        () -> new MossOverlayBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.MOSS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> SNOW_OVERLAY = BLOCKS.register("snow_overlay",
        () -> new SnowOverlayBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    // Concrete Stairs
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = BLOCKS.register("black_concrete_stairs",
        () -> new ModStairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = BLOCKS.register("blue_concrete_stairs",
        () -> new ModStairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = BLOCKS.register("brown_concrete_stairs",
        () -> new ModStairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = BLOCKS.register("cyan_concrete_stairs",
        () -> new ModStairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = BLOCKS.register("gray_concrete_stairs",
        () -> new ModStairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = BLOCKS.register("green_concrete_stairs",
        () -> new ModStairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("light_blue_concrete_stairs",
        () -> new ModStairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("light_gray_concrete_stairs",
        () -> new ModStairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = BLOCKS.register("lime_concrete_stairs",
        () -> new ModStairBlock(Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = BLOCKS.register("magenta_concrete_stairs",
        () -> new ModStairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = BLOCKS.register("orange_concrete_stairs",
        () -> new ModStairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = BLOCKS.register("pink_concrete_stairs",
        () -> new ModStairBlock(Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = BLOCKS.register("purple_concrete_stairs",
        () -> new ModStairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = BLOCKS.register("red_concrete_stairs",
        () -> new ModStairBlock(Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = BLOCKS.register("white_concrete_stairs",
        () -> new ModStairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = BLOCKS.register("yellow_concrete_stairs",
        () -> new ModStairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    // Concrete Walls
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = BLOCKS.register("white_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("light_gray_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = BLOCKS.register("gray_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = BLOCKS.register("black_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = BLOCKS.register("brown_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> RED_CONCRETE_WALL = BLOCKS.register("red_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = BLOCKS.register("orange_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = BLOCKS.register("yellow_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = BLOCKS.register("lime_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = BLOCKS.register("green_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = BLOCKS.register("cyan_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("light_blue_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = BLOCKS.register("blue_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = BLOCKS.register("purple_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = BLOCKS.register("magenta_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = BLOCKS.register("pink_concrete_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    // Concrete Slabs
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = BLOCKS.register("black_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = BLOCKS.register("blue_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = BLOCKS.register("brown_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = BLOCKS.register("cyan_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = BLOCKS.register("gray_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = BLOCKS.register("green_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("light_blue_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("light_gray_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = BLOCKS.register("lime_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = BLOCKS.register("magenta_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = BLOCKS.register("orange_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = BLOCKS.register("pink_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = BLOCKS.register("purple_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = BLOCKS.register("red_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = BLOCKS.register("white_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = BLOCKS.register("yellow_concrete_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(1.8f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    // Mushroom Shelves
    public static final RegistryObject<Block> BROWN_MUSHROOM_SHELVES = BLOCKS.register("brown_mushroom_shelves",
        () -> new MushroomShelvesBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)
            .noOcclusion()));
    
    public static final RegistryObject<Block> RED_MUSHROOM_SHELVES = BLOCKS.register("red_mushroom_shelves",
        () -> new MushroomShelvesBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)
            .noOcclusion()));
    
    // Pillars
    public static final RegistryObject<Block> QUARTZ_PILLAR = BLOCKS.register("quartz_pillar",
        () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .noOcclusion()));

    public static final RegistryObject<Block> STONE_PILLAR = BLOCKS.register("stone_pillar",
        () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .noOcclusion()));

    public static final RegistryObject<Block> DEEPSLATE_PILLAR = BLOCKS.register("deepslate_pillar",
        () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.DEEPSLATE)
            .noOcclusion()));

    public static final RegistryObject<Block> MOSSY_PILLAR = BLOCKS.register("mossy_pillar",
        () -> new PillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(2.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .noOcclusion()));
    
    // Decorated Pots
    public static final RegistryObject<Block> DECORATED_POT = BLOCKS.register("decorated_pot",
        () -> new DecoratedPotBlock());
    
    public static final RegistryObject<Block> BLACK_DECORATED_POT = BLOCKS.register("black_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> BLUE_DECORATED_POT = BLOCKS.register("blue_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> BROWN_DECORATED_POT = BLOCKS.register("brown_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> CYAN_DECORATED_POT = BLOCKS.register("cyan_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> GRAY_DECORATED_POT = BLOCKS.register("gray_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> GREEN_DECORATED_POT = BLOCKS.register("green_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> LIGHT_BLUE_DECORATED_POT = BLOCKS.register("light_blue_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> LIGHT_GRAY_DECORATED_POT = BLOCKS.register("light_gray_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> LIME_DECORATED_POT = BLOCKS.register("lime_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> MAGENTA_DECORATED_POT = BLOCKS.register("magenta_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> ORANGE_DECORATED_POT = BLOCKS.register("orange_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> PINK_DECORATED_POT = BLOCKS.register("pink_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> PURPLE_DECORATED_POT = BLOCKS.register("purple_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> RED_DECORATED_POT = BLOCKS.register("red_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> WHITE_DECORATED_POT = BLOCKS.register("white_decorated_pot",
        () -> new DecoratedPotBlock());
    public static final RegistryObject<Block> YELLOW_DECORATED_POT = BLOCKS.register("yellow_decorated_pot",
        () -> new DecoratedPotBlock());
    
    // Carpet Layers
    public static final RegistryObject<Block> BLACK_CARPET_LAYERS = BLOCKS.register("black_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "black"));
    public static final RegistryObject<Block> BLUE_CARPET_LAYERS = BLOCKS.register("blue_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "blue"));
    public static final RegistryObject<Block> BROWN_CARPET_LAYERS = BLOCKS.register("brown_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "brown"));
    public static final RegistryObject<Block> CYAN_CARPET_LAYERS = BLOCKS.register("cyan_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "cyan"));
    public static final RegistryObject<Block> GRAY_CARPET_LAYERS = BLOCKS.register("gray_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "gray"));
    public static final RegistryObject<Block> GREEN_CARPET_LAYERS = BLOCKS.register("green_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "green"));
    public static final RegistryObject<Block> LIGHT_BLUE_CARPET_LAYERS = BLOCKS.register("light_blue_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "light_blue"));
    public static final RegistryObject<Block> LIGHT_GRAY_CARPET_LAYERS = BLOCKS.register("light_gray_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "light_gray"));
    public static final RegistryObject<Block> LIME_CARPET_LAYERS = BLOCKS.register("lime_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "lime"));
    public static final RegistryObject<Block> MAGENTA_CARPET_LAYERS = BLOCKS.register("magenta_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "magenta"));
    public static final RegistryObject<Block> ORANGE_CARPET_LAYERS = BLOCKS.register("orange_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "orange"));
    public static final RegistryObject<Block> PINK_CARPET_LAYERS = BLOCKS.register("pink_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "pink"));
    public static final RegistryObject<Block> PURPLE_CARPET_LAYERS = BLOCKS.register("purple_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "purple"));
    public static final RegistryObject<Block> RED_CARPET_LAYERS = BLOCKS.register("red_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_RED)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "red"));
    public static final RegistryObject<Block> WHITE_CARPET_LAYERS = BLOCKS.register("white_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.SNOW)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "white"));
    public static final RegistryObject<Block> YELLOW_CARPET_LAYERS = BLOCKS.register("yellow_carpet_layers",
        () -> new WoolLayersBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.WOOL)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "yellow"));
    
    // Leaf Layers
    public static final RegistryObject<Block> OAK_LEAF_LAYERS = BLOCKS.register("oak_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.PLANT)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "oak"));
    
    public static final RegistryObject<Block> SPRUCE_LEAF_LAYERS = BLOCKS.register("spruce_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.PODZOL)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "spruce"));
    
    public static final RegistryObject<Block> BIRCH_LEAF_LAYERS = BLOCKS.register("birch_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.SAND)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "birch"));
    
    public static final RegistryObject<Block> JUNGLE_LEAF_LAYERS = BLOCKS.register("jungle_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.DIRT)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "jungle"));
    
    public static final RegistryObject<Block> ACACIA_LEAF_LAYERS = BLOCKS.register("acacia_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_ORANGE)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "acacia"));
    
    public static final RegistryObject<Block> DARK_OAK_LEAF_LAYERS = BLOCKS.register("dark_oak_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_BROWN)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "dark_oak"));
    
    public static final RegistryObject<Block> AZALEA_LEAF_LAYERS = BLOCKS.register("azalea_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.PLANT)
            .strength(0.2f)
            .sound(com.kingodogo.buildscape.sound.ModSounds.AZALEA_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "azalea"));
    
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAF_LAYERS = BLOCKS.register("flowering_azalea_leaf_layers",
        () -> new LeafLayersBlock(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.PLANT)
            .strength(0.2f)
            .sound(com.kingodogo.buildscape.sound.ModSounds.AZALEA_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false), "flowering_azalea"));
    
    // Leaf Hedges
    public static final RegistryObject<Block> OAK_LEAF_HEDGE = BLOCKS.register("oak_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
            .strength(0.2F)
            .sound(net.minecraft.world.level.block.SoundType.AZALEA_LEAVES)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.OAK_LEAF_HEDGE));
    
    public static final RegistryObject<Block> SPRUCE_LEAF_HEDGE = BLOCKS.register("spruce_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PODZOL)
            .strength(0.2F)
            .sound(net.minecraft.world.level.block.SoundType.AZALEA_LEAVES)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.SPRUCE_LEAF_HEDGE));
    
    public static final RegistryObject<Block> BIRCH_LEAF_HEDGE = BLOCKS.register("birch_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.SAND)
            .strength(0.2F)
            .sound(net.minecraft.world.level.block.SoundType.AZALEA_LEAVES)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.BIRCH_LEAF_HEDGE));
    
    public static final RegistryObject<Block> JUNGLE_LEAF_HEDGE = BLOCKS.register("jungle_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.DIRT)
            .strength(0.2F)
            .sound(net.minecraft.world.level.block.SoundType.AZALEA_LEAVES)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.JUNGLE_LEAF_HEDGE));
    
    public static final RegistryObject<Block> ACACIA_LEAF_HEDGE = BLOCKS.register("acacia_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_ORANGE)
            .strength(0.2F)
            .sound(net.minecraft.world.level.block.SoundType.AZALEA_LEAVES)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.ACACIA_LEAF_HEDGE));
    
    public static final RegistryObject<Block> DARK_OAK_LEAF_HEDGE = BLOCKS.register("dark_oak_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BROWN)
            .strength(0.2F)
            .sound(net.minecraft.world.level.block.SoundType.AZALEA_LEAVES)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.DARK_OAK_LEAF_HEDGE));
    
    public static final RegistryObject<Block> AZALEA_LEAF_HEDGE = BLOCKS.register("azalea_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
            .strength(0.2F)
            .sound(com.kingodogo.buildscape.sound.ModSounds.AZALEA_SOUNDS())
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.AZALEA_LEAF_HEDGE));
    
    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAF_HEDGE = BLOCKS.register("flowering_azalea_leaf_hedge",
        () -> new LeafHedgeBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
            .strength(0.2F)
            .sound(com.kingodogo.buildscape.sound.ModSounds.AZALEA_SOUNDS())
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false),
            ModItems.FLOWERING_AZALEA_LEAF_HEDGE));
    
    // Hay Bale Slab
    public static final RegistryObject<Block> HAY_BALE_SLAB = BLOCKS.register("hay_bale_slab",
        () -> new HayBaleSlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    // Bamboo Blocks
    public static final RegistryObject<Block> BAMBOO_BLOCK = BLOCKS.register("bamboo_block",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK = BLOCKS.register("stripped_bamboo_block",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    
    public static final RegistryObject<Block> BAMBOO_BLOCK_SLAB = BLOCKS.register("bamboo_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_STAIRS = BLOCKS.register("bamboo_block_stairs",
        () -> new ModStairBlock(BAMBOO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_FENCE = BLOCKS.register("bamboo_block_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_FENCE_GATE = BLOCKS.register("bamboo_block_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_PRESSURE_PLATE = BLOCKS.register("bamboo_block_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)
            .noCollission()));
    public static final RegistryObject<Block> BAMBOO_BLOCK_BUTTON = BLOCKS.register("bamboo_block_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)
            .noCollission()));
    
    // Stripped Bamboo Blocks
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_SLAB = BLOCKS.register("stripped_bamboo_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_STAIRS = BLOCKS.register("stripped_bamboo_block_stairs",
        () -> new ModStairBlock(STRIPPED_BAMBOO_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_FENCE = BLOCKS.register("stripped_bamboo_block_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_FENCE_GATE = BLOCKS.register("stripped_bamboo_block_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_PRESSURE_PLATE = BLOCKS.register("stripped_bamboo_block_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)
            .noCollission()));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_BUTTON = BLOCKS.register("stripped_bamboo_block_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)
            .noCollission()));
    
    // Bamboo Doors
    public static final RegistryObject<Block> BAMBOO_DOOR = BLOCKS.register("bamboo_door",
        () -> new ModDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(3.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)
            .noOcclusion()));
    public static final RegistryObject<Block> BAMBOO_TRAPDOOR = BLOCKS.register("bamboo_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(3.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)
            .noOcclusion()
            .isValidSpawn((state, reader, pos, entityType) -> false)));
    
    // Wood Walls
    public static final RegistryObject<Block> OAK_WOOD_WALL = BLOCKS.register("oak_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> SPRUCE_WOOD_WALL = BLOCKS.register("spruce_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_WOOD_WALL = BLOCKS.register("birch_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = BLOCKS.register("dark_oak_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_WOOD_WALL = BLOCKS.register("jungle_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_WOOD_WALL = BLOCKS.register("acacia_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_WALL = BLOCKS.register("bamboo_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    
    // Stripped Wood Walls
    public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = BLOCKS.register("stripped_oak_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = BLOCKS.register("stripped_spruce_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = BLOCKS.register("stripped_birch_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = BLOCKS.register("stripped_dark_oak_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = BLOCKS.register("stripped_jungle_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = BLOCKS.register("stripped_acacia_wood_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.WOOD)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_WALL = BLOCKS.register("stripped_bamboo_block_wall",                                        
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)                                                             
            .strength(2.0f)
            .sound(net.minecraft.world.level.block.SoundType.BAMBOO)));
    
    // Ashpen Planks
    public static final RegistryObject<Block> ASHPEN_WHITE_PLANKS = BLOCKS.register("ashpen_white_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHPEN_WHITE_STAIRS = BLOCKS.register("ashpen_white_stairs",
        () -> new ModStairBlock(ASHPEN_WHITE_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHPEN_WHITE_SLAB = BLOCKS.register("ashpen_white_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHPEN_WHITE_FENCE = BLOCKS.register("ashpen_white_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHPEN_WHITE_FENCE_GATE = BLOCKS.register("ashpen_white_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHPEN_WHITE_PRESSURE_PLATE = BLOCKS.register("ashpen_white_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SNOW)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> ASHPEN_WHITE_BUTTON = BLOCKS.register("ashpen_white_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.SNOW)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> BLACK_ASHPEN_PLANKS = BLOCKS.register("ashpen_black_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_ASHPEN_STAIRS = BLOCKS.register("ashpen_black_stairs",
        () -> new ModStairBlock(BLACK_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_ASHPEN_SLAB = BLOCKS.register("ashpen_black_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_ASHPEN_FENCE = BLOCKS.register("ashpen_black_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_black_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_black_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> BLACK_ASHPEN_BUTTON = BLOCKS.register("ashpen_black_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLACK)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> BLUE_ASHPEN_PLANKS = BLOCKS.register("ashpen_blue_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_ASHPEN_STAIRS = BLOCKS.register("ashpen_blue_stairs",
        () -> new ModStairBlock(BLUE_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_ASHPEN_SLAB = BLOCKS.register("ashpen_blue_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_ASHPEN_FENCE = BLOCKS.register("ashpen_blue_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_blue_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_blue_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BLUE)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> BLUE_ASHPEN_BUTTON = BLOCKS.register("ashpen_blue_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLUE)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> BROWN_ASHPEN_PLANKS = BLOCKS.register("ashpen_brown_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_ASHPEN_STAIRS = BLOCKS.register("ashpen_brown_stairs",
        () -> new ModStairBlock(BROWN_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_ASHPEN_SLAB = BLOCKS.register("ashpen_brown_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_ASHPEN_FENCE = BLOCKS.register("ashpen_brown_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_brown_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_brown_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> BROWN_ASHPEN_BUTTON = BLOCKS.register("ashpen_brown_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_BROWN)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> CYAN_ASHPEN_PLANKS = BLOCKS.register("ashpen_cyan_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_ASHPEN_STAIRS = BLOCKS.register("ashpen_cyan_stairs",
        () -> new ModStairBlock(CYAN_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_ASHPEN_SLAB = BLOCKS.register("ashpen_cyan_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_ASHPEN_FENCE = BLOCKS.register("ashpen_cyan_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_cyan_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_cyan_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> CYAN_ASHPEN_BUTTON = BLOCKS.register("ashpen_cyan_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_CYAN)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> GRAY_ASHPEN_PLANKS = BLOCKS.register("ashpen_gray_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_ASHPEN_STAIRS = BLOCKS.register("ashpen_gray_stairs",
        () -> new ModStairBlock(GRAY_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_ASHPEN_SLAB = BLOCKS.register("ashpen_gray_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_ASHPEN_FENCE = BLOCKS.register("ashpen_gray_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_gray_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_gray_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> GRAY_ASHPEN_BUTTON = BLOCKS.register("ashpen_gray_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_GRAY)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> GREEN_ASHPEN_PLANKS = BLOCKS.register("ashpen_green_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_ASHPEN_STAIRS = BLOCKS.register("ashpen_green_stairs",
        () -> new ModStairBlock(GREEN_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_ASHPEN_SLAB = BLOCKS.register("ashpen_green_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_ASHPEN_FENCE = BLOCKS.register("ashpen_green_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_green_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_green_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> GREEN_ASHPEN_BUTTON = BLOCKS.register("ashpen_green_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_GREEN)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_PLANKS = BLOCKS.register("ashpen_light_blue_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_STAIRS = BLOCKS.register("ashpen_light_blue_stairs",
        () -> new ModStairBlock(LIGHT_BLUE_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_SLAB = BLOCKS.register("ashpen_light_blue_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_FENCE = BLOCKS.register("ashpen_light_blue_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_light_blue_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_light_blue_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_BLUE)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> LIGHT_BLUE_ASHPEN_BUTTON = BLOCKS.register("ashpen_light_blue_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_PLANKS = BLOCKS.register("ashpen_light_gray_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_STAIRS = BLOCKS.register("ashpen_light_gray_stairs",
        () -> new ModStairBlock(LIGHT_GRAY_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_SLAB = BLOCKS.register("ashpen_light_gray_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_FENCE = BLOCKS.register("ashpen_light_gray_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_light_gray_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_light_gray_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GRAY)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> LIGHT_GRAY_ASHPEN_BUTTON = BLOCKS.register("ashpen_light_gray_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> LIME_ASHPEN_PLANKS = BLOCKS.register("ashpen_lime_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_ASHPEN_STAIRS = BLOCKS.register("ashpen_lime_stairs",
        () -> new ModStairBlock(LIME_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_ASHPEN_SLAB = BLOCKS.register("ashpen_lime_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_ASHPEN_FENCE = BLOCKS.register("ashpen_lime_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_lime_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_lime_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_LIGHT_GREEN)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> LIME_ASHPEN_BUTTON = BLOCKS.register("ashpen_lime_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> MAGENTA_ASHPEN_PLANKS = BLOCKS.register("ashpen_magenta_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_ASHPEN_STAIRS = BLOCKS.register("ashpen_magenta_stairs",
        () -> new ModStairBlock(MAGENTA_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_ASHPEN_SLAB = BLOCKS.register("ashpen_magenta_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_ASHPEN_FENCE = BLOCKS.register("ashpen_magenta_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_magenta_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_magenta_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_MAGENTA)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> MAGENTA_ASHPEN_BUTTON = BLOCKS.register("ashpen_magenta_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_MAGENTA)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> ORANGE_ASHPEN_PLANKS = BLOCKS.register("ashpen_orange_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_ASHPEN_STAIRS = BLOCKS.register("ashpen_orange_stairs",
        () -> new ModStairBlock(ORANGE_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_ASHPEN_SLAB = BLOCKS.register("ashpen_orange_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_ASHPEN_FENCE = BLOCKS.register("ashpen_orange_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_orange_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_orange_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> ORANGE_ASHPEN_BUTTON = BLOCKS.register("ashpen_orange_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> PINK_ASHPEN_PLANKS = BLOCKS.register("ashpen_pink_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_ASHPEN_STAIRS = BLOCKS.register("ashpen_pink_stairs",
        () -> new ModStairBlock(PINK_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_ASHPEN_SLAB = BLOCKS.register("ashpen_pink_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_ASHPEN_FENCE = BLOCKS.register("ashpen_pink_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_pink_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_pink_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> PINK_ASHPEN_BUTTON = BLOCKS.register("ashpen_pink_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PINK)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> PURPLE_ASHPEN_PLANKS = BLOCKS.register("ashpen_purple_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_ASHPEN_STAIRS = BLOCKS.register("ashpen_purple_stairs",
        () -> new ModStairBlock(PURPLE_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_ASHPEN_SLAB = BLOCKS.register("ashpen_purple_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_ASHPEN_FENCE = BLOCKS.register("ashpen_purple_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_purple_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_purple_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PURPLE)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> PURPLE_ASHPEN_BUTTON = BLOCKS.register("ashpen_purple_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PURPLE)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> RED_ASHPEN_PLANKS = BLOCKS.register("ashpen_red_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_ASHPEN_STAIRS = BLOCKS.register("ashpen_red_stairs",
        () -> new ModStairBlock(RED_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_ASHPEN_SLAB = BLOCKS.register("ashpen_red_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_ASHPEN_FENCE = BLOCKS.register("ashpen_red_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_red_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_red_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> RED_ASHPEN_BUTTON = BLOCKS.register("ashpen_red_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    
    public static final RegistryObject<Block> YELLOW_ASHPEN_PLANKS = BLOCKS.register("ashpen_yellow_planks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_ASHPEN_STAIRS = BLOCKS.register("ashpen_yellow_stairs",
        () -> new ModStairBlock(YELLOW_ASHPEN_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
                .strength(2.0f, 3.0f)
                .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_ASHPEN_SLAB = BLOCKS.register("ashpen_yellow_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_ASHPEN_FENCE = BLOCKS.register("ashpen_yellow_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_ASHPEN_FENCE_GATE = BLOCKS.register("ashpen_yellow_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
            .strength(2.0f, 3.0f)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_ASHPEN_PRESSURE_PLATE = BLOCKS.register("ashpen_yellow_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_YELLOW)
                .strength(0.5f)
                .sound(SoundType.WOOD)
                .noCollission()));
    public static final RegistryObject<Block> YELLOW_ASHPEN_BUTTON = BLOCKS.register("ashpen_yellow_button",
        () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(SoundType.WOOD)
            .noCollission()));
    // Chains
    public static final RegistryObject<Block> DIAMOND_CHAIN = BLOCKS.register("diamond_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> GOLD_CHAIN = BLOCKS.register("gold_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> EMERALD_CHAIN = BLOCKS.register("emerald_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> ANCIENT_STEEL_CHAIN = BLOCKS.register("ancient_steel_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> NETHERITE_CHAIN = BLOCKS.register("netherite_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK)
            .strength(50.0f, 1200.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    // Large Chains
    public static final RegistryObject<Block> LARGE_IRON_CHAIN = BLOCKS.register("large_iron_chain",
        () -> new LargeChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> LARGE_GOLD_CHAIN = BLOCKS.register("large_gold_chain",
        () -> new LargeChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.GOLD)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> LARGE_DIAMOND_CHAIN = BLOCKS.register("large_diamond_chain",
        () -> new LargeChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.DIAMOND)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> LARGE_EMERALD_CHAIN = BLOCKS.register("large_emerald_chain",
        () -> new LargeChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> LARGE_ANCIENT_STEEL_CHAIN = BLOCKS.register("large_ancient_steel_chain",
        () -> new LargeChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY)
            .strength(5.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> LARGE_NETHERITE_CHAIN = BLOCKS.register("large_netherite_chain",
        () -> new LargeChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK)
            .strength(50.0f, 1200.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    // Copper Chains
    public static final RegistryObject<Block> COPPER_CHAIN = BLOCKS.register("copper_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> EXPOSED_COPPER_CHAIN = BLOCKS.register("exposed_copper_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> WEATHERED_COPPER_CHAIN = BLOCKS.register("weathered_copper_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_WART_BLOCK)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    public static final RegistryObject<Block> OXIDIZED_COPPER_CHAIN = BLOCKS.register("oxidized_copper_chain",
        () -> new ClimbableChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(net.minecraft.world.level.block.SoundType.CHAIN)
            .noOcclusion()
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    // Rose Vines
    public static final RegistryObject<Block> RED_ROSE_VINES = BLOCKS.register("red_rose_vines",
        () -> new RoseVinesBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_RED)
            .strength(0.2f)
            .sound(com.kingodogo.buildscape.sound.ModSounds.VINE_SOUNDS())
            .noCollission()
            .noOcclusion()));
    
    public static final RegistryObject<Block> BLACK_ROSE_VINES = BLOCKS.register("black_rose_vines",
        () -> new RoseVinesBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_BLACK)
            .strength(0.2f)
            .sound(com.kingodogo.buildscape.sound.ModSounds.VINE_SOUNDS())
            .noCollission()
            .noOcclusion()));
    
    public static final RegistryObject<Block> BLUE_ROSE_VINES = BLOCKS.register("blue_rose_vines",
        () -> new RoseVinesBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_BLUE)
            .strength(0.2f)
            .sound(com.kingodogo.buildscape.sound.ModSounds.VINE_SOUNDS())
            .noCollission()
            .noOcclusion()));
    
    public static final RegistryObject<Block> WHITE_ROSE_VINES = BLOCKS.register("white_rose_vines",
        () -> new RoseVinesBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.SNOW)
            .strength(0.2f)
            .sound(com.kingodogo.buildscape.sound.ModSounds.VINE_SOUNDS())
            .noCollission()
            .noOcclusion()));
    
    // Monet Flowers
    public static final RegistryObject<Block> RED_MONETS = BLOCKS.register("red_monets",
        () -> new MonetFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> BLUE_MONETS = BLOCKS.register("blue_monets",
        () -> new MonetFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> PURPLE_MONETS = BLOCKS.register("purple_monets",
        () -> new MonetFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> LIGHT_BLUE_MONETS = BLOCKS.register("light_blue_monets",
        () -> new MonetFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_LIGHT_BLUE)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> PINK_MONETS = BLOCKS.register("pink_monets",
        () -> new MonetFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PINK)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> YELLOW_MONETS = BLOCKS.register("yellow_monets",
        () -> new MonetFlowerBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_YELLOW)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    // Clover
    public static final RegistryObject<Block> CLOVER = BLOCKS.register("clover",
        () -> new CloverBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.PLANT)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)));
    
    // Petals
    public static final RegistryObject<Block> RED_PETAL = BLOCKS.register("red_petal",
        () -> new PetalBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> BLUE_PETAL = BLOCKS.register("blue_petal",
        () -> new PetalBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> ORANGE_PETAL = BLOCKS.register("orange_petal",
        () -> new PetalBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_ORANGE)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> PINK_PETAL = BLOCKS.register("pink_petal",
        () -> new PetalBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PINK)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> PURPLE_PETAL = BLOCKS.register("purple_petal",
        () -> new PetalBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)));
    
    // Colored Spore Blossoms
    public static final RegistryObject<Block> RED_SPORE_BLOSSOM = BLOCKS.register("red_spore_blossom",
        () -> new ColoredSporeBlossomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.SPORE_BLOSSOM),
            ColoredSporeBlossomBlock.hexToVector3f("#fe4a4e"),
            ColoredSporeBlossomBlock.hexToRGB("#fe4a4e")));
    
    public static final RegistryObject<Block> CYAN_SPORE_BLOSSOM = BLOCKS.register("cyan_spore_blossom",
        () -> new ColoredSporeBlossomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_CYAN)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.SPORE_BLOSSOM),
            ColoredSporeBlossomBlock.hexToVector3f("#1fdee2"),
            ColoredSporeBlossomBlock.hexToRGB("#1fdee2")));
    
    public static final RegistryObject<Block> BLUE_SPORE_BLOSSOM = BLOCKS.register("blue_spore_blossom",
        () -> new ColoredSporeBlossomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_BLUE)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.SPORE_BLOSSOM),
            ColoredSporeBlossomBlock.hexToVector3f("#4a7df4"),
            ColoredSporeBlossomBlock.hexToRGB("#4a7df4")));
    
    public static final RegistryObject<Block> PURPLE_SPORE_BLOSSOM = BLOCKS.register("purple_spore_blossom",
        () -> new ColoredSporeBlossomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_PURPLE)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.SPORE_BLOSSOM),
            ColoredSporeBlossomBlock.hexToVector3f("#a146f2"),
            ColoredSporeBlossomBlock.hexToRGB("#a146f2")));
    
    public static final RegistryObject<Block> ORANGE_SPORE_BLOSSOM = BLOCKS.register("orange_spore_blossom",
        () -> new ColoredSporeBlossomBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_ORANGE)
            .noCollission()
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.SPORE_BLOSSOM),
            ColoredSporeBlossomBlock.hexToVector3f("#f76e32"),
            ColoredSporeBlossomBlock.hexToRGB("#f76e32")));
    
    // Big Candles
    public static final RegistryObject<Block> BIG_CANDLE = BLOCKS.register("big_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_WHITE_CANDLE = BLOCKS.register("big_white_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_ORANGE_CANDLE = BLOCKS.register("big_orange_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_MAGENTA_CANDLE = BLOCKS.register("big_magenta_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_LIGHT_BLUE_CANDLE = BLOCKS.register("big_light_blue_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_YELLOW_CANDLE = BLOCKS.register("big_yellow_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_LIME_CANDLE = BLOCKS.register("big_lime_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_PINK_CANDLE = BLOCKS.register("big_pink_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_GRAY_CANDLE = BLOCKS.register("big_gray_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_LIGHT_GRAY_CANDLE = BLOCKS.register("big_light_gray_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_CYAN_CANDLE = BLOCKS.register("big_cyan_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_PURPLE_CANDLE = BLOCKS.register("big_purple_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_BLUE_CANDLE = BLOCKS.register("big_blue_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_BROWN_CANDLE = BLOCKS.register("big_brown_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_GREEN_CANDLE = BLOCKS.register("big_green_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_RED_CANDLE = BLOCKS.register("big_red_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_BLACK_CANDLE = BLOCKS.register("big_black_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_AMETHYST_CANDLE = BLOCKS.register("big_amethyst_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    public static final RegistryObject<Block> BIG_SCULK_CANDLE = BLOCKS.register("big_sculk_candle",
        () -> new BigCandleBlock(BlockBehaviour.Properties.of(Material.DECORATION)
            .instabreak()
            .sound(net.minecraft.world.level.block.SoundType.CANDLE)
            .lightLevel((state) -> state.getValue(BigCandleBlock.LIT) ? 12 : 0)));
    
    // Snow Blocks
    public static final RegistryObject<Block> SNOW_BRICKS = BLOCKS.register("snow_bricks",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.SNOW)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)));
    
    public static final RegistryObject<Block> SNOW_BRICKS_STAIRS = BLOCKS.register("snow_bricks_stairs",
        () -> new ModStairBlock(SNOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.SNOW)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)));
    
    public static final RegistryObject<Block> SNOW_BRICKS_SLAB = BLOCKS.register("snow_bricks_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.SNOW)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)));
    
    public static final RegistryObject<Block> SNOW_BRICKS_WALL = BLOCKS.register("snow_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.SNOW)
            .strength(0.2f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)));
    
    public static final RegistryObject<Block> SNOW_STAIRS = BLOCKS.register("snow_stairs",
        () -> new ModStairBlock(Blocks.SNOW_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.SNOW)
            .strength(0.1f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)));
    
    public static final RegistryObject<Block> SNOW_SLAB = BLOCKS.register("snow_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.SNOW, MaterialColor.SNOW)
            .strength(0.1f)
            .sound(net.minecraft.world.level.block.SoundType.SNOW)));
    
    public static final RegistryObject<Block> SNOWY_GRASS_BLOCK = BLOCKS.register("snowy_grass_block",
        () -> new SnowyGrassBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
            .strength(0.6f)
            .randomTicks()
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> SNOWY_GRASS_BLOCK_STAIRS = BLOCKS.register("snowy_grass_block_stairs",
        () -> new ModStairBlock(SNOWY_GRASS_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
            .strength(0.6f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> SNOWY_GRASS_BLOCK_SLAB = BLOCKS.register("snowy_grass_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.GRASS)
            .strength(0.6f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    // Icicles
    public static final RegistryObject<Block> ICICLE = BLOCKS.register("icicle",
        () -> new PointedIcicleBlock(BlockBehaviour.Properties.of(Material.ICE, MaterialColor.ICE)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .randomTicks()
            .dynamicShape()));
    
    public static final RegistryObject<Block> ICICLE_BLOCK = BLOCKS.register("icicle_block",
        () -> new IcicleBlock(BlockBehaviour.Properties.of(Material.ICE, MaterialColor.ICE)
            .strength(0.5f)
            .friction(0.989F)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PACKED_ICICLE_BLOCK = BLOCKS.register("packed_icicle_block",
        () -> new PackedIcicleBlock(BlockBehaviour.Properties.of(Material.ICE, MaterialColor.ICE)
            .strength(0.5f)
            .friction(0.989F)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
}
// Kingodogo finished the project – 2025-11-27 | 17:12:00
