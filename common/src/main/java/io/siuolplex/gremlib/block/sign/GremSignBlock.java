package io.siuolplex.gremlib.block.sign;

import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

// Code is based on Terraform
// Original found here: https://github.com/TerraformersMC/Terraform/blob/1.19.4/terraform-wood-api-v1/src/main/java/com/terraformersmc/terraform/sign/block/TerraformSignBlock.java
public class GremSignBlock extends StandingSignBlock implements GremSign {
    private final Identifier texture;

    public GremSignBlock(WoodType type, Properties settings) {
        super(type, settings.noOcclusion().noCollision());
        this.texture = Identifier.fromNamespaceAndPath("wood_you_dye", "entity/signs/" + type.name());
    }

    @Override
    public Identifier getTexture() {
        return texture;
    }
}
