package io.siuolplex.gremlib.mod;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

import java.util.Map;
import java.util.function.Consumer;

interface HasRegistration {
    Map<ResourceKey<?>, Consumer<Registry<?>>> getOrMapRegistries();
    void fireRegistry(Registry<?> registry);
}
