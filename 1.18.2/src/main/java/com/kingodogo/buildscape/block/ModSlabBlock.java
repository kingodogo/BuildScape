package com.kingodogo.buildscape.block;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

// [Blocksmith]: Slab block class for custom slabs
// Slabs drop items via loot tables (handled by ModBlockLootTableRegistry)
public class ModSlabBlock extends SlabBlock {
    @SuppressWarnings("unused")
    private final RegistryObject<?> dropItem; // Kept for constructor compatibility
    
    public ModSlabBlock(BlockBehaviour.Properties properties, RegistryObject<?> dropItem) {
        super(properties);
        this.dropItem = dropItem;
    }
}

