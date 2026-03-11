package io.siuolplex.gremlib.multiloader;

import java.nio.file.Path;

/**
 * A set of small util stuff for Loaders.
 * <br> Might need to be expanded over time, who knows.
 *
 */
public interface Loader {
    default boolean isDevMode() {
        throw new NoLoaderProvidedException();
    }

    default boolean isClient() {
        throw new NoLoaderProvidedException();
    }

    default String getLoader() {
        throw new NoLoaderProvidedException();
    }

    default Path getGameDir() {
        throw new NoLoaderProvidedException();
    }

    default boolean isModPresent(String mod) {
        throw new NoLoaderProvidedException();
    }

    default boolean isDataGenerating() {
        throw new NoLoaderProvidedException();
    }



    class NoLoaderProvidedException extends RuntimeException {
    }
}
