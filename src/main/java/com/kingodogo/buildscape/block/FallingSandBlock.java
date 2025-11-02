package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

// <item> Block that falls when placed without solid support below it (similar to vanilla sand/gravel)
public class FallingSandBlock extends Block {

    public FallingSandBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    // <item> Check if block should fall when placed
    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);
        checkAndStartFalling(level, pos);
    }

    // <item> Check if block should fall when neighboring blocks change
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean movedByPiston) {
        super.neighborChanged(state, level, pos, neighborBlock, neighborPos, movedByPiston);
        checkAndStartFalling(level, pos);
    }

    // <item> Creates falling block entity if block is unsupported
    private void checkAndStartFalling(Level level, BlockPos pos) {
        if (isFree(level, pos) && !level.isClientSide) {
            FallingBlockEntity fallingblockentity = FallingBlockEntity.fall(level, pos, level.getBlockState(pos));
            level.addFreshEntity(fallingblockentity);
        }
    }

    // <item> Checks if the space below the block is free for falling
    protected boolean isFree(Level level, BlockPos pos) {
        BlockPos below = pos.below();
        BlockState belowState = level.getBlockState(below);
        return belowState.canBeReplaced() && belowState.getFluidState().isEmpty();
    }
}