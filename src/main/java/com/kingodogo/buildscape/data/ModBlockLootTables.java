package com.kingodogo.buildscape.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import com.kingodogo.buildscape.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected void generate() {
        // Sand blocks
        this.dropSelf(ModBlocks.BLACK_SAND.get());
        this.dropSelf(ModBlocks.BLUE_SAND.get());
        this.dropSelf(ModBlocks.GREEN_SAND.get());
        this.dropSelf(ModBlocks.ORANGE_SAND.get());
        this.dropSelf(ModBlocks.PINK_SAND.get());
        this.dropSelf(ModBlocks.RED_SAND.get());
        this.dropSelf(ModBlocks.WHITE_SAND.get());
        this.dropSelf(ModBlocks.YELLOW_SAND.get());
        
        // Sandstone blocks (all variants)
        this.dropSelf(ModBlocks.BLACK_SANDSTONE.get());
        this.dropSelf(ModBlocks.BLUE_SANDSTONE.get());
        this.dropSelf(ModBlocks.GREEN_SANDSTONE.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE.get());
        this.dropSelf(ModBlocks.YELLOW_SANDSTONE.get());
        
        // Smooth sandstone blocks
        this.dropSelf(ModBlocks.BLACK_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.BLUE_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.GREEN_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.ORANGE_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.PINK_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.RED_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.WHITE_SMOOTH_SANDSTONE.get());
        this.dropSelf(ModBlocks.YELLOW_SMOOTH_SANDSTONE.get());
        
        // Sandstone stairs, slabs, walls
        this.dropSelf(ModBlocks.BLACK_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_SANDSTONE_STAIRS.get());
        
        this.dropSelf(ModBlocks.BLACK_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_SANDSTONE_SLAB.get());
        
        this.dropSelf(ModBlocks.BLACK_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.BLUE_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.GREEN_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.PINK_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.RED_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.WHITE_SANDSTONE_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_SANDSTONE_WALL.get());
        
        // Smooth sandstone stairs and slabs
        this.dropSelf(ModBlocks.BLACK_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.RED_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_SMOOTH_SANDSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_SMOOTH_SANDSTONE_STAIRS.get());
        
        this.dropSelf(ModBlocks.BLACK_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.RED_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_SMOOTH_SANDSTONE_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_SMOOTH_SANDSTONE_SLAB.get());
        
        // Tile blocks (copper properties)
        this.dropSelf(ModBlocks.BLACK_TILES.get());
        this.dropSelf(ModBlocks.BLUE_TILES.get());
        this.dropSelf(ModBlocks.BROWN_TILES.get());
        this.dropSelf(ModBlocks.CYAN_TILES.get());
        this.dropSelf(ModBlocks.GRAY_TILES.get());
        this.dropSelf(ModBlocks.GREEN_TILES.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TILES.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TILES.get());
        this.dropSelf(ModBlocks.LIME_TILES.get());
        this.dropSelf(ModBlocks.MAGENTA_TILES.get());
        this.dropSelf(ModBlocks.ORANGE_TILES.get());
        this.dropSelf(ModBlocks.PINK_TILES.get());
        this.dropSelf(ModBlocks.PURPLE_TILES.get());
        this.dropSelf(ModBlocks.RED_TILES.get());
        this.dropSelf(ModBlocks.WHITE_TILES.get());
        this.dropSelf(ModBlocks.YELLOW_TILES.get());
        
        // Tile stairs, slabs, walls
        this.dropSelf(ModBlocks.BLACK_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.RED_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_TILES_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_TILES_STAIRS.get());
        
        this.dropSelf(ModBlocks.BLACK_TILES_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_TILES_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_TILES_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_TILES_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_TILES_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_TILES_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TILES_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TILES_SLAB.get());
        this.dropSelf(ModBlocks.LIME_TILES_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_TILES_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_TILES_SLAB.get());
        this.dropSelf(ModBlocks.PINK_TILES_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_TILES_SLAB.get());
        this.dropSelf(ModBlocks.RED_TILES_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_TILES_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_TILES_SLAB.get());
        
        this.dropSelf(ModBlocks.BLACK_TILES_WALL.get());
        this.dropSelf(ModBlocks.BLUE_TILES_WALL.get());
        this.dropSelf(ModBlocks.BROWN_TILES_WALL.get());
        this.dropSelf(ModBlocks.CYAN_TILES_WALL.get());
        this.dropSelf(ModBlocks.GRAY_TILES_WALL.get());
        this.dropSelf(ModBlocks.GREEN_TILES_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TILES_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TILES_WALL.get());
        this.dropSelf(ModBlocks.LIME_TILES_WALL.get());
        this.dropSelf(ModBlocks.MAGENTA_TILES_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_TILES_WALL.get());
        this.dropSelf(ModBlocks.PINK_TILES_WALL.get());
        this.dropSelf(ModBlocks.PURPLE_TILES_WALL.get());
        this.dropSelf(ModBlocks.RED_TILES_WALL.get());
        this.dropSelf(ModBlocks.WHITE_TILES_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_TILES_WALL.get());
        
        // Glass blocks (require silk touch to drop themselves, otherwise drop nothing)
        this.add(ModBlocks.BLACK_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.BLACK_MOSAIC_GLASS.get(), ModBlocks.BLACK_MOSAIC_GLASS.get()));
        this.add(ModBlocks.BLUE_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.BLUE_MOSAIC_GLASS.get(), ModBlocks.BLUE_MOSAIC_GLASS.get()));
        this.add(ModBlocks.BROWN_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.BROWN_MOSAIC_GLASS.get(), ModBlocks.BROWN_MOSAIC_GLASS.get()));
        this.add(ModBlocks.CYAN_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.CYAN_MOSAIC_GLASS.get(), ModBlocks.CYAN_MOSAIC_GLASS.get()));
        this.add(ModBlocks.GRAY_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.GRAY_MOSAIC_GLASS.get(), ModBlocks.GRAY_MOSAIC_GLASS.get()));
        this.add(ModBlocks.GREEN_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.GREEN_MOSAIC_GLASS.get(), ModBlocks.GREEN_MOSAIC_GLASS.get()));
        this.add(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get(), ModBlocks.LIGHT_BLUE_MOSAIC_GLASS.get()));
        this.add(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get(), ModBlocks.LIGHT_GRAY_MOSAIC_GLASS.get()));
        this.add(ModBlocks.LIME_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.LIME_MOSAIC_GLASS.get(), ModBlocks.LIME_MOSAIC_GLASS.get()));
        this.add(ModBlocks.MAGENTA_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.MAGENTA_MOSAIC_GLASS.get(), ModBlocks.MAGENTA_MOSAIC_GLASS.get()));
        this.add(ModBlocks.ORANGE_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.ORANGE_MOSAIC_GLASS.get(), ModBlocks.ORANGE_MOSAIC_GLASS.get()));
        this.add(ModBlocks.PINK_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.PINK_MOSAIC_GLASS.get(), ModBlocks.PINK_MOSAIC_GLASS.get()));
        this.add(ModBlocks.PURPLE_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.PURPLE_MOSAIC_GLASS.get(), ModBlocks.PURPLE_MOSAIC_GLASS.get()));
        this.add(ModBlocks.RED_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.RED_MOSAIC_GLASS.get(), ModBlocks.RED_MOSAIC_GLASS.get()));
        this.add(ModBlocks.WHITE_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.WHITE_MOSAIC_GLASS.get(), ModBlocks.WHITE_MOSAIC_GLASS.get()));
        this.add(ModBlocks.YELLOW_MOSAIC_GLASS.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.YELLOW_MOSAIC_GLASS.get(), ModBlocks.YELLOW_MOSAIC_GLASS.get()));
        
        // Glass panes (require silk touch to drop themselves, otherwise drop nothing)
        this.add(ModBlocks.BLACK_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.BLACK_MOSAIC_GLASS_PANE.get(), ModBlocks.BLACK_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.BLUE_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.BLUE_MOSAIC_GLASS_PANE.get(), ModBlocks.BLUE_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.BROWN_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.BROWN_MOSAIC_GLASS_PANE.get(), ModBlocks.BROWN_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.CYAN_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.CYAN_MOSAIC_GLASS_PANE.get(), ModBlocks.CYAN_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.GRAY_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.GRAY_MOSAIC_GLASS_PANE.get(), ModBlocks.GRAY_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.GREEN_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.GREEN_MOSAIC_GLASS_PANE.get(), ModBlocks.GREEN_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get(), ModBlocks.LIGHT_BLUE_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get(), ModBlocks.LIGHT_GRAY_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.LIME_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.LIME_MOSAIC_GLASS_PANE.get(), ModBlocks.LIME_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get(), ModBlocks.MAGENTA_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get(), ModBlocks.ORANGE_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.PINK_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.PINK_MOSAIC_GLASS_PANE.get(), ModBlocks.PINK_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get(), ModBlocks.PURPLE_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.RED_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.RED_MOSAIC_GLASS_PANE.get(), ModBlocks.RED_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.WHITE_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.WHITE_MOSAIC_GLASS_PANE.get(), ModBlocks.WHITE_MOSAIC_GLASS_PANE.get()));
        this.add(ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get(), this.createSingleItemTableWithSilkTouch(ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get(), ModBlocks.YELLOW_MOSAIC_GLASS_PANE.get()));
        
        // Copper blocks (all variants)
        this.dropSelf(ModBlocks.BIT_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.BIT_COPPER_BLOCK.get());
        this.dropSelf(ModBlocks.BIT_COPPER_BULB.get());
        this.dropSelf(ModBlocks.BIT_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.BIT_CUT_COPPER.get());
        
        this.dropSelf(ModBlocks.BIT_EXPOSED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_COPPER_BLOCK.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_CUT_COPPER.get());
        
        this.dropSelf(ModBlocks.BIT_WEATHERED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_COPPER_BLOCK.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_CUT_COPPER.get());
        
        this.dropSelf(ModBlocks.BIT_OXIDIZED_CHISELED_COPPER.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_COPPER_BULB.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_COPPER_GRATE.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_CUT_COPPER.get());
        
        // Copper stairs, slabs, walls
        this.dropSelf(ModBlocks.BIT_COPPER_BLOCK_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_COPPER_BLOCK_SLAB.get());
        this.dropSelf(ModBlocks.BIT_COPPER_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_SLAB.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_COPPER_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_SLAB.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_COPPER_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_SLAB.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_COPPER_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.BIT_CUT_COPPER_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_CUT_COPPER_SLAB.get());
        this.dropSelf(ModBlocks.BIT_CUT_COPPER_WALL.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_CUT_COPPER_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_CUT_COPPER_SLAB.get());
        this.dropSelf(ModBlocks.BIT_EXPOSED_CUT_COPPER_WALL.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_CUT_COPPER_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_CUT_COPPER_SLAB.get());
        this.dropSelf(ModBlocks.BIT_WEATHERED_CUT_COPPER_WALL.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_CUT_COPPER_STAIRS.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_CUT_COPPER_SLAB.get());
        this.dropSelf(ModBlocks.BIT_OXIDIZED_CUT_COPPER_WALL.get());
        
        // Tuff blocks
        this.dropSelf(ModBlocks.BIT_CHISELED_TUFF.get());
        this.dropSelf(ModBlocks.BIT_CHISELED_TUFF_BRICKS.get());
        this.dropSelf(ModBlocks.BIT_POLISHED_TUFF.get());
        this.dropSelf(ModBlocks.BIT_TUFF_BRICKS.get());
        
        // Other blocks
        this.dropSelf(ModBlocks.POLISHED_STONE_BLOCK.get());
        // this.dropSelf(ModBlocks.GRASS_BLOCK_SLAB.get());
        this.dropSelf(ModBlocks.PODZOL_SLAB.get());
        this.dropSelf(ModBlocks.DIRT_SLAB.get());
        this.dropSelf(ModBlocks.MUD_SLAB.get());
        this.dropSelf(ModBlocks.MYCELIUM_SLAB.get());
        this.dropSelf(ModBlocks.MOSSY_CALCITE.get());
        this.dropSelf(ModBlocks.MOSSY_CALCITE_STAIRS.get());
        this.dropSelf(ModBlocks.MOSSY_CALCITE_SLAB.get());
        this.dropSelf(ModBlocks.MOSSY_CALCITE_WALL.get());
        
        // Vanilla block variants
        this.dropSelf(ModBlocks.POLISHED_BASALT_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_BASALT_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_BASALT_WALL.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_STAIRS.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_SLAB.get());
        this.dropSelf(ModBlocks.DRIPSTONE_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.END_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.END_STONE_SLAB.get());
        this.dropSelf(ModBlocks.END_STONE_WALL.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_SLAB.get());
        this.dropSelf(ModBlocks.QUARTZ_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CALCITE_STAIRS.get());
        this.dropSelf(ModBlocks.CALCITE_SLAB.get());
        this.dropSelf(ModBlocks.CALCITE_WALL.get());
        this.dropSelf(ModBlocks.BEDROCK_STAIRS.get());
        this.dropSelf(ModBlocks.BEDROCK_SLAB.get());
        this.dropSelf(ModBlocks.BEDROCK_WALL.get());
        this.dropSelf(ModBlocks.PRISMARINE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.DARK_PRISMARINE_WALL.get());
        this.dropSelf(ModBlocks.QUARTZ_BLOCK_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_QUARTZ_WALL.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_STAIRS.get());
        this.dropSelf(ModBlocks.SMOOTH_BASALT_SLAB.get());
        // MOSS_BLOCK_SLAB uses custom loot table JSON for double slab drops
        this.dropSelf(ModBlocks.AMETHYST_BLOCK_SLAB.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(block -> block.get())::iterator;
    }
}
