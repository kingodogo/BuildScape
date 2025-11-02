package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

// <item> Exposed copper bulb that emits reduced light (level 12)
public class ExposedCopperBulbBlock extends CopperBulbBlock {
    public ExposedCopperBulbBlock(BlockBehaviour.Properties properties) {
        super(properties, 12);
    }
}