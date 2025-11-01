package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class GrassSlabBlock extends SlabBlock {
    
    public GrassSlabBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
    
    // Grass slabs will use biome color - this is handled via block color provider registration
    // The block itself just needs to exist, the client-side color registration handles the tinting
}

