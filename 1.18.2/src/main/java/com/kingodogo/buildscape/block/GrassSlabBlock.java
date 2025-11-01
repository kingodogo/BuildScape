package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.SlabBlock;

public class GrassSlabBlock extends SlabBlock {
    
    public GrassSlabBlock(Properties properties) {
        super(properties);
    }
    
    // Grass slabs will use biome color - this is handled via block color provider registration
    // The block itself just needs to exist, the client-side color registration handles the tinting
}

