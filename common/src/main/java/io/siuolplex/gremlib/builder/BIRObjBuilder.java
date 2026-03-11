package io.siuolplex.gremlib.builder;

import net.minecraft.resources.ResourceKey;

public interface BIRObjBuilder<T> {
    boolean isBuilderFrozen();

    T build();

    ResourceKey<T> getKey();

    default void throwIfFrozenBuilder() {
        if (isBuilderFrozen()) {
            throw new ChangeWhileFrozenException("Changed variables for " + getKey().identifier() + " in registry " + getKey().registry());
        }
    }

    class ChangeWhileFrozenException extends RuntimeException {
        public ChangeWhileFrozenException(String message) {
            super(message);
        }
    }
}
