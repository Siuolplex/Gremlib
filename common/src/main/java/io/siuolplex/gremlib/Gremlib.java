package io.siuolplex.gremlib;

import io.siuolplex.gremlib.mod.GremMod;
import io.siuolplex.gremlib.mod.submod.SubGremMod;
import io.siuolplex.gremlib.multiloader.Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Gremlib implements GremMod {
    private static Gremlib INSTANCE;
    private Loader loader = null;
    public static final String MODID = "gremlib";
    public static Logger LOGGER = LoggerFactory.getLogger("Gremlib");

    public Gremlib(Loader loader) {

        INSTANCE = this;
    }

    public static Gremlib getInstance() {
        return INSTANCE;
    }

    @Override
    public List<SubGremMod> getSubmods() {
        return List.of();
    }

    public Loader getLoader() {
        return loader;
    }


}
