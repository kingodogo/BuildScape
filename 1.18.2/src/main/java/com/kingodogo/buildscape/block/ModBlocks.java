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
    
    public static final RegistryObject<Block> POLISHED_STONE_BLOCK = BLOCKS.register("polished_stone_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> BLACK_SAND = BLOCKS.register("black_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> BLUE_SAND = BLOCKS.register("blue_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> GREEN_SAND = BLOCKS.register("green_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> ORANGE_SAND = BLOCKS.register("orange_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> PINK_SAND = BLOCKS.register("pink_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> RED_SAND = BLOCKS.register("red_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> WHITE_SAND = BLOCKS.register("white_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    public static final RegistryObject<Block> YELLOW_SAND = BLOCKS.register("yellow_sand", 
        () -> new FallingSandBlock(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.SAND)));
    
    // Sandstone blocks - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SANDSTONE = BLOCKS.register("black_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> BLUE_SANDSTONE = BLOCKS.register("blue_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> GREEN_SANDSTONE = BLOCKS.register("green_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> ORANGE_SANDSTONE = BLOCKS.register("orange_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> PINK_SANDSTONE = BLOCKS.register("pink_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> RED_SANDSTONE = BLOCKS.register("red_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> WHITE_SANDSTONE = BLOCKS.register("white_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> YELLOW_SANDSTONE = BLOCKS.register("yellow_sandstone", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Tile blocks - using Material.STONE like sand uses Material.SAND, but with CALCITE sounds
    public static final RegistryObject<Block> BLACK_TILES = BLOCKS.register("black_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE), ModItems.BLACK_TILES_ITEM));
    
    public static final RegistryObject<Block> BLUE_TILES = BLOCKS.register("blue_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> BROWN_TILES = BLOCKS.register("brown_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> CYAN_TILES = BLOCKS.register("cyan_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> GRAY_TILES = BLOCKS.register("gray_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> GREEN_TILES = BLOCKS.register("green_tiles",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> LIGHT_BLUE_TILES = BLOCKS.register("light_blue_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> LIGHT_GRAY_TILES = BLOCKS.register("light_gray_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> LIME_TILES = BLOCKS.register("lime_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> MAGENTA_TILES = BLOCKS.register("magenta_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> ORANGE_TILES = BLOCKS.register("orange_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> PINK_TILES = BLOCKS.register("pink_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> PURPLE_TILES = BLOCKS.register("purple_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> RED_TILES = BLOCKS.register("red_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> WHITE_TILES = BLOCKS.register("white_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    public static final RegistryObject<Block> YELLOW_TILES = BLOCKS.register("yellow_tiles", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Mosaic glass blocks - using Material.GLASS like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_MOSAIC_GLASS = BLOCKS.register("black_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> BLUE_MOSAIC_GLASS = BLOCKS.register("blue_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> BROWN_MOSAIC_GLASS = BLOCKS.register("brown_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> CYAN_MOSAIC_GLASS = BLOCKS.register("cyan_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> GRAY_MOSAIC_GLASS = BLOCKS.register("gray_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> GREEN_MOSAIC_GLASS = BLOCKS.register("green_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS = BLOCKS.register("light_blue_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS = BLOCKS.register("light_gray_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> LIME_MOSAIC_GLASS = BLOCKS.register("lime_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS = BLOCKS.register("magenta_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS = BLOCKS.register("orange_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PINK_MOSAIC_GLASS = BLOCKS.register("pink_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS = BLOCKS.register("purple_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> RED_MOSAIC_GLASS = BLOCKS.register("red_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> WHITE_MOSAIC_GLASS = BLOCKS.register("white_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS = BLOCKS.register("yellow_mosaic_glass", 
        () -> new SilkTouchOnlyGlassBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    // Copper variant blocks - using Material.METAL like sand uses Material.SAND
    public static final RegistryObject<Block> BIT_CHISELED_COPPER = BLOCKS.register("bit_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_COPPER_BLOCK = BLOCKS.register("bit_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_COPPER_BULB = BLOCKS.register("bit_copper_bulb", 
        () -> new FreshCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_COPPER_GRATE = BLOCKS.register("bit_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_CUT_COPPER = BLOCKS.register("bit_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Exposed copper variants - using Material.METAL like sand uses Material.SAND
    public static final RegistryObject<Block> BIT_EXPOSED_CHISELED_COPPER = BLOCKS.register("bit_exposed_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK = BLOCKS.register("bit_exposed_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BULB = BLOCKS.register("bit_exposed_copper_bulb", 
        () -> new ExposedCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_GRATE = BLOCKS.register("bit_exposed_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER = BLOCKS.register("bit_exposed_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Weathered copper variants - using Material.METAL like sand uses Material.SAND
    public static final RegistryObject<Block> BIT_WEATHERED_CHISELED_COPPER = BLOCKS.register("bit_weathered_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK = BLOCKS.register("bit_weathered_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BULB = BLOCKS.register("bit_weathered_copper_bulb", 
        () -> new WeatheredCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_GRATE = BLOCKS.register("bit_weathered_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER = BLOCKS.register("bit_weathered_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Oxidized copper variants - using Material.METAL like sand uses Material.SAND
    public static final RegistryObject<Block> BIT_OXIDIZED_CHISELED_COPPER = BLOCKS.register("bit_oxidized_chiseled_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK = BLOCKS.register("bit_oxidized_copper_block", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BULB = BLOCKS.register("bit_oxidized_copper_bulb", 
        () -> new OxidizedCopperBulbBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_BULB_SOUNDS())
            .isRedstoneConductor((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_GRATE = BLOCKS.register("bit_oxidized_copper_grate", 
        () -> new WaterloggableGrateBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(ModSounds.COPPER_GRATE_SOUNDS())
            .noOcclusion()
            .isRedstoneConductor((state, reader, pos) -> false)
            .isSuffocating((state, reader, pos) -> false)
            .isViewBlocking((state, reader, pos) -> false)));
    
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER = BLOCKS.register("bit_oxidized_cut_copper", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    
    // Tuff variant blocks - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BIT_CHISELED_TUFF = BLOCKS.register("bit_chiseled_tuff", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_CHISELED_TUFF_BRICKS = BLOCKS.register("bit_chiseled_tuff_bricks", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF = BLOCKS.register("bit_polished_tuff", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS = BLOCKS.register("bit_tuff_bricks", 
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF_STAIRS = BLOCKS.register("bit_polished_tuff_stairs",
        () -> new ModStairBlock(BIT_POLISHED_TUFF.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF_SLAB = BLOCKS.register("bit_polished_tuff_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_POLISHED_TUFF_WALL = BLOCKS.register("bit_polished_tuff_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS_STAIRS = BLOCKS.register("bit_tuff_bricks_stairs",
        () -> new ModStairBlock(BIT_TUFF_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS_SLAB = BLOCKS.register("bit_tuff_bricks_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    public static final RegistryObject<Block> BIT_TUFF_BRICKS_WALL = BLOCKS.register("bit_tuff_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.TUFF)
));
    
    // Podzol, dirt, and mycelium slabs
    public static final RegistryObject<Block> PODZOL_SLAB = BLOCKS.register("podzol_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.PODZOL)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    public static final RegistryObject<Block> DIRT_SLAB = BLOCKS.register("dirt_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GRAVEL)));
    
    public static final RegistryObject<Block> MYCELIUM_SLAB = BLOCKS.register("mycelium_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_PURPLE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GRASS)));
    
    // Mud block - using Material.DIRT similar to vanilla mud
    public static final RegistryObject<Block> MUD = BLOCKS.register("mud",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN)
            .strength(0.5f)
            .sound(ModSounds.MUD_SOUNDS())));
    
    // Mud slab
    public static final RegistryObject<Block> MUD_SLAB = BLOCKS.register("mud_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN)
            .strength(0.5f)
            .sound(ModSounds.MUD_SOUNDS())));
    
    // Smooth sandstone blocks - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE = BLOCKS.register("black_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE = BLOCKS.register("blue_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE = BLOCKS.register("green_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE = BLOCKS.register("orange_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE = BLOCKS.register("pink_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE = BLOCKS.register("red_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE = BLOCKS.register("white_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE = BLOCKS.register("yellow_smooth_sandstone",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Mosaic glass panes - using Material.GLASS like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_MOSAIC_GLASS_PANE = BLOCKS.register("black_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> BLUE_MOSAIC_GLASS_PANE = BLOCKS.register("blue_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> BROWN_MOSAIC_GLASS_PANE = BLOCKS.register("brown_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> CYAN_MOSAIC_GLASS_PANE = BLOCKS.register("cyan_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> GRAY_MOSAIC_GLASS_PANE = BLOCKS.register("gray_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> GREEN_MOSAIC_GLASS_PANE = BLOCKS.register("green_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIGHT_BLUE_MOSAIC_GLASS_PANE = BLOCKS.register("light_blue_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIGHT_GRAY_MOSAIC_GLASS_PANE = BLOCKS.register("light_gray_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> LIME_MOSAIC_GLASS_PANE = BLOCKS.register("lime_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> MAGENTA_MOSAIC_GLASS_PANE = BLOCKS.register("magenta_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_MAGENTA)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> ORANGE_MOSAIC_GLASS_PANE = BLOCKS.register("orange_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> PINK_MOSAIC_GLASS_PANE = BLOCKS.register("pink_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> PURPLE_MOSAIC_GLASS_PANE = BLOCKS.register("purple_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> RED_MOSAIC_GLASS_PANE = BLOCKS.register("red_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> WHITE_MOSAIC_GLASS_PANE = BLOCKS.register("white_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    public static final RegistryObject<Block> YELLOW_MOSAIC_GLASS_PANE = BLOCKS.register("yellow_mosaic_glass_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.GLASS)
            .noOcclusion()));
    
    // Disabled obsidian glass pane for now
    // public static final RegistryObject<Block> OBSIDIAN_GLASS_PANE = BLOCKS.register("obsidian_glass_pane",
    //     () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.COLOR_BLACK)
    //         .strength(0.4f)
    //         .sound(net.minecraft.world.level.block.SoundType.STONE)
    //         .noOcclusion()));
    
    // Sandstone stairs - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SANDSTONE_STAIRS = BLOCKS.register("black_sandstone_stairs",
        () -> new ModStairBlock(BLACK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE), ModItems.BLACK_SANDSTONE_STAIRS_ITEM));
    public static final RegistryObject<Block> BLUE_SANDSTONE_STAIRS = BLOCKS.register("blue_sandstone_stairs",
        () -> new ModStairBlock(BLUE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SANDSTONE_STAIRS = BLOCKS.register("green_sandstone_stairs",
        () -> new ModStairBlock(GREEN_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_STAIRS = BLOCKS.register("orange_sandstone_stairs",
        () -> new ModStairBlock(ORANGE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SANDSTONE_STAIRS = BLOCKS.register("pink_sandstone_stairs",
        () -> new ModStairBlock(PINK_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SANDSTONE_STAIRS = BLOCKS.register("red_sandstone_stairs",
        () -> new ModStairBlock(RED_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SANDSTONE_STAIRS = BLOCKS.register("white_sandstone_stairs",
        () -> new ModStairBlock(WHITE_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SANDSTONE_STAIRS = BLOCKS.register("yellow_sandstone_stairs",
        () -> new ModStairBlock(YELLOW_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Sandstone slabs - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SANDSTONE_SLAB = BLOCKS.register("black_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SANDSTONE_SLAB = BLOCKS.register("blue_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SANDSTONE_SLAB = BLOCKS.register("green_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_SLAB = BLOCKS.register("orange_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SANDSTONE_SLAB = BLOCKS.register("pink_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SANDSTONE_SLAB = BLOCKS.register("red_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SANDSTONE_SLAB = BLOCKS.register("white_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SANDSTONE_SLAB = BLOCKS.register("yellow_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Sandstone walls - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SANDSTONE_WALL = BLOCKS.register("black_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SANDSTONE_WALL = BLOCKS.register("blue_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SANDSTONE_WALL = BLOCKS.register("green_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WALL = BLOCKS.register("orange_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SANDSTONE_WALL = BLOCKS.register("pink_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SANDSTONE_WALL = BLOCKS.register("red_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SANDSTONE_WALL = BLOCKS.register("white_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SANDSTONE_WALL = BLOCKS.register("yellow_sandstone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Smooth sandstone slabs - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("black_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("blue_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("green_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("orange_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("pink_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("red_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("white_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("yellow_smooth_sandstone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Smooth sandstone stairs - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> BLACK_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("black_smooth_sandstone_stairs",
        () -> new ModStairBlock(BLACK_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BLUE_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("blue_smooth_sandstone_stairs",
        () -> new ModStairBlock(BLUE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> GREEN_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("green_smooth_sandstone_stairs",
        () -> new ModStairBlock(GREEN_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> ORANGE_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("orange_smooth_sandstone_stairs",
        () -> new ModStairBlock(ORANGE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> PINK_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("pink_smooth_sandstone_stairs",
        () -> new ModStairBlock(PINK_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> RED_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("red_smooth_sandstone_stairs",
        () -> new ModStairBlock(RED_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> WHITE_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("white_smooth_sandstone_stairs",
        () -> new ModStairBlock(WHITE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> YELLOW_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("yellow_smooth_sandstone_stairs",
        () -> new ModStairBlock(YELLOW_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    // Tiles stairs - using Material.STONE like sand uses Material.SAND, but with CALCITE sounds
    public static final RegistryObject<Block> BLACK_TILES_STAIRS = BLOCKS.register("black_tiles_stairs",
        () -> new ModStairBlock(BLACK_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BLUE_TILES_STAIRS = BLOCKS.register("blue_tiles_stairs",
        () -> new ModStairBlock(BLUE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BROWN_TILES_STAIRS = BLOCKS.register("brown_tiles_stairs",
        () -> new ModStairBlock(BROWN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CYAN_TILES_STAIRS = BLOCKS.register("cyan_tiles_stairs",
        () -> new ModStairBlock(CYAN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GRAY_TILES_STAIRS = BLOCKS.register("gray_tiles_stairs",
        () -> new ModStairBlock(GRAY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GREEN_TILES_STAIRS = BLOCKS.register("green_tiles_stairs",
        () -> new ModStairBlock(GREEN_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_BLUE_TILES_STAIRS = BLOCKS.register("light_blue_tiles_stairs",
        () -> new ModStairBlock(LIGHT_BLUE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_GRAY_TILES_STAIRS = BLOCKS.register("light_gray_tiles_stairs",
        () -> new ModStairBlock(LIGHT_GRAY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIME_TILES_STAIRS = BLOCKS.register("lime_tiles_stairs",
        () -> new ModStairBlock(LIME_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MAGENTA_TILES_STAIRS = BLOCKS.register("magenta_tiles_stairs",
        () -> new ModStairBlock(MAGENTA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> ORANGE_TILES_STAIRS = BLOCKS.register("orange_tiles_stairs",
        () -> new ModStairBlock(ORANGE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PINK_TILES_STAIRS = BLOCKS.register("pink_tiles_stairs",
        () -> new ModStairBlock(PINK_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PURPLE_TILES_STAIRS = BLOCKS.register("purple_tiles_stairs",
        () -> new ModStairBlock(PURPLE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> RED_TILES_STAIRS = BLOCKS.register("red_tiles_stairs",
        () -> new ModStairBlock(RED_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> WHITE_TILES_STAIRS = BLOCKS.register("white_tiles_stairs",
        () -> new ModStairBlock(WHITE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> YELLOW_TILES_STAIRS = BLOCKS.register("yellow_tiles_stairs",
        () -> new ModStairBlock(YELLOW_TILES.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Tiles slabs - using Material.STONE like sand uses Material.SAND, but with CALCITE sounds
    public static final RegistryObject<Block> BLACK_TILES_SLAB = BLOCKS.register("black_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BLUE_TILES_SLAB = BLOCKS.register("blue_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BROWN_TILES_SLAB = BLOCKS.register("brown_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CYAN_TILES_SLAB = BLOCKS.register("cyan_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GRAY_TILES_SLAB = BLOCKS.register("gray_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GREEN_TILES_SLAB = BLOCKS.register("green_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_BLUE_TILES_SLAB = BLOCKS.register("light_blue_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_GRAY_TILES_SLAB = BLOCKS.register("light_gray_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIME_TILES_SLAB = BLOCKS.register("lime_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MAGENTA_TILES_SLAB = BLOCKS.register("magenta_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> ORANGE_TILES_SLAB = BLOCKS.register("orange_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PINK_TILES_SLAB = BLOCKS.register("pink_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PURPLE_TILES_SLAB = BLOCKS.register("purple_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> RED_TILES_SLAB = BLOCKS.register("red_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> WHITE_TILES_SLAB = BLOCKS.register("white_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> YELLOW_TILES_SLAB = BLOCKS.register("yellow_tiles_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Tiles walls - using Material.STONE like sand uses Material.SAND, but with CALCITE sounds
    public static final RegistryObject<Block> BLACK_TILES_WALL = BLOCKS.register("black_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BLUE_TILES_WALL = BLOCKS.register("blue_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BROWN_TILES_WALL = BLOCKS.register("brown_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CYAN_TILES_WALL = BLOCKS.register("cyan_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GRAY_TILES_WALL = BLOCKS.register("gray_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> GREEN_TILES_WALL = BLOCKS.register("green_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GREEN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_BLUE_TILES_WALL = BLOCKS.register("light_blue_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_BLUE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIGHT_GRAY_TILES_WALL = BLOCKS.register("light_gray_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> LIME_TILES_WALL = BLOCKS.register("lime_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MAGENTA_TILES_WALL = BLOCKS.register("magenta_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_MAGENTA)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> ORANGE_TILES_WALL = BLOCKS.register("orange_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PINK_TILES_WALL = BLOCKS.register("pink_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PINK)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> PURPLE_TILES_WALL = BLOCKS.register("purple_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> RED_TILES_WALL = BLOCKS.register("red_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_RED)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> WHITE_TILES_WALL = BLOCKS.register("white_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW)
            .strength(1.0f, 3.0f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> YELLOW_TILES_WALL = BLOCKS.register("yellow_tiles_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Vanilla block variants (only blocks that exist in 1.21.1) - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs",
        () -> new ModStairBlock(Blocks.POLISHED_BASALT.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> POLISHED_BASALT_WALL = BLOCKS.register("polished_basalt_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_STAIRS = BLOCKS.register("dripstone_block_stairs",
        () -> new ModStairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.DRIPSTONE_BLOCK)
));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_SLAB = BLOCKS.register("dripstone_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.DRIPSTONE_BLOCK)
));
    public static final RegistryObject<Block> DRIPSTONE_BLOCK_WALL = BLOCKS.register("dripstone_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BROWN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.DRIPSTONE_BLOCK)
));
    public static final RegistryObject<Block> END_STONE_STAIRS = BLOCKS.register("end_stone_stairs",
        () -> new ModStairBlock(Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> END_STONE_SLAB = BLOCKS.register("end_stone_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> END_STONE_WALL = BLOCKS.register("end_stone_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BRICKS_STAIRS = BLOCKS.register("quartz_bricks_stairs",
        () -> new ModStairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = BLOCKS.register("quartz_bricks_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BRICKS_WALL = BLOCKS.register("quartz_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> CALCITE_STAIRS = BLOCKS.register("calcite_stairs",
        () -> new ModStairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CALCITE_SLAB = BLOCKS.register("calcite_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> CALCITE_WALL = BLOCKS.register("calcite_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> BEDROCK_STAIRS = BLOCKS.register("bedrock_stairs",
        () -> new ModStairBlock(Blocks.BEDROCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BEDROCK_SLAB = BLOCKS.register("bedrock_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> BEDROCK_WALL = BLOCKS.register("bedrock_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    
    public static final RegistryObject<Block> BEDROCK_PANE = BLOCKS.register("bedrock_pane",
        () -> new SilkTouchOnlyPaneBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
            .noOcclusion()
));
    
    public static final RegistryObject<Block> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs",
        () -> new ModStairBlock(Blocks.OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(5.0f, 10.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(5.0f, 10.0f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    // Disabled obsidian wall for now
    // public static final RegistryObject<Block> OBSIDIAN_WALL = BLOCKS.register("obsidian_wall",
    //     () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
    //         .strength(50.0f, 1200.0f)
    //         .sound(net.minecraft.world.level.block.SoundType.STONE)
    //         ));
    
    public static final RegistryObject<Block> PRISMARINE_BRICKS_WALL = BLOCKS.register("prismarine_bricks_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = BLOCKS.register("dark_prismarine_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_CYAN)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> QUARTZ_BLOCK_WALL = BLOCKS.register("quartz_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = BLOCKS.register("smooth_quartz_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.STONE)
));
    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = BLOCKS.register("smooth_basalt_stairs",
        () -> new ModStairBlock(Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.BASALT)
));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = BLOCKS.register("smooth_basalt_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
            .strength(0.4f)
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
            .sound(net.minecraft.world.level.block.SoundType.AMETHYST)
));
    
    // Mossy calcite - using Material.STONE like sand uses Material.SAND
    public static final RegistryObject<Block> MOSSY_CALCITE = BLOCKS.register("mossy_calcite",
        () -> new ModBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MOSSY_CALCITE_STAIRS = BLOCKS.register("mossy_calcite_stairs",
        () -> new ModStairBlock(MOSSY_CALCITE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MOSSY_CALCITE_SLAB = BLOCKS.register("mossy_calcite_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    public static final RegistryObject<Block> MOSSY_CALCITE_WALL = BLOCKS.register("mossy_calcite_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.4f)
            .sound(net.minecraft.world.level.block.SoundType.CALCITE)
));
    
    // Bit copper variants - using Material.METAL like sand uses Material.SAND
    public static final RegistryObject<Block> BIT_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_copper_block_stairs",
        () -> new ModStairBlock(BIT_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_COPPER_BLOCK_SLAB = BLOCKS.register("bit_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_COPPER_BLOCK_WALL = BLOCKS.register("bit_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_exposed_copper_block_stairs",
        () -> new ModStairBlock(BIT_EXPOSED_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK_SLAB = BLOCKS.register("bit_exposed_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_COPPER_BLOCK_WALL = BLOCKS.register("bit_exposed_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_weathered_copper_block_stairs",
        () -> new ModStairBlock(BIT_WEATHERED_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK_SLAB = BLOCKS.register("bit_weathered_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_COPPER_BLOCK_WALL = BLOCKS.register("bit_weathered_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK_STAIRS = BLOCKS.register("bit_oxidized_copper_block_stairs",
        () -> new ModStairBlock(BIT_OXIDIZED_COPPER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK_SLAB = BLOCKS.register("bit_oxidized_copper_block_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_COPPER_BLOCK_WALL = BLOCKS.register("bit_oxidized_copper_block_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_CUT_COPPER_STAIRS = BLOCKS.register("bit_cut_copper_stairs",
        () -> new ModStairBlock(BIT_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_CUT_COPPER_SLAB = BLOCKS.register("bit_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_CUT_COPPER_WALL = BLOCKS.register("bit_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER_STAIRS = BLOCKS.register("bit_exposed_cut_copper_stairs",
        () -> new ModStairBlock(BIT_EXPOSED_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER_SLAB = BLOCKS.register("bit_exposed_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_EXPOSED_CUT_COPPER_WALL = BLOCKS.register("bit_exposed_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER_STAIRS = BLOCKS.register("bit_weathered_cut_copper_stairs",
        () -> new ModStairBlock(BIT_WEATHERED_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER_SLAB = BLOCKS.register("bit_weathered_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_WEATHERED_CUT_COPPER_WALL = BLOCKS.register("bit_weathered_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER_STAIRS = BLOCKS.register("bit_oxidized_cut_copper_stairs",
        () -> new ModStairBlock(BIT_OXIDIZED_CUT_COPPER.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER_SLAB = BLOCKS.register("bit_oxidized_cut_copper_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
            .sound(net.minecraft.world.level.block.SoundType.COPPER)
));
    public static final RegistryObject<Block> BIT_OXIDIZED_CUT_COPPER_WALL = BLOCKS.register("bit_oxidized_cut_copper_wall",
        () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM)
            .strength(0.75f, 1.5f)
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
}
// Kingodogo finished the project at 2025-11-02 12:13:45
