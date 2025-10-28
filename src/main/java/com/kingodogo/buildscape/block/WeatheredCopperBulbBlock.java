package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class WeatheredCopperBulbBlock extends CopperBulbBlock {
    public WeatheredCopperBulbBlock(BlockBehaviour.Properties properties) {
        super(properties, 8); // Weathered copper emits 8 light
    }
}
