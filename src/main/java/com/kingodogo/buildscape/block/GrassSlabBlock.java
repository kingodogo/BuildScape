package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

// <item> Grass slab block that uses biome coloring (handled via block color provider registration)
public class GrassSlabBlock extends SlabBlock {

    public GrassSlabBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
}