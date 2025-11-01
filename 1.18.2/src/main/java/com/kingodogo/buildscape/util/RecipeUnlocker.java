package com.kingodogo.buildscape.util;

import com.kingodogo.buildscape.BuildScape;
import com.kingodogo.buildscape.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;

// [Scripter]: Automatically unlocks recipes when players obtain specific items
// This system unlocks all related recipes (slabs, stairs, walls, etc.) when players get base items
@Mod.EventBusSubscriber(modid = BuildScape.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class RecipeUnlocker {
    
    private static final Map<Item, List<String>> RECIPE_UNLOCK_MAP = new HashMap<>();
    private static boolean initialized = false;
    
    // Initialize the recipe unlock mapping
    private static void initialize() {
        if (initialized) return;
        
        // Sand items unlock sandstone recipes
        registerUnlock(ModItems.BLACK_SAND_ITEM, "black_sandstone", "black_sandstone_slab", "black_sandstone_stairs", "black_sandstone_wall",
                "black_smooth_sandstone", "black_smooth_sandstone_slab", "black_smooth_sandstone_stairs");
        registerUnlock(ModItems.BLUE_SAND_ITEM, "blue_sandstone", "blue_sandstone_slab", "blue_sandstone_stairs", "blue_sandstone_wall",
                "blue_smooth_sandstone", "blue_smooth_sandstone_slab", "blue_smooth_sandstone_stairs");
        registerUnlock(ModItems.GREEN_SAND_ITEM, "green_sandstone", "green_sandstone_slab", "green_sandstone_stairs", "green_sandstone_wall",
                "green_smooth_sandstone", "green_smooth_sandstone_slab", "green_smooth_sandstone_stairs");
        registerUnlock(ModItems.ORANGE_SAND_ITEM, "orange_sandstone", "orange_sandstone_slab", "orange_sandstone_stairs", "orange_sandstone_wall",
                "orange_smooth_sandstone", "orange_smooth_sandstone_slab", "orange_smooth_sandstone_stairs");
        registerUnlock(ModItems.PINK_SAND_ITEM, "pink_sandstone", "pink_sandstone_slab", "pink_sandstone_stairs", "pink_sandstone_wall",
                "pink_smooth_sandstone", "pink_smooth_sandstone_slab", "pink_smooth_sandstone_stairs");
        registerUnlock(ModItems.RED_SAND_ITEM, "red_sandstone", "red_sandstone_slab", "red_sandstone_stairs", "red_sandstone_wall",
                "red_smooth_sandstone", "red_smooth_sandstone_slab", "red_smooth_sandstone_stairs");
        registerUnlock(ModItems.WHITE_SAND_ITEM, "white_sandstone", "white_sandstone_slab", "white_sandstone_stairs", "white_sandstone_wall",
                "white_smooth_sandstone", "white_smooth_sandstone_slab", "white_smooth_sandstone_stairs");
        registerUnlock(ModItems.YELLOW_SAND_ITEM, "yellow_sandstone", "yellow_sandstone_slab", "yellow_sandstone_stairs", "yellow_sandstone_wall",
                "yellow_smooth_sandstone", "yellow_smooth_sandstone_slab", "yellow_smooth_sandstone_stairs");
        
        // Tiles unlock their variants
        registerUnlock(ModItems.BLACK_TILES_ITEM, "black_tiles_slab", "black_tiles_stairs", "black_tiles_wall");
        registerUnlock(ModItems.BLUE_TILES_ITEM, "blue_tiles_slab", "blue_tiles_stairs", "blue_tiles_wall");
        registerUnlock(ModItems.BROWN_TILES_ITEM, "brown_tiles_slab", "brown_tiles_stairs", "brown_tiles_wall");
        registerUnlock(ModItems.CYAN_TILES_ITEM, "cyan_tiles_slab", "cyan_tiles_stairs", "cyan_tiles_wall");
        registerUnlock(ModItems.GRAY_TILES_ITEM, "gray_tiles_slab", "gray_tiles_stairs", "gray_tiles_wall");
        registerUnlock(ModItems.GREEN_TILES_ITEM, "green_tiles_slab", "green_tiles_stairs", "green_tiles_wall");
        registerUnlock(ModItems.LIGHT_BLUE_TILES_ITEM, "light_blue_tiles_slab", "light_blue_tiles_stairs", "light_blue_tiles_wall");
        registerUnlock(ModItems.LIGHT_GRAY_TILES_ITEM, "light_gray_tiles_slab", "light_gray_tiles_stairs", "light_gray_tiles_wall");
        registerUnlock(ModItems.LIME_TILES_ITEM, "lime_tiles_slab", "lime_tiles_stairs", "lime_tiles_wall");
        registerUnlock(ModItems.MAGENTA_TILES_ITEM, "magenta_tiles_slab", "magenta_tiles_stairs", "magenta_tiles_wall");
        registerUnlock(ModItems.ORANGE_TILES_ITEM, "orange_tiles_slab", "orange_tiles_stairs", "orange_tiles_wall");
        registerUnlock(ModItems.PINK_TILES_ITEM, "pink_tiles_slab", "pink_tiles_stairs", "pink_tiles_wall");
        registerUnlock(ModItems.PURPLE_TILES_ITEM, "purple_tiles_slab", "purple_tiles_stairs", "purple_tiles_wall");
        registerUnlock(ModItems.RED_TILES_ITEM, "red_tiles_slab", "red_tiles_stairs", "red_tiles_wall");
        registerUnlock(ModItems.WHITE_TILES_ITEM, "white_tiles_slab", "white_tiles_stairs", "white_tiles_wall");
        registerUnlock(ModItems.YELLOW_TILES_ITEM, "yellow_tiles_slab", "yellow_tiles_stairs", "yellow_tiles_wall");
        
        // Sandstone unlocks smooth sandstone and variants
        registerUnlock(ModItems.BLACK_SANDSTONE_ITEM, "black_smooth_sandstone", "black_smooth_sandstone_slab", "black_smooth_sandstone_stairs");
        registerUnlock(ModItems.BLUE_SANDSTONE_ITEM, "blue_smooth_sandstone", "blue_smooth_sandstone_slab", "blue_smooth_sandstone_stairs");
        registerUnlock(ModItems.GREEN_SANDSTONE_ITEM, "green_smooth_sandstone", "green_smooth_sandstone_slab", "green_smooth_sandstone_stairs");
        registerUnlock(ModItems.ORANGE_SANDSTONE_ITEM, "orange_smooth_sandstone", "orange_smooth_sandstone_slab", "orange_smooth_sandstone_stairs");
        registerUnlock(ModItems.PINK_SANDSTONE_ITEM, "pink_smooth_sandstone", "pink_smooth_sandstone_slab", "pink_smooth_sandstone_stairs");
        registerUnlock(ModItems.RED_SANDSTONE_ITEM, "red_smooth_sandstone", "red_smooth_sandstone_slab", "red_smooth_sandstone_stairs");
        registerUnlock(ModItems.WHITE_SANDSTONE_ITEM, "white_smooth_sandstone", "white_smooth_sandstone_slab", "white_smooth_sandstone_stairs");
        registerUnlock(ModItems.YELLOW_SANDSTONE_ITEM, "yellow_smooth_sandstone", "yellow_smooth_sandstone_slab", "yellow_smooth_sandstone_stairs");
        
        initialized = true;
        BuildScape.LOGGER.info("RecipeUnlocker initialized with {} item mappings", RECIPE_UNLOCK_MAP.size());
    }
    
    private static void registerUnlock(RegistryObject<Item> item, String... recipeNames) {
        if (item == null) return;
        RECIPE_UNLOCK_MAP.put(item.get(), Arrays.asList(recipeNames));
    }
    
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        initialize();
        
        // Unlock recipes for items the player already has
        unlockRecipesForPlayer(player);
    }
    
    @SubscribeEvent
    public static void onItemPickup(PlayerEvent.ItemPickupEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        initialize();
        
        Item pickedUpItem = event.getStack().getItem();
        unlockRecipesForItem(player, pickedUpItem);
    }
    
    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        initialize();
        
        Item craftedItem = event.getCrafting().getItem();
        unlockRecipesForItem(player, craftedItem);
    }
    
    // Unlock recipes for all items the player currently has
    private static void unlockRecipesForPlayer(ServerPlayer player) {
        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            Item item = player.getInventory().getItem(i).getItem();
            unlockRecipesForItem(player, item);
        }
    }
    
    // Unlock recipes for a specific item
    private static void unlockRecipesForItem(ServerPlayer player, Item item) {
        List<String> recipeNames = RECIPE_UNLOCK_MAP.get(item);
        if (recipeNames == null || recipeNames.isEmpty()) return;
        
        RecipeManager recipeManager = player.level.getServer().getRecipeManager();
        List<Recipe<?>> recipesToUnlock = new ArrayList<>();
        
        for (String recipeName : recipeNames) {
            // Try crafting recipes first (format: recipeName_crafting)
            ResourceLocation recipeLocation = ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, recipeName + "_crafting");
            Optional<? extends Recipe<?>> recipe = recipeManager.byKey(recipeLocation);
            
            if (recipe.isPresent()) {
                recipesToUnlock.add(recipe.get());
            } else {
                // Try stonecutting recipes (format: recipeName_from_baseItem_stonecutting)
                // For example: yellow_tiles_slab_from_yellow_tiles_stonecutting
                // We need to extract the base item name from the current item
                ResourceLocation itemLocation = ForgeRegistries.ITEMS.getKey(item);
                if (itemLocation == null) continue;
                String itemPath = itemLocation.getPath();
                String baseItemName = itemPath.replace("_item", "");
                
                // Try both patterns: recipeName_from_baseItem_stonecutting and recipeName_stonecutting
                recipeLocation = ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, recipeName + "_from_" + baseItemName + "_stonecutting");
                recipe = recipeManager.byKey(recipeLocation);
                
                if (!recipe.isPresent()) {
                    recipeLocation = ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, recipeName + "_stonecutting");
                    recipe = recipeManager.byKey(recipeLocation);
                }
                
                if (recipe.isPresent()) {
                    recipesToUnlock.add(recipe.get());
                }
            }
        }
        
        // Unlock all recipes at once
        if (!recipesToUnlock.isEmpty()) {
            player.awardRecipes(recipesToUnlock);
        }
    }
}

