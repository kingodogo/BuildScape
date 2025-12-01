package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WaterloggableGrateBlock extends HalfTransparentBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    
    // Use full block shape to prevent water spillage
    private static final VoxelShape SHAPE = Shapes.block();
    
    public WaterloggableGrateBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, false));
    }
    
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }
    
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        return this.defaultBlockState().setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
    }
    
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }
    
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
    
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    
    // Allow full light passage to prevent shadows and lighting issues (unless waterlogged)
    @Override
    public int getLightBlock(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(WATERLOGGED) ? 1 : 0;
    }
    
    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return !state.getValue(WATERLOGGED);
    }
    
    // Full brightness like AbstractGlassBlock for complete transparency (unless waterlogged)
    @Override
    public float getShadeBrightness(BlockState state, BlockGetter level, BlockPos pos) {
        return state.getValue(WATERLOGGED) ? 0.2F : 1.0F;
    }
    
    // Empty visual shape like AbstractGlassBlock (unless waterlogged)
    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return state.getValue(WATERLOGGED) ? SHAPE : Shapes.empty();
    }
    
    // Don't use block shape for light occlusion to prevent shadows (unless waterlogged)
    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return state.getValue(WATERLOGGED);
    }
    
    // Skip rendering faces adjacent to the same block to prevent shadows
    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        if (adjacentBlockState.is(this) && !state.getValue(WATERLOGGED) && !adjacentBlockState.getValue(WATERLOGGED)) {
            return true;
        }
        return super.skipRendering(state, adjacentBlockState, side);
    }
    
    // Prevent water from flowing out by making it not replaceable
    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return false;
    }
    
    // Ensure destroy speed is properly calculated for tool efficiency
    @Override
    public float getDestroyProgress(BlockState state, Player player, BlockGetter level, BlockPos pos) {
        float destroySpeed = state.getDestroySpeed(level, pos);
        if (destroySpeed == -1.0F) {
            return 0.0F;
        }
        
        int efficiencyLevel = net.minecraft.world.item.enchantment.EnchantmentHelper.getBlockEfficiency(player);
        ItemStack tool = player.getMainHandItem();
        
        float speedMultiplier = 1.0F;
        if (!tool.isEmpty()) {
            speedMultiplier = tool.getDestroySpeed(state);
        }
        
        if (speedMultiplier > 1.0F) {
            int efficiencyBonus = efficiencyLevel > 0 ? efficiencyLevel * efficiencyLevel + 1 : 0;
            speedMultiplier += (float)efficiencyBonus;
        }
        
        float difficultyModifier = player.hasCorrectToolForDrops(state) ? 30.0F : 100.0F;
        return speedMultiplier / destroySpeed / difficultyModifier;
    }
}

// Kingooo Finished this File on 2025-01-12