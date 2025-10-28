package com.kingodogo.buildscape.util;

import net.minecraft.resources.ResourceLocation;
import com.kingodogo.buildscape.BuildScape;

public class ModUtils {
    
    public static ResourceLocation buildscapeResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(BuildScape.MODID, path);
    }
    
    public static String getModId() {
        return BuildScape.MODID;
    }
}
