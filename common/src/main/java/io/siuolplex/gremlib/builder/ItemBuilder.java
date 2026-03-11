package io.siuolplex.gremlib.builder;

import io.siuolplex.gremlib.registration.DelayedRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ItemBuilder implements BIRObjBuilder<Item> {
    private final Identifier id;
    private Function<Item.Properties, Item> itemFunction;
    private Item.Properties properties;

    private boolean frozen = false;

    public ItemBuilder(Identifier id, Function<Item.Properties, Item> itemFunction, Item.Properties properties) {
        this.id = id;
        this.itemFunction = itemFunction;
        this.properties = properties;
    }

    @Override
    public boolean isBuilderFrozen() {
        return frozen;
    }

    @Override
    public Item build() {
        DelayedRegistry<Item> registry = (DelayedRegistry<Item>) DelayedRegistry.getRegistry(id.getNamespace(), Registries.ITEM);
        Item item = itemFunction.apply(properties.setId(getKey()));
        registry.addToDelayedRegistry(id, item);
        this.frozen = true;
        return item;
    }

    @Override
    public ResourceKey<Item> getKey() {
        return ResourceKey.create(Registries.ITEM, id);
    }
}
