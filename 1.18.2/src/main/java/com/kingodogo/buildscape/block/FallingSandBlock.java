package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
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
        if (!level.isClientSide && level instanceof net.minecraft.server.level.ServerLevel) {
            ((net.minecraft.server.level.ServerLevel)level).scheduleTick(pos, this, this.getDelayAfterPlace());
        }
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos neighborPos, boolean movedByPiston) {
        // Use scheduled tick instead of immediate check to prevent cascade updates on neighbors (like walls)
        // This defers the falling check and prevents unnecessary block state updates
        if (!level.isClientSide && level instanceof net.minecraft.server.level.ServerLevel) {
            ((net.minecraft.server.level.ServerLevel)level).scheduleTick(pos, this, this.getDelayAfterPlace());
        }
    }
    
    @Override
    public void tick(BlockState state, net.minecraft.server.level.ServerLevel level, BlockPos pos, java.util.Random random) {
        if (isFree(level, pos)) {
            FallingBlockEntity.fall(level, pos, state);
        }
    }
    
    // Drops are handled via JSON loot tables

    protected int getDelayAfterPlace() {
        return 2;
    }

    protected boolean isFree(Level level, BlockPos pos) {
        BlockPos below = pos.below();
        BlockState belowState = level.getBlockState(below);
        // In 1.18.2, canBeReplaced requires a Fluid parameter or returns true for air/fluid
        return belowState.getMaterial().isReplaceable() && belowState.getFluidState().isEmpty();
    }
    
    // Ensure destroy speed is properly calculated for tool efficiency
    @Override
    public float getDestroyProgress(BlockState state, Player player, net.minecraft.world.level.BlockGetter level, BlockPos pos) {
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
