package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

// [Blocksmith]: Wall block class for custom walls
// Walls drop items via loot tables (handled by ModBlockLootTableRegistry)
public class ModWallBlock extends WallBlock {
    @SuppressWarnings("unused")
    private final RegistryObject<?> dropItem; // Kept for constructor compatibility
    
    public ModWallBlock(BlockBehaviour.Properties properties, RegistryObject<?> dropItem) {
        super(properties);
        this.dropItem = dropItem;
    }
}

