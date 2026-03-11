package io.siuolplex.gremlib.builder;

import io.siuolplex.gremlib.registration.DelayedRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BlockBuilder implements BIRObjBuilder<Block> {

    @Override
    public boolean isBuilderFrozen() {
        return false;
    }

    @Override
    public Block build() {
        return null;
    }

    @Override
    public ResourceKey<Block> getKey() {
        return null;
    }
}
