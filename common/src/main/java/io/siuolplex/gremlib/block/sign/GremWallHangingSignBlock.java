package io.siuolplex.gremlib.block.sign;

import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GremWallHangingSignBlock extends WallHangingSignBlock implements GremHangingSign {
    private final Identifier guiTexture;
    private final Identifier texture;

    public GremWallHangingSignBlock(WoodType type, Properties settings) {
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
