package org.apache.maven;

import java.util.ArrayList;
import java.util.Collection;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final Collection<byte[]> arrays = new ArrayList<>();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void addNewArray() {
        arrays.add(new byte[1024 * 1024]);
    }
}
