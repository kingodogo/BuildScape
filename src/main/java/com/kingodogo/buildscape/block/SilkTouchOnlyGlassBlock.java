package com.kingodogo.buildscape.block;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;

import java.util.List;

public class SilkTouchOnlyGlassBlock extends TransparentBlock {
    public SilkTouchOnlyGlassBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        ItemStack tool = builder.getOptionalParameter(LootContextParams.TOOL);
        if (tool == null) {
            return List.of(); // No tool = no drop
        }

        // Check for Silk Touch enchantment
        Holder<Enchantment> silkTouch = builder.getLevel().registryAccess()
            .registryOrThrow(Registries.ENCHANTMENT)
            .getHolderOrThrow(Enchantments.SILK_TOUCH);
        
        if (EnchantmentHelper.getItemEnchantmentLevel(silkTouch, tool) > 0) {
            // Has Silk Touch, use loot table
            return super.getDrops(state, builder);
        }
        
        // No Silk Touch = no drop
        return List.of();
    }
}

