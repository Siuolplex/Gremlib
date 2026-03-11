package io.siuolplex.gremlib.block.sign;

import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

// Code is based on Terraform
// Original found here: https://github.com/TerraformersMC/Terraform/blob/1.19.4/terraform-wood-api-v1/src/main/java/com/terraformersmc/terraform/sign/block/TerraformSignBlock.java
public class GremCeilingHangingSignBlock extends CeilingHangingSignBlock implements GremHangingSign {
    private final Identifier guiTexture;
    private final Identifier texture;

    public GremCeilingHangingSignBlock(WoodType type, Properties settings) {
        super(type, settings);
        this.texture = Identifier.fromNamespaceAndPath("wood_you_dye", "entity/signs/hanging/" + type.name());
        this.guiTexture = Identifier.fromNamespaceAndPath("wood_you_dye", "textures/gui/hanging_sign/" + type.name());
    }

    @Override
    public Identifier getGuiTexture() {
        return guiTexture;
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
