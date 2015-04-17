package org.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
