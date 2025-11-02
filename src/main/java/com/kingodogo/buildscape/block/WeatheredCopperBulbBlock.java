package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

// <item> Weathered copper bulb that emits reduced light (level 8)
public class WeatheredCopperBulbBlock extends CopperBulbBlock {
    public WeatheredCopperBulbBlock(BlockBehaviour.Properties properties) {
        super(properties, 8);
    }
}