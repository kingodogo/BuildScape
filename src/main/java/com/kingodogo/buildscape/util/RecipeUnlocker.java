package com.kingodogo.buildscape.util;

import com.kingodogo.buildscape.BuildScape;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.*;

// <item> Automatically unlocks recipes when players obtain ingredients
// This system scans all recipes and unlocks them when players pick up any ingredient used in those recipes
// Works alongside advancement JSON files to ensure comprehensive recipe unlocking
@Mod.EventBusSubscriber(modid = BuildScape.MODID)
public class RecipeUnlocker {
    // <item> Map of items to recipes that use them as ingredients
    private static final Map<Item, List<ResourceLocation>> ITEM_TO_RECIPES_MAP = new HashMap<>();
    private static boolean initialized = false;

    // <item> Initialize the recipe unlock mappings by scanning all recipes
    // This builds a map of ingredients -> recipes that use them
    private static void initialize(Level level) {
        if (initialized) return;
        initialized = true;

        RecipeManager recipeManager = level.getRecipeManager();

        // <item> Scan all recipes from our mod
        for (RecipeHolder<?> recipeHolder : recipeManager.getRecipes()) {
            ResourceLocation recipeId = recipeHolder.id();

            // <item> Only process recipes from our mod
            if (!recipeId.getNamespace().equals(BuildScape.MODID)) {
                continue;
            }

            Recipe<?> recipe = recipeHolder.value();

            // <item> Extract ingredients from the recipe
            Set<Item> ingredients = extractIngredients(recipe);

            // <item> Map each ingredient to this recipe
            for (Item ingredient : ingredients) {
                ITEM_TO_RECIPES_MAP.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipeId);
            }
        }

        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(BuildScape.class);
        logger.info("[RecipeUnlocker] Initialized recipe unlock mappings for {} items with {} total recipes",
            ITEM_TO_RECIPES_MAP.size(), recipeManager.getRecipes().size());
    }

    // <item> Extract all items used as ingredients in a recipe
    private static Set<Item> extractIngredients(Recipe<?> recipe) {
        Set<Item> ingredients = new HashSet<>();

        if (recipe instanceof ShapedRecipe shapedRecipe) {
            // <item> Extract ingredients from shaped recipe
            for (Ingredient ingredient : shapedRecipe.getIngredients()) {
                for (ItemStack stack : ingredient.getItems()) {
                    if (!stack.isEmpty()) {
                        ingredients.add(stack.getItem());
                    }
                }
            }
        } else if (recipe instanceof ShapelessRecipe shapelessRecipe) {
            // <item> Extract ingredients from shapeless recipe
            for (Ingredient ingredient : shapelessRecipe.getIngredients()) {
                for (ItemStack stack : ingredient.getItems()) {
                    if (!stack.isEmpty()) {
                        ingredients.add(stack.getItem());
                    }
                }
            }
        } else if (recipe instanceof SingleItemRecipe singleItemRecipe) {
            // <item> Extract ingredient from single item recipe (stonecutting, etc.)
            net.minecraft.core.NonNullList<Ingredient> ingredientsList = singleItemRecipe.getIngredients();
            if (!ingredientsList.isEmpty()) {
                Ingredient ingredient = ingredientsList.get(0);
                for (ItemStack stack : ingredient.getItems()) {
                    if (!stack.isEmpty()) {
                        ingredients.add(stack.getItem());
                    }
                }
            }
        }

        return ingredients;
    }

    // <item> Unlock recipes when player logs in
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        Level level = player.level();
        if (level == null) return;

        initialize(level);

        // <item> Unlock recipes for items the player already has
        unlockRecipesForPlayer(player, level);
    }

    // <item> Unlock recipes when player picks up an item
    @SubscribeEvent
    public static void onItemPickup(PlayerEvent.ItemPickupEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        Level level = player.level();
        if (level == null) return;

        initialize(level);

        Item pickedUpItem = event.getStack().getItem();
        unlockRecipesForItem(player, pickedUpItem, level);
    }

    // <item> Unlock recipes when player crafts an item
    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        Level level = player.level();
        if (level == null) return;

        initialize(level);

        Item craftedItem = event.getCrafting().getItem();
        unlockRecipesForItem(player, craftedItem, level);
    }

    // <item> Unlock recipes for all items the player currently has
    private static void unlockRecipesForPlayer(ServerPlayer player, Level level) {
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (!stack.isEmpty()) {
                unlockRecipesForItem(player, stack.getItem(), level);
            }
        }
    }

    // <item> Unlock recipes for a specific item (when used as ingredient)
    private static void unlockRecipesForItem(ServerPlayer player, Item item, Level level) {
        List<ResourceLocation> recipeIds = ITEM_TO_RECIPES_MAP.get(item);
        if (recipeIds == null || recipeIds.isEmpty()) return;

        RecipeManager recipeManager = level.getRecipeManager();
        List<RecipeHolder<?>> recipesToUnlock = new ArrayList<>();

        for (ResourceLocation recipeId : recipeIds) {
            Optional<RecipeHolder<?>> recipe = recipeManager.byKey(recipeId);
            if (recipe.isPresent()) {
                recipesToUnlock.add(recipe.get());
            }
        }

        // <item> Unlock all recipes at once
        if (!recipesToUnlock.isEmpty()) {
            player.awardRecipes(recipesToUnlock);
        }
    }
}