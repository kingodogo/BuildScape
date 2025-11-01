package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import java.util.Random;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * MossLayersBlock - Behaves exactly like SnowLayerBlock but uses moss textures
 * [Blocksmith]: Implements layer stacking, placement logic, and moss block conversion
 */
public class MossLayersBlock extends SnowLayerBlock {
    
    public MossLayersBlock(Properties properties) {
        super(properties);
    }
    
    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockState blockState = level.getBlockState(pos.below());
        if (!blockState.is(Blocks.ICE) && !blockState.is(Blocks.PACKED_ICE) && !blockState.is(Blocks.BARRIER)) {
            if (!blockState.is(Blocks.HONEY_BLOCK) && !blockState.is(Blocks.SOUL_SAND)) {
                return Block.isFaceFull(blockState.getCollisionShape(level, pos.below()), Direction.UP) || 
                       blockState.is(this) && blockState.getValue(LAYERS) == 8;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        int i = state.getValue(LAYERS);
        if (context.getItemInHand().is(this.asItem()) && i < 8) {
            if (context.replacingClickedOnBlock()) {
                return context.getClickedFace() == Direction.UP;
            } else {
                return true;
            }
        } else {
            return i == 1;
        }
    }
    
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockState = context.getLevel().getBlockState(context.getClickedPos());
        if (blockState.is(this)) {
            int i = blockState.getValue(LAYERS);
            return blockState.setValue(LAYERS, Math.min(8, i + 1));
        } else {
            return super.getStateForPlacement(context);
        }
    }
    
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        // [Blocksmith]: Convert to full moss block when max layers reached
        if (state.getValue(LAYERS) == 8) {
            level.setBlock(pos, Blocks.MOSS_BLOCK.defaultBlockState(), 3);
        } else {
            // [Blocksmith]: Add moss particles when breaking moss layers
            for (int i = 0; i < 6; i++) {
                level.addParticle(ParticleTypes.MYCELIUM, 
                    (double)pos.getX() + level.getRandom().nextDouble(), 
                    (double)pos.getY() + level.getRandom().nextDouble(), 
                    (double)pos.getZ() + level.getRandom().nextDouble(), 
                    0.0D, 0.0D, 0.0D);
            }
        }
        super.playerWillDestroy(level, pos, state, player);
    }
    
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        // [Blocksmith]: Convert to full moss block when max layers reached
        if (state.getValue(LAYERS) == 8) {
            level.setBlock(pos, Blocks.MOSS_BLOCK.defaultBlockState(), 3);
        }
        super.randomTick(state, level, pos, random);
    }
    
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        // [Blocksmith]: Use moss particles instead of snow particles
        if (random.nextInt(10) == 0) {
            level.addParticle(ParticleTypes.MYCELIUM, 
                (double)pos.getX() + random.nextDouble(), 
                (double)pos.getY() + random.nextDouble(), 
                (double)pos.getZ() + random.nextDouble(), 
                0.0D, 0.0D, 0.0D);
        }
    }
    
    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        // [Blocksmith]: Use moss particles for breaking instead of snow
        if (!state.is(newState.getBlock())) {
            // Add multiple particles for better effect
            for (int i = 0; i < 8; i++) {
                level.addParticle(ParticleTypes.MYCELIUM, 
                    (double)pos.getX() + level.getRandom().nextDouble(), 
                    (double)pos.getY() + level.getRandom().nextDouble(), 
                    (double)pos.getZ() + level.getRandom().nextDouble(), 
                    0.0D, 0.0D, 0.0D);
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }
    
    @Override
    public void wasExploded(Level level, BlockPos pos, Explosion explosion) {
        // [Blocksmith]: Use moss particles for explosion instead of snow
        for (int i = 0; i < 10; i++) {
            level.addParticle(ParticleTypes.MYCELIUM, 
                (double)pos.getX() + level.getRandom().nextDouble(), 
                (double)pos.getY() + level.getRandom().nextDouble(), 
                (double)pos.getZ() + level.getRandom().nextDouble(), 
                0.0D, 0.0D, 0.0D);
        }
        super.wasExploded(level, pos, explosion);
    }
    
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getCollisionShape(state, level, pos, context);
    }
    
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        int i = state.getValue(LAYERS);
        if (i == 8) {
            return Shapes.block();
        } else {
            return Shapes.box(0.0, 0.0, 0.0, 1.0, (double)(i * 2) / 16.0, 1.0);
        }
    }
    
    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getCollisionShape(state, level, pos, context);
    }
    
    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }
    
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        if (type == PathComputationType.LAND) {
            return state.getValue(LAYERS) < 5;
        }
        return false;
    }
}
