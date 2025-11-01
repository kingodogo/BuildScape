package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

// [Blocksmith]: Base block class for custom blocks
// Blocks drop items via loot tables - Minecraft automatically uses loot tables
// when getDrops() is not overridden. Loot tables are provided via JSON files
// and ModBlockLootTableRegistry handles runtime replacement if needed.
public class ModBlock extends Block {
    @SuppressWarnings("unused")
    private final RegistryObject<?> dropItem; // Kept for constructor compatibility
    
    public ModBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.dropItem = null;
    }
    
    public ModBlock(BlockBehaviour.Properties properties, RegistryObject<?> dropItem) {
        super(properties);
        this.dropItem = dropItem;
    }
    
    // Don't override getDrops() - let Minecraft use loot tables automatically
}

