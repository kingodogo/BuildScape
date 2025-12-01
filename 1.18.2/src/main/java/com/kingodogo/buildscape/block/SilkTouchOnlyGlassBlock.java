package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

// Mosaic glass block - drops are handled via JSON loot tables
// The JSON loot tables include silk touch conditions, so no custom getDrops() override is needed
// Extends AbstractGlassBlock for full transparency (no shadows, full light passage)
public class SilkTouchOnlyGlassBlock extends AbstractGlassBlock {
    public SilkTouchOnlyGlassBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
    
    // Drops are handled entirely by JSON loot tables
    // The loot table JSON already includes silk touch conditions
    
    // AbstractGlassBlock already provides:
    // - getVisualShape() returns Shapes.empty()
    // - getShadeBrightness() returns 1.0F (full brightness)
    // - propagatesSkylightDown() returns true
    // - getLightBlock() returns 0 (inherited from HalfTransparentBlock)
    
    // Additional overrides for complete transparency
    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return false;
    }
    
    // Skip rendering faces adjacent to the same block to prevent shadows
    @Override
    public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
        return adjacentBlockState.is(this) || super.skipRendering(state, adjacentBlockState, side);
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
