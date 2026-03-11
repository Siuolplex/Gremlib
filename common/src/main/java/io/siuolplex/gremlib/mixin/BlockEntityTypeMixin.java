package io.siuolplex.gremlib.mixin;

import io.siuolplex.gremlib.block.sign.GremSign;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// Code is based on Terraform
// Found here: https://github.com/TerraformersMC/Terraform/blob/1.19.4/terraform-wood-api-v1/src/main/java/com/terraformersmc/terraform/sign/mixin/MixinBlockEntityType.java
@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {
    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void isValid(BlockState state, CallbackInfoReturnable<Boolean> info) {
        Block block = state.getBlock();

        if (block instanceof GremSign) {
            if (BlockEntityType.HANGING_SIGN.equals(this)) {
                if (!(block instanceof CeilingHangingSignBlock || block instanceof WallHangingSignBlock)) {
                    return;
                }
            } else if (!BlockEntityType.SIGN.equals(this)) {
                return;
            }

            info.setReturnValue(true);
        }
    }
}
