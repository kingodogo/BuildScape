package com.kingodogo.buildscape.block;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;

import java.util.List;

public class SilkTouchOnlyGlassBlock extends HalfTransparentBlock {
    public SilkTouchOnlyGlassBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    // [Blocksmith]: Override getDrops to require Silk Touch for mosaic glass blocks
    // In 1.18.2, we need to properly access the loot table from the block state
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        ItemStack tool = builder.getOptionalParameter(LootContextParams.TOOL);
        if (tool == null) {
            return List.of(); // No tool = no drop
        }

        // Check for Silk Touch enchantment
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, tool) > 0) {
            // Has Silk Touch, use loot table
            // Get the loot table from the block's registry name
            if (builder.getLevel() instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel) builder.getLevel();
                LootTable lootTable = serverLevel.getServer().getLootTables().get(state.getBlock().getLootTable());
                if (lootTable != LootTable.EMPTY) {
                    // Add required BLOCK_STATE parameter before creating context
                    return lootTable.getRandomItems(builder.withParameter(LootContextParams.BLOCK_STATE, state)
                        .create(net.minecraft.world.level.storage.loot.parameters.LootContextParamSets.BLOCK));
                }
            }
            // Fallback to parent implementation if loot table not found
            return super.getDrops(state, builder);
        }
        
        // No Silk Touch = no drop
        return List.of();
    }
}

