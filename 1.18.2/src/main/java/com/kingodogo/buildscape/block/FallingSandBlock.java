package com.kingodogo.buildscape.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

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
    
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        if (dropItem != null && dropItem.isPresent()) {
            drops.add(new ItemStack(dropItem.get()));
        } else {
            // Fallback to default behavior
            return super.getDrops(state, builder);
        }
        return drops;
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
        // In 1.18.2, canBeReplaced requires a Fluid parameter or returns true for air/fluid
        return belowState.getMaterial().isReplaceable() && belowState.getFluidState().isEmpty();
    }
}
