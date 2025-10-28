package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

public class OxidizedCopperBulbBlock extends CopperBulbBlock {
    public OxidizedCopperBulbBlock(BlockBehaviour.Properties properties) {
        super(properties, 4); // Oxidized copper emits 4 light
    }
}
