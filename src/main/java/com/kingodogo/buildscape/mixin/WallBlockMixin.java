package com.kingodogo.buildscape.mixin;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// <item> Mixin that makes walls connect to other wall blocks by checking WallBlock instances and walls tag
@Mixin(WallBlock.class)
public class WallBlockMixin {
    private static final TagKey<Block> WALLS_TAG = TagKey.create(Registries.BLOCK,
        ResourceLocation.fromNamespaceAndPath("minecraft", "walls"));

    // <item> Intercepts the connectsTo method to allow walls to connect to any WallBlock or block in the walls tag
    @Inject(method = "connectsTo", at = @At("HEAD"), cancellable = true)
    private void connectsTo(BlockState state, boolean sideSolidFullSquare, Direction direction, CallbackInfoReturnable<Boolean> cir) {
        Block block = state.getBlock();
        // <item> Always connect to other wall blocks
        if (block instanceof WallBlock) {
            cir.setReturnValue(true);
            return;
        }
        // <item> Also check if it's in the walls tag
        if (state.is(WALLS_TAG)) {
            cir.setReturnValue(true);
            return;
        }
        // <item> If neither, continue with original logic
    }
}