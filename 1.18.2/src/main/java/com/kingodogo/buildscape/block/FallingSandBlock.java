package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

public class FallingSandBlock extends Block {
    
    private final RegistryObject<Item> dropItem;
    
    public FallingSandBlock(Properties properties, RegistryObject<Item> dropItem) {
        super(properties);
        this.dropItem = dropItem;
    }
    
    // Legacy constructor for compatibility
    public FallingSandBlock(Properties properties) {
        super(properties);
        this.dropItem = null;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);
        checkAndStartFalling(level, pos);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean movedByPiston) {
        super.neighborChanged(state, level, pos, neighborBlock, neighborPos, movedByPiston);
        checkAndStartFalling(level, pos);
    }
    
    // Drops are handled via loot tables (ModBlockLootTableRegistry)
    // Removed getDrops() override to allow loot tables to work properly

    private void checkAndStartFalling(Level level, BlockPos pos) {
        if (isFree(level, pos) && !level.isClientSide) {
            FallingBlockEntity fallingblockentity = FallingBlockEntity.fall(level, pos, level.getBlockState(pos));
            level.addFreshEntity(fallingblockentity);
        }
    }

    protected boolean isFree(Level level, BlockPos pos) {
        BlockPos below = pos.below();
        BlockState belowState = level.getBlockState(below);
        // In 1.18.2, canBeReplaced requires a Fluid parameter or returns true for air/fluid
        return belowState.getMaterial().isReplaceable() && belowState.getFluidState().isEmpty();
    }
}
