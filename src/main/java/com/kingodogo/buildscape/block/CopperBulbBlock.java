package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

public abstract class CopperBulbBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.create("lit");
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");
    private final int lightLevel;
    
    public CopperBulbBlock(BlockBehaviour.Properties properties, int lightLevel) {
        super(properties);
        this.lightLevel = lightLevel;
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, false).setValue(POWERED, false));
    }
    
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT, POWERED);
    }
    
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(LIT, false).setValue(POWERED, false);
    }
    
    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(LIT) ? lightLevel : 0;
    }
    
    @Override
    public boolean isSignalSource(BlockState state) {
        return false;
    }
    
    @Override
    public int getSignal(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 0;
    }
    
    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return false;
    }
    
    @Override
    public void neighborChanged(BlockState state, net.minecraft.world.level.Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            boolean powered = level.hasNeighborSignal(pos);
            boolean wasPowered = state.getValue(POWERED);
            boolean currentlyLit = state.getValue(LIT);
            
            // Only toggle on rising edge (power goes from off to on)
            if (powered && !wasPowered) {
                // Toggle the lit state and update powered state in one call
                boolean newLitState = !currentlyLit;
                level.setBlock(pos, state.setValue(LIT, newLitState).setValue(POWERED, true), 2);
                
                // Play sound when the bulb state changes (both on and off)
                // Use the vanilla copper bulb sound events
                if (newLitState) {
                    level.playSound(null, pos, SoundEvents.COPPER_BULB_TURN_ON, SoundSource.BLOCKS, 0.3f, 1.0f);
                } else {
                    level.playSound(null, pos, SoundEvents.COPPER_BULB_TURN_OFF, SoundSource.BLOCKS, 0.3f, 1.0f);
                }
            } else if (!powered && wasPowered) {
                // Update powered state when power is removed
                level.setBlock(pos, state.setValue(POWERED, false), 2);
            }
        }
    }
    
    @Override
    public void onPlace(BlockState state, net.minecraft.world.level.Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!level.isClientSide) {
            boolean powered = level.hasNeighborSignal(pos);
            level.setBlock(pos, state.setValue(POWERED, powered), 2);
        }
    }
    
    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }
    
    @Override
    public int getAnalogOutputSignal(BlockState state, net.minecraft.world.level.Level level, BlockPos pos) {
        return state.getValue(LIT) ? 15 : 0;
    }
}
