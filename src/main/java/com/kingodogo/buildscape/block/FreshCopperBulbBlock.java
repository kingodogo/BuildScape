package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class FreshCopperBulbBlock extends CopperBulbBlock {
    public FreshCopperBulbBlock(BlockBehaviour.Properties properties) {
        super(properties, 15); // Fresh copper emits full light
    }
}
