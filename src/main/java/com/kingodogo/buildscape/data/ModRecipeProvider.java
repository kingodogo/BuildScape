package com.kingodogo.buildscape.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

// <item> Recipe provider for generating mod recipes (currently unused, recipes are in JSON files)
public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(net.minecraft.data.recipes.RecipeOutput pRecipeOutput) {
        // <item> Recipes are defined in JSON files under data/buildscape/recipes/
    }
}