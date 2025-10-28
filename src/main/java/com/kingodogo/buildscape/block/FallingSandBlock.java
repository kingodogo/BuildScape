package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class FallingSandBlock extends Block {
    
    public FallingSandBlock(BlockBehaviour.Properties properties) {
        super(properties);
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

    private void checkAndStartFalling(Level level, BlockPos pos) {
        if (isFree(level, pos) && !level.isClientSide) {
            FallingBlockEntity fallingblockentity = FallingBlockEntity.fall(level, pos, level.getBlockState(pos));
            level.addFreshEntity(fallingblockentity);
        }
    }

    protected boolean isFree(Level level, BlockPos pos) {
        BlockPos below = pos.below();
        BlockState belowState = level.getBlockState(below);
        return belowState.canBeReplaced() && belowState.getFluidState().isEmpty();
    }
}
