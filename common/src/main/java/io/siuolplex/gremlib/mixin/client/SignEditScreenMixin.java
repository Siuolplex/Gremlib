package io.siuolplex.gremlib.mixin.client;

import net.minecraft.client.gui.screens.inventory.SignEditScreen;
import org.spongepowered.asm.mixin.Mixin;

// Code is based on Terraform
// Found here: https://github.com/TerraformersMC/Terraform/blob/1.19.4/terraform-wood-api-v1/src/main/java/com/terraformersmc/terraform/sign/mixin/MixinSignEditScreen.java
@Mixin(SignEditScreen.class)
public class SignEditScreenMixin{
    /*@Shadow @Nullable private SignRenderer.SignModel signModel;

    @ModifyVariable(method = "renderSignBackground", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/client/renderer/Sheets;getSignMaterial(Lnet/minecraft/world/level/block/state/properties/WoodType;)Lnet/minecraft/client/resources/model/Material;"))
    private Material getSignTextureId(Material material, GuiGraphics context, BlockState state) {
        if (state.getBlock() instanceof WoodYouDyeSign sign) {
            return new Material(Sheets.SIGN_SHEET, sign.getTexture());
        }
        return material;
    }*/
}
