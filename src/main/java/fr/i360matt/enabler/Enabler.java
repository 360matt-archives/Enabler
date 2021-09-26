package fr.i360matt.enabler;

import java.util.HashMap;
import java.util.Map;

public class Enabler {

    private static final Map<Enabler, Runnable> tasks = new HashMap<>();

    public static void call (final Enabler enabler) {
        Runnable runnable = tasks.get(enabler);
        if (runnable != null) {
            runnable.run();
            tasks.remove(enabler);
        }
    }

    public static void register (final Enabler enabler, Runnable runnable) {
        tasks.put(enabler, runnable);
    }

}
