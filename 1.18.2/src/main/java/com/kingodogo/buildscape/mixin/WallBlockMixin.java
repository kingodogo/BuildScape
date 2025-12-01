package com.kingodogo.buildscape.mixin;

import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WallBlock.class)
public class WallBlockMixin {
    private static final TagKey<Block> WALLS_TAG = TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation("minecraft:walls"));

    // Make walls connect to other wall blocks
    @Inject(method = "connectsTo", at = @At("HEAD"), cancellable = true)
    private void connectsTo(BlockState state, boolean sideSolidFullSquare, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        Block block = state.getBlock();
        // Always connect to other wall blocks (this is the key fix!)
        if (block instanceof WallBlock) {
            cir.setReturnValue(true);
            return;
        }
        // Also check if it's in the walls tag
        if (state.is(WALLS_TAG)) {
            cir.setReturnValue(true);
            return;
        }
        // If neither, continue with original logic (don't cancel)
    }
}

// Kingooo Finished this File on 2025-01-12
