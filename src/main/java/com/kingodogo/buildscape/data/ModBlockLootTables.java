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
        this.dropSelf(ModBlocks.POLISHED_STONE_BLOCK.get());
        this.dropSelf(ModBlocks.BLACK_SAND.get());
        this.dropSelf(ModBlocks.BLUE_SAND.get());
        this.dropSelf(ModBlocks.GREEN_SAND.get());
        this.dropSelf(ModBlocks.ORANGE_SAND.get());
        this.dropSelf(ModBlocks.PINK_SAND.get());
        this.dropSelf(ModBlocks.RED_SAND.get());
        this.dropSelf(ModBlocks.WHITE_SAND.get());
        this.dropSelf(ModBlocks.YELLOW_SAND.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(block -> block.get())::iterator;
    }
}
