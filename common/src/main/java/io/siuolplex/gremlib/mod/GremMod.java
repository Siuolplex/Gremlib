package io.siuolplex.gremlib.mod;

import io.siuolplex.gremlib.mod.submod.SubGremMod;
import io.siuolplex.gremlib.multiloader.Loader;

import java.util.List;

public interface GremMod {
    List<SubGremMod> getSubmods();

}
