package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.kingodogo.buildscape.BuildScape;

public class ModBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildScape.MODID);
    
    public static final RegistryObject<Block> POLISHED_STONE_BLOCK = BLOCKS.register("polished_stone_block", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE)
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BLACK_SAND = BLOCKS.register("black_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> BLUE_SAND = BLOCKS.register("blue_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> GREEN_SAND = BLOCKS.register("green_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GREEN)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> ORANGE_SAND = BLOCKS.register("orange_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> PINK_SAND = BLOCKS.register("pink_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PINK)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> RED_SAND = BLOCKS.register("red_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_RED)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> WHITE_SAND = BLOCKS.register("white_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> YELLOW_SAND = BLOCKS.register("yellow_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(0.5f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    // Sandstone blocks
    public static final RegistryObject<Block> BLACK_SANDSTONE = BLOCKS.register("black_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> BLUE_SANDSTONE = BLOCKS.register("blue_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> GREEN_SANDSTONE = BLOCKS.register("green_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GREEN)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> ORANGE_SANDSTONE = BLOCKS.register("orange_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> PINK_SANDSTONE = BLOCKS.register("pink_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PINK)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> RED_SANDSTONE = BLOCKS.register("red_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_RED)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> WHITE_SANDSTONE = BLOCKS.register("white_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    public static final RegistryObject<Block> YELLOW_SANDSTONE = BLOCKS.register("yellow_sandstone", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(0.8f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)));
    
    // Tile blocks
    public static final RegistryObject<Block> BLACK_TILES = BLOCKS.register("black_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BLUE_TILES = BLOCKS.register("blue_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BROWN_TILES = BLOCKS.register("brown_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> CYAN_TILES = BLOCKS.register("cyan_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_CYAN)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> GRAY_TILES = BLOCKS.register("gray_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GRAY)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> GREEN_TILES = BLOCKS.register("green_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GREEN)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> LIGHT_BLUE_TILES = BLOCKS.register("light_blue_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_BLUE)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> LIGHT_GRAY_TILES = BLOCKS.register("light_gray_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_GRAY)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> LIME_TILES = BLOCKS.register("lime_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_GREEN)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> MAGENTA_TILES = BLOCKS.register("magenta_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_MAGENTA)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> ORANGE_TILES = BLOCKS.register("orange_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> PINK_TILES = BLOCKS.register("pink_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PINK)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> PURPLE_TILES = BLOCKS.register("purple_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PURPLE)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> RED_TILES = BLOCKS.register("red_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_RED)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> WHITE_TILES = BLOCKS.register("white_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> YELLOW_TILES = BLOCKS.register("yellow_tiles", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .requiresCorrectToolForDrops()));
    
    // Mosaic glass blocks
    public static final RegistryObject<Block> BLACK_MOSAIC_GLASS = BLOCKS.register("black_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLACK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BLUE_MOSAIC_GLASS = BLOCKS.register("blue_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BROWN_MOSAIC_GLASS = BLOCKS.register("brown_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> CYAN_MOSAIC_GLASS = BLOCKS.register("cyan_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_CYAN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> GRAY_MOSAIC_GLASS = BLOCKS.register("gray_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> GREEN_MOSAIC_GLASS = BLOCKS.register("green_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS = BLOCKS.register("light_blue_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_BLUE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS = BLOCKS.register("light_gray_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_GRAY)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> LIME_MOSAIC_GLASS = BLOCKS.register("lime_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_GREEN)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS = BLOCKS.register("magenta_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_MAGENTA)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS = BLOCKS.register("orange_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> PINK_MOSAIC_GLASS = BLOCKS.register("pink_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PINK)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS = BLOCKS.register("purple_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PURPLE)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> RED_MOSAIC_GLASS = BLOCKS.register("red_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_RED)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> WHITE_MOSAIC_GLASS = BLOCKS.register("white_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS = BLOCKS.register("yellow_mosaic_glass", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(0.3f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    // Copper variant blocks
    public static final RegistryObject<Block> BIT_CHISELED_COPPER = BLOCKS.register("bit_chiseled_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_COPPER_BLOCK = BLOCKS.register("bit_copper_block", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_COPPER_BULB = BLOCKS.register("bit_copper_bulb", 
        () -> new FreshCopperBulbBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_COPPER_GRATE = BLOCKS.register("bit_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_CUT_COPPER = BLOCKS.register("bit_cut_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    // Exposed copper variants
    public static final RegistryObject<Block> BIT_EXPOSED_CHISELED_COPPER = BLOCKS.register("bit_exposed_chiseled_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK = BLOCKS.register("bit_exposed_copper_block", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BULB = BLOCKS.register("bit_exposed_copper_bulb", 
        () -> new ExposedCopperBulbBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_GRATE = BLOCKS.register("bit_exposed_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER = BLOCKS.register("bit_exposed_cut_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    // Weathered copper variants
    public static final RegistryObject<Block> BIT_WEATHERED_CHISELED_COPPER = BLOCKS.register("bit_weathered_chiseled_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK = BLOCKS.register("bit_weathered_copper_block", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BULB = BLOCKS.register("bit_weathered_copper_bulb", 
        () -> new WeatheredCopperBulbBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_GRATE = BLOCKS.register("bit_weathered_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER = BLOCKS.register("bit_weathered_cut_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_NYLIUM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    // Oxidized copper variants
    public static final RegistryObject<Block> BIT_OXIDIZED_CHISELED_COPPER = BLOCKS.register("bit_oxidized_chiseled_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK = BLOCKS.register("bit_oxidized_copper_block", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BULB = BLOCKS.register("bit_oxidized_copper_bulb", 
        () -> new OxidizedCopperBulbBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_GRATE = BLOCKS.register("bit_oxidized_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER = BLOCKS.register("bit_oxidized_cut_copper", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WARPED_STEM)
            .strength(3.0f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
            .requiresCorrectToolForDrops()));
    
    // Tuff variant blocks
    public static final RegistryObject<Block> BIT_CHISELED_TUFF = BLOCKS.register("bit_chiseled_tuff", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_GRAY)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_CHISELED_TUFF_BRICKS = BLOCKS.register("bit_chiseled_tuff_bricks", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_GRAY)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF = BLOCKS.register("bit_polished_tuff", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_GRAY)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
            .requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS = BLOCKS.register("bit_tuff_bricks", 
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.TERRACOTTA_GRAY)
            .strength(1.5f, 6.0f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
            .requiresCorrectToolForDrops()));
}
