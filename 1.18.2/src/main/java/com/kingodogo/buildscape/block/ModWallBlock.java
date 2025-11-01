package com.kingodogo.buildscape.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

// [Blocksmith]: Wall block class that automatically drops the correct item
public class ModWallBlock extends WallBlock {
    private final RegistryObject<Item> dropItem;
    
    public ModWallBlock(BlockBehaviour.Properties properties, RegistryObject<Item> dropItem) {
        super(properties);
        this.dropItem = dropItem;
    }
    
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        if (dropItem != null && dropItem.isPresent()) {
            drops.add(new ItemStack(dropItem.get()));
        }
        return drops;
    }
}

