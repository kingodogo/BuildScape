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

// <item> Glass block that only drops when broken with Silk Touch enchantment
public class SilkTouchOnlyGlassBlock extends TransparentBlock {
    public SilkTouchOnlyGlassBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    // <item> Returns drops only if tool has Silk Touch enchantment
    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        ItemStack tool = builder.getOptionalParameter(LootContextParams.TOOL);
        if (tool == null) {
            return List.of();
        }

        // <item> Check for Silk Touch enchantment
        Holder<Enchantment> silkTouch = builder.getLevel().registryAccess()
            .registryOrThrow(Registries.ENCHANTMENT)
            .getHolderOrThrow(Enchantments.SILK_TOUCH);

        if (EnchantmentHelper.getItemEnchantmentLevel(silkTouch, tool) > 0) {
            return super.getDrops(state, builder);
        }

        return List.of();
    }
}