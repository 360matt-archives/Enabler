package fr.i360matt.enabler;

import java.util.HashMap;
import java.util.Map;

public class Enabler {

    {
        call(this.getClass());
    }

    private static final Map<Class<?>, Runnable> tasks = new HashMap<>();

    public static void call (final Class<?> clazz) {
        Runnable runnable = tasks.get(clazz);
        if (runnable != null) {
            runnable.run();
            tasks.remove(clazz);
        }
    }

    public static void register (final Class<?> clazz, Runnable runnable) {
        tasks.put(clazz, runnable);
    }

}
