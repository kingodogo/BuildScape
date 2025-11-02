package com.kingodogo.buildscape.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

// <item> Generates block tags for all mod blocks
public class ModBlockTagsProvider extends BlockTagsProvider {
    // <colored> Vanilla tag keys
    private static final TagKey<Block> SAND_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("minecraft", "sand"));

    // <colored> Mod-specific tag keys
    private static final TagKey<Block> MOD_SAND_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "sand"));
    private static final TagKey<Block> MOD_SANDSTONE_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "sandstone"));
    private static final TagKey<Block> MOD_TILES_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "tiles"));
    private static final TagKey<Block> MOD_MOSAIC_GLASS_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "mosaic_glass"));
    private static final TagKey<Block> MOD_MOSAIC_GLASS_PANE_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "mosaic_glass_pane"));
    private static final TagKey<Block> MOD_TUFF_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "tuff"));
    private static final TagKey<Block> MOD_COPPER_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "copper"));
    private static final TagKey<Block> MOD_CALCITE_TAG = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, "calcite"));

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BuildScape.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // <item> Organize tags by category for better maintainability
        addSandBlocks();
        addSandstoneBlocks();
        addTuffBlocks();
        addCopperBlocks();
        addCalciteBlocks();
        addOtherStoneBlocks();
        addMiscBlocks();
    }

    // <item> Add tags for sand blocks - mineable with shovel, tagged as sand for vanilla compatibility
    private void addSandBlocks() {
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
            ModBlocks.BLACK_SAND.get(),
            ModBlocks.BLUE_SAND.get(),
            ModBlocks.GREEN_SAND.get(),
            ModBlocks.ORANGE_SAND.get(),
            ModBlocks.PINK_SAND.get(),
            ModBlocks.RED_SAND.get(),
            ModBlocks.WHITE_SAND.get(),
            ModBlocks.YELLOW_SAND.get()
        );

        this.tag(SAND_TAG).add(
            ModBlocks.BLACK_SAND.get(),
            ModBlocks.BLUE_SAND.get(),
            ModBlocks.GREEN_SAND.get(),
            ModBlocks.ORANGE_SAND.get(),
            ModBlocks.PINK_SAND.get(),
            ModBlocks.RED_SAND.get(),
            ModBlocks.WHITE_SAND.get(),
            ModBlocks.YELLOW_SAND.get()
        );

        this.tag(MOD_SAND_TAG).add(
            ModBlocks.BLACK_SAND.get(),
            ModBlocks.BLUE_SAND.get(),
            ModBlocks.GREEN_SAND.get(),
            ModBlocks.ORANGE_SAND.get(),
            ModBlocks.PINK_SAND.get(),
            ModBlocks.RED_SAND.get(),
            ModBlocks.WHITE_SAND.get(),
            ModBlocks.YELLOW_SAND.get()
        );
    }

    // <item> Add tags for sandstone blocks and variants - mineable with pickaxe, needs stone tool
    private void addSandstoneBlocks() {
        var allSandstoneBlocks = new Block[] {
            ModBlocks.BLACK_SANDSTONE.get(),
            ModBlocks.BLUE_SANDSTONE.get(),
            ModBlocks.GREEN_SANDSTONE.get(),
            ModBlocks.ORANGE_SANDSTONE.get(),
            ModBlocks.PINK_SANDSTONE.get(),
            ModBlocks.RED_SANDSTONE.get(),
            ModBlocks.WHITE_SANDSTONE.get(),
            ModBlocks.YELLOW_SANDSTONE.get(),
            ModBlocks.BLACK_SMOOTH_SANDSTONE.get(),
            ModBlocks.BLUE_SMOOTH_SANDSTONE.get(),
            ModBlocks.GREEN_SMOOTH_SANDSTONE.get(),
            ModBlocks.ORANGE_SMOOTH_SANDSTONE.get(),
            ModBlocks.PINK_SMOOTH_SANDSTONE.get(),
            ModBlocks.RED_SMOOTH_SANDSTONE.get(),
            ModBlocks.WHITE_SMOOTH_SANDSTONE.get(),
            ModBlocks.YELLOW_SMOOTH_SANDSTONE.get()
        };

        var allSandstoneStairs = new Block[] {
            ModBlocks.BLACK_SANDSTONE_STAIRS.get(),
            ModBlocks.BLUE_SANDSTONE_STAIRS.get(),
            ModBlocks.GREEN_SANDSTONE_STAIRS.get(),
            ModBlocks.ORANGE_SANDSTONE_STAIRS.get(),
            ModBlocks.PINK_SANDSTONE_STAIRS.get(),
            ModBlocks.RED_SANDSTONE_STAIRS.get(),
            ModBlocks.WHITE_SANDSTONE_STAIRS.get(),
            ModBlocks.YELLOW_SANDSTONE_STAIRS.get(),
            ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.BLUE_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.GREEN_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.ORANGE_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.RED_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get(),
            ModBlocks.YELLOW_SMOOTH_SANDSTONE_STAIRS.get()
        };

        var allSandstoneSlabs = new Block[] {
            ModBlocks.BLACK_SANDSTONE_SLAB.get(),
            ModBlocks.BLUE_SANDSTONE_SLAB.get(),
            ModBlocks.GREEN_SANDSTONE_SLAB.get(),
            ModBlocks.ORANGE_SANDSTONE_SLAB.get(),
            ModBlocks.PINK_SANDSTONE_SLAB.get(),
            ModBlocks.RED_SANDSTONE_SLAB.get(),
            ModBlocks.WHITE_SANDSTONE_SLAB.get(),
            ModBlocks.YELLOW_SANDSTONE_SLAB.get(),
            ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.BLUE_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.GREEN_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.ORANGE_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.RED_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get(),
            ModBlocks.YELLOW_SMOOTH_SANDSTONE_SLAB.get()
        };

        var allSandstoneWalls = new Block[] {
            ModBlocks.BLACK_SANDSTONE_WALL.get(),
            ModBlocks.BLUE_SANDSTONE_WALL.get(),
            ModBlocks.GREEN_SANDSTONE_WALL.get(),
            ModBlocks.ORANGE_SANDSTONE_WALL.get(),
            ModBlocks.PINK_SANDSTONE_WALL.get(),
            ModBlocks.RED_SANDSTONE_WALL.get(),
            ModBlocks.WHITE_SANDSTONE_WALL.get(),
            ModBlocks.YELLOW_SANDSTONE_WALL.get()
        };

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(allSandstoneBlocks);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(allSandstoneBlocks);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(allSandstoneStairs);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(allSandstoneStairs);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(allSandstoneSlabs);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(allSandstoneSlabs);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(allSandstoneWalls);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(allSandstoneWalls);

        // <colored> Add all sandstone blocks to mod-specific sandstone tag
        for (Block block : allSandstoneBlocks) {
            this.tag(MOD_SANDSTONE_TAG).add(block);
        }
        for (Block block : allSandstoneStairs) {
            this.tag(MOD_SANDSTONE_TAG).add(block);
        }
        for (Block block : allSandstoneSlabs) {
            this.tag(MOD_SANDSTONE_TAG).add(block);
        }
        for (Block block : allSandstoneWalls) {
            this.tag(MOD_SANDSTONE_TAG).add(block);
        }
    }

    // <item> Add tags for tuff blocks - mineable with pickaxe, needs stone tool
    private void addTuffBlocks() {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
            ModBlocks.BIT_CHISELED_TUFF.get(),
            ModBlocks.BIT_CHISELED_TUFF_BRICKS.get(),
            ModBlocks.BIT_POLISHED_TUFF.get(),
            ModBlocks.BIT_POLISHED_TUFF_STAIRS.get(),
            ModBlocks.BIT_POLISHED_TUFF_SLAB.get(),
            ModBlocks.BIT_POLISHED_TUFF_WALL.get(),
            ModBlocks.BIT_TUFF_BRICKS.get(),
            ModBlocks.BIT_TUFF_BRICKS_STAIRS.get(),
            ModBlocks.BIT_TUFF_BRICKS_SLAB.get(),
            ModBlocks.BIT_TUFF_BRICKS_WALL.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
            ModBlocks.BIT_CHISELED_TUFF.get(),
            ModBlocks.BIT_CHISELED_TUFF_BRICKS.get(),
            ModBlocks.BIT_POLISHED_TUFF.get(),
            ModBlocks.BIT_POLISHED_TUFF_STAIRS.get(),
            ModBlocks.BIT_POLISHED_TUFF_SLAB.get(),
            ModBlocks.BIT_POLISHED_TUFF_WALL.get(),
            ModBlocks.BIT_TUFF_BRICKS.get(),
            ModBlocks.BIT_TUFF_BRICKS_STAIRS.get(),
            ModBlocks.BIT_TUFF_BRICKS_SLAB.get(),
            ModBlocks.BIT_TUFF_BRICKS_WALL.get()
        );

        this.tag(MOD_TUFF_TAG).add(
            ModBlocks.BIT_CHISELED_TUFF.get(),
            ModBlocks.BIT_CHISELED_TUFF_BRICKS.get(),
            ModBlocks.BIT_POLISHED_TUFF.get(),
            ModBlocks.BIT_POLISHED_TUFF_STAIRS.get(),
            ModBlocks.BIT_POLISHED_TUFF_SLAB.get(),
            ModBlocks.BIT_POLISHED_TUFF_WALL.get(),
            ModBlocks.BIT_TUFF_BRICKS.get(),
            ModBlocks.BIT_TUFF_BRICKS_STAIRS.get(),
            ModBlocks.BIT_TUFF_BRICKS_SLAB.get(),
            ModBlocks.BIT_TUFF_BRICKS_WALL.get()
        );
    }

    // <item> Add tags for copper blocks - mineable with pickaxe, needs stone tool
    private void addCopperBlocks() {
        Block[] copperBlocks = {
            ModBlocks.BIT_CHISELED_COPPER.get(),
            ModBlocks.BIT_COPPER_BLOCK.get(),
            ModBlocks.BIT_COPPER_BULB.get(),
            ModBlocks.BIT_COPPER_GRATE.get(),
            ModBlocks.BIT_CUT_COPPER.get(),
            ModBlocks.BIT_EXPOSED_CHISELED_COPPER.get(),
            ModBlocks.BIT_EXPOSED_COPPER_BLOCK.get(),
            ModBlocks.BIT_EXPOSED_COPPER_BULB.get(),
            ModBlocks.BIT_EXPOSED_COPPER_GRATE.get(),
            ModBlocks.BIT_EXPOSED_CUT_COPPER.get(),
            ModBlocks.BIT_WEATHERED_CHISELED_COPPER.get(),
            ModBlocks.BIT_WEATHERED_COPPER_BLOCK.get(),
            ModBlocks.BIT_WEATHERED_COPPER_BULB.get(),
            ModBlocks.BIT_WEATHERED_COPPER_GRATE.get(),
            ModBlocks.BIT_WEATHERED_CUT_COPPER.get(),
            ModBlocks.BIT_OXIDIZED_CHISELED_COPPER.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_BLOCK.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_BULB.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_GRATE.get(),
            ModBlocks.BIT_OXIDIZED_CUT_COPPER.get(),
            ModBlocks.BIT_COPPER_BLOCK_STAIRS.get(),
            ModBlocks.BIT_COPPER_BLOCK_SLAB.get(),
            ModBlocks.BIT_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_EXPOSED_COPPER_BLOCK_STAIRS.get(),
            ModBlocks.BIT_EXPOSED_COPPER_BLOCK_SLAB.get(),
            ModBlocks.BIT_EXPOSED_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_WEATHERED_COPPER_BLOCK_STAIRS.get(),
            ModBlocks.BIT_WEATHERED_COPPER_BLOCK_SLAB.get(),
            ModBlocks.BIT_WEATHERED_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_STAIRS.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_SLAB.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_CUT_COPPER_STAIRS.get(),
            ModBlocks.BIT_CUT_COPPER_SLAB.get(),
            ModBlocks.BIT_CUT_COPPER_WALL.get(),
            ModBlocks.BIT_EXPOSED_CUT_COPPER_STAIRS.get(),
            ModBlocks.BIT_EXPOSED_CUT_COPPER_SLAB.get(),
            ModBlocks.BIT_EXPOSED_CUT_COPPER_WALL.get(),
            ModBlocks.BIT_WEATHERED_CUT_COPPER_STAIRS.get(),
            ModBlocks.BIT_WEATHERED_CUT_COPPER_SLAB.get(),
            ModBlocks.BIT_WEATHERED_CUT_COPPER_WALL.get(),
            ModBlocks.BIT_OXIDIZED_CUT_COPPER_STAIRS.get(),
            ModBlocks.BIT_OXIDIZED_CUT_COPPER_SLAB.get(),
            ModBlocks.BIT_OXIDIZED_CUT_COPPER_WALL.get()
        };

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(copperBlocks);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(copperBlocks);
        this.tag(MOD_COPPER_TAG).add(copperBlocks);
    }

    // <item> Add tags for calcite blocks - mineable with pickaxe, needs stone tool
    private void addCalciteBlocks() {
        Block[] calciteBlocks = {
            ModBlocks.CALCITE_STAIRS.get(),
            ModBlocks.CALCITE_SLAB.get(),
            ModBlocks.CALCITE_WALL.get(),
            ModBlocks.MOSSY_CALCITE.get(),
            ModBlocks.MOSSY_CALCITE_STAIRS.get(),
            ModBlocks.MOSSY_CALCITE_SLAB.get(),
            ModBlocks.MOSSY_CALCITE_WALL.get()
        };

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(calciteBlocks);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(calciteBlocks);
        this.tag(MOD_CALCITE_TAG).add(calciteBlocks);
    }

    // <item> Add tags for other stone blocks - mineable with pickaxe
    private void addOtherStoneBlocks() {
        Block[] otherStoneBlocks = {
            ModBlocks.POLISHED_STONE_BLOCK.get(),
            ModBlocks.POLISHED_BASALT_STAIRS.get(),
            ModBlocks.POLISHED_BASALT_SLAB.get(),
            ModBlocks.POLISHED_BASALT_WALL.get(),
            ModBlocks.SMOOTH_BASALT_STAIRS.get(),
            ModBlocks.SMOOTH_BASALT_SLAB.get(),
            ModBlocks.DRIPSTONE_BLOCK_STAIRS.get(),
            ModBlocks.DRIPSTONE_BLOCK_SLAB.get(),
            ModBlocks.DRIPSTONE_BLOCK_WALL.get(),
            ModBlocks.END_STONE_STAIRS.get(),
            ModBlocks.END_STONE_SLAB.get(),
            ModBlocks.END_STONE_WALL.get(),
            ModBlocks.QUARTZ_BRICKS_STAIRS.get(),
            ModBlocks.QUARTZ_BRICKS_SLAB.get(),
            ModBlocks.QUARTZ_BRICKS_WALL.get(),
            ModBlocks.QUARTZ_BLOCK_WALL.get(),
            ModBlocks.SMOOTH_QUARTZ_WALL.get(),
            ModBlocks.PRISMARINE_BRICKS_WALL.get(),
            ModBlocks.DARK_PRISMARINE_WALL.get(),
            ModBlocks.AMETHYST_BLOCK_SLAB.get()
        };

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(otherStoneBlocks);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(otherStoneBlocks);

        // <item> Bedrock variants don't need tool tags (unbreakable)
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
            ModBlocks.BEDROCK_STAIRS.get(),
            ModBlocks.BEDROCK_SLAB.get(),
            ModBlocks.BEDROCK_WALL.get(),
            ModBlocks.BEDROCK_PANE.get()
        );
    }

    // <item> Add tags for miscellaneous blocks (slabs, glass, tiles)
    private void addMiscBlocks() {
        // <colored> Slab blocks that are mineable with shovel
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
            ModBlocks.PODZOL_SLAB.get(),
            ModBlocks.DIRT_SLAB.get(),
            ModBlocks.MUD_SLAB.get(),
            ModBlocks.MYCELIUM_SLAB.get(),
            ModBlocks.MOSS_BLOCK_SLAB.get()
        );

        // <colored> Mosaic glass blocks - mineable with pickaxe
        Block[] mosaicGlassBlocks = {
            ModBlocks.BLACK_MOSAIC_GLASS.get(),
            ModBlocks.BLUE_MOSAIC_GLASS.get(),
            ModBlocks.BROWN_MOSAIC_GLASS.get(),
            ModBlocks.CYAN_MOSAIC_GLASS.get(),
            ModBlocks.GRAY_MOSAIC_GLASS.get(),
            ModBlocks.GREEN_MOSAIC_GLASS.get(),
            ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get(),
            ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get(),
            ModBlocks.LIME_MOSAIC_GLASS.get(),
            ModBlocks.MAGENTA_MOSAIC_GLASS.get(),
            ModBlocks.ORANGE_MOSAIC_GLASS.get(),
            ModBlocks.PINK_MOSAIC_GLASS.get(),
            ModBlocks.PURPLE_MOSAIC_GLASS.get(),
            ModBlocks.RED_MOSAIC_GLASS.get(),
            ModBlocks.WHITE_MOSAIC_GLASS.get(),
            ModBlocks.YELLOW_MOSAIC_GLASS.get()
        };

        Block[] mosaicGlassPanes = {
            ModBlocks.BLACK_MOSAIC_GLASS_PANE.get(),
            ModBlocks.BLUE_MOSAIC_GLASS_PANE.get(),
            ModBlocks.BROWN_MOSAIC_GLASS_PANE.get(),
            ModBlocks.CYAN_MOSAIC_GLASS_PANE.get(),
            ModBlocks.GRAY_MOSAIC_GLASS_PANE.get(),
            ModBlocks.GREEN_MOSAIC_GLASS_PANE.get(),
            ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get(),
            ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get(),
            ModBlocks.LIME_MOSAIC_GLASS_PANE.get(),
            ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get(),
            ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get(),
            ModBlocks.PINK_MOSAIC_GLASS_PANE.get(),
            ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get(),
            ModBlocks.RED_MOSAIC_GLASS_PANE.get(),
            ModBlocks.WHITE_MOSAIC_GLASS_PANE.get(),
            ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get()
        };

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(mosaicGlassBlocks);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(mosaicGlassPanes);
        this.tag(MOD_MOSAIC_GLASS_TAG).add(mosaicGlassBlocks);
        this.tag(MOD_MOSAIC_GLASS_PANE_TAG).add(mosaicGlassPanes);

        // <colored> Tile blocks - mineable with pickaxe, needs stone tool
        Block[] tileBlocks = {
            ModBlocks.BLACK_TILES.get(), ModBlocks.BLUE_TILES.get(), ModBlocks.BROWN_TILES.get(),
            ModBlocks.CYAN_TILES.get(), ModBlocks.GRAY_TILES.get(), ModBlocks.GREEN_TILES.get(),
            ModBlocks.LIGHT_BLUE_TILES.get(), ModBlocks.LIGHT_GRAY_TILES.get(), ModBlocks.LIME_TILES.get(),
            ModBlocks.MAGENTA_TILES.get(), ModBlocks.ORANGE_TILES.get(), ModBlocks.PINK_TILES.get(),
            ModBlocks.PURPLE_TILES.get(), ModBlocks.RED_TILES.get(), ModBlocks.WHITE_TILES.get(),
            ModBlocks.YELLOW_TILES.get()
        };

        Block[] tileStairs = {
            ModBlocks.BLACK_TILES_STAIRS.get(), ModBlocks.BLUE_TILES_STAIRS.get(), ModBlocks.BROWN_TILES_STAIRS.get(),
            ModBlocks.CYAN_TILES_STAIRS.get(), ModBlocks.GRAY_TILES_STAIRS.get(), ModBlocks.GREEN_TILES_STAIRS.get(),
            ModBlocks.LIGHT_BLUE_TILES_STAIRS.get(), ModBlocks.LIGHT_GRAY_TILES_STAIRS.get(), ModBlocks.LIME_TILES_STAIRS.get(),
            ModBlocks.MAGENTA_TILES_STAIRS.get(), ModBlocks.ORANGE_TILES_STAIRS.get(), ModBlocks.PINK_TILES_STAIRS.get(),
            ModBlocks.PURPLE_TILES_STAIRS.get(), ModBlocks.RED_TILES_STAIRS.get(), ModBlocks.WHITE_TILES_STAIRS.get(),
            ModBlocks.YELLOW_TILES_STAIRS.get()
        };

        Block[] tileSlabs = {
            ModBlocks.BLACK_TILES_SLAB.get(), ModBlocks.BLUE_TILES_SLAB.get(), ModBlocks.BROWN_TILES_SLAB.get(),
            ModBlocks.CYAN_TILES_SLAB.get(), ModBlocks.GRAY_TILES_SLAB.get(), ModBlocks.GREEN_TILES_SLAB.get(),
            ModBlocks.LIGHT_BLUE_TILES_SLAB.get(), ModBlocks.LIGHT_GRAY_TILES_SLAB.get(), ModBlocks.LIME_TILES_SLAB.get(),
            ModBlocks.MAGENTA_TILES_SLAB.get(), ModBlocks.ORANGE_TILES_SLAB.get(), ModBlocks.PINK_TILES_SLAB.get(),
            ModBlocks.PURPLE_TILES_SLAB.get(), ModBlocks.RED_TILES_SLAB.get(), ModBlocks.WHITE_TILES_SLAB.get(),
            ModBlocks.YELLOW_TILES_SLAB.get()
        };

        Block[] tileWalls = {
            ModBlocks.BLACK_TILES_WALL.get(), ModBlocks.BLUE_TILES_WALL.get(), ModBlocks.BROWN_TILES_WALL.get(),
            ModBlocks.CYAN_TILES_WALL.get(), ModBlocks.GRAY_TILES_WALL.get(), ModBlocks.GREEN_TILES_WALL.get(),
            ModBlocks.LIGHT_BLUE_TILES_WALL.get(), ModBlocks.LIGHT_GRAY_TILES_WALL.get(), ModBlocks.LIME_TILES_WALL.get(),
            ModBlocks.MAGENTA_TILES_WALL.get(), ModBlocks.ORANGE_TILES_WALL.get(), ModBlocks.PINK_TILES_WALL.get(),
            ModBlocks.PURPLE_TILES_WALL.get(), ModBlocks.RED_TILES_WALL.get(), ModBlocks.WHITE_TILES_WALL.get(),
            ModBlocks.YELLOW_TILES_WALL.get()
        };

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(tileBlocks).add(tileStairs).add(tileSlabs).add(tileWalls);
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(tileBlocks).add(tileStairs).add(tileSlabs).add(tileWalls);
        this.tag(MOD_TILES_TAG).add(tileBlocks).add(tileStairs).add(tileSlabs).add(tileWalls);

        // <colored> Add all walls to BlockTags.WALLS for vanilla compatibility
        this.tag(BlockTags.WALLS).add(
            ModBlocks.BEDROCK_WALL.get(),
            ModBlocks.BIT_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_CUT_COPPER_WALL.get(),
            ModBlocks.BIT_EXPOSED_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_EXPOSED_CUT_COPPER_WALL.get(),
            ModBlocks.BIT_WEATHERED_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_WEATHERED_CUT_COPPER_WALL.get(),
            ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_WALL.get(),
            ModBlocks.BIT_OXIDIZED_CUT_COPPER_WALL.get(),
            ModBlocks.BLACK_SANDSTONE_WALL.get(),
            ModBlocks.BLUE_SANDSTONE_WALL.get(),
            ModBlocks.GREEN_SANDSTONE_WALL.get(),
            ModBlocks.ORANGE_SANDSTONE_WALL.get(),
            ModBlocks.PINK_SANDSTONE_WALL.get(),
            ModBlocks.RED_SANDSTONE_WALL.get(),
            ModBlocks.WHITE_SANDSTONE_WALL.get(),
            ModBlocks.YELLOW_SANDSTONE_WALL.get(),
            ModBlocks.CALCITE_WALL.get(),
            ModBlocks.MOSSY_CALCITE_WALL.get(),
            ModBlocks.DRIPSTONE_BLOCK_WALL.get(),
            ModBlocks.END_STONE_WALL.get(),
            ModBlocks.QUARTZ_BLOCK_WALL.get(),
            ModBlocks.QUARTZ_BRICKS_WALL.get(),
            ModBlocks.SMOOTH_QUARTZ_WALL.get(),
            ModBlocks.POLISHED_BASALT_WALL.get(),
            ModBlocks.PRISMARINE_BRICKS_WALL.get(),
            ModBlocks.DARK_PRISMARINE_WALL.get(),
            ModBlocks.BIT_POLISHED_TUFF_WALL.get(),
            ModBlocks.BIT_TUFF_BRICKS_WALL.get()
        ).add(tileWalls);
    }
}