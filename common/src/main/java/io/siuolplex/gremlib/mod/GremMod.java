package io.siuolplex.gremlib.mod;

import io.siuolplex.gremlib.mod.submod.SubGremMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import org.slf4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public abstract class GremMod {
    public GremMod() {
        GremModInitialization.MODS.add(this);
    }

    // Main purpose is SIE's proposed modular system.
    public List<SubGremMod> getSubmods() {
        return List.of();
    }

    public abstract String getModID();

    public abstract Logger getLogger();

    public Identifier createId(String path) {
        return Identifier.fromNamespaceAndPath(getModID(), path);
    }

    public static class GremModReinitError extends Error {

        public GremModReinitError() {
            super();
        }

        public GremModReinitError(String message) {
            super(message);
        }
    }
}
