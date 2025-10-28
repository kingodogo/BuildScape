package com.kingodogo.buildscape.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import com.kingodogo.buildscape.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.POLISHED_STONE_ITEM.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.STONE)
                .unlockedBy("has_stone", has(Items.STONE))
                .save(pRecipeOutput);
    }
}
