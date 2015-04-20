package org.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Date: 4/20/15
 * Time: 1:21 PM
 *
 * Double locking and volatile singleton
 */
public class DoubleLockingSingleton {

    private static volatile DoubleLockingSingleton instance;

    public static DoubleLockingSingleton getInstance() {
        DoubleLockingSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleLockingSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleLockingSingleton();
                }
            }
        }
        return localInstance;
    }

}
