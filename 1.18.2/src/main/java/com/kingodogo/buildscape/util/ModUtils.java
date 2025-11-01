package com.kingodogo.buildscape.util;

import com.kingodogo.buildscape.BuildScape;
import net.minecraft.resources.ResourceLocation;

public class ModUtils {
    
    public static ResourceLocation buildscapeResource(String path) {
        return new ResourceLocation(BuildScape.MODID, path);
    }
    
    public static String getModId() {
        return BuildScape.MODID;
    }
}
