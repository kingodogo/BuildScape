package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class ExposedCopperBulbBlock extends CopperBulbBlock {
    public ExposedCopperBulbBlock(BlockBehaviour.Properties properties) {
        super(properties, 12); // Exposed copper emits 12 light
    }
}
