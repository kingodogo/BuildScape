package com.kingodogo.buildscape.util;

import net.minecraft.resources.ResourceLocation;
import com.kingodogo.buildscape.BuildScape;

// <item> Utility class for mod-related helper methods
public class ModUtils {

    // <item> Creates a ResourceLocation with the mod's namespace
    public static ResourceLocation buildscapeResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, path);
    }

    // <item> Returns the mod ID
    public static String getModId() {
        return BuildScape.MODID;
    }
}