package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

// [Blocksmith]: Stair block class for custom stairs
// Stairs drop items via loot tables - Minecraft automatically uses loot tables
// when getDrops() is not overridden. Loot tables are provided via JSON files
// and ModBlockLootTableRegistry handles runtime replacement if needed.
public class ModStairBlock extends StairBlock {
    @SuppressWarnings("unused")
    private final RegistryObject<?> dropItem; // Kept for constructor compatibility
    
    public ModStairBlock(BlockState baseState, BlockBehaviour.Properties properties) {
        super(baseState, properties);
        this.dropItem = null;
    }
    
    public ModStairBlock(BlockState baseState, BlockBehaviour.Properties properties, RegistryObject<?> dropItem) {
        super(baseState, properties);
        this.dropItem = dropItem;
    }
    
    // Don't override getDrops() - let Minecraft use loot tables automatically
}

