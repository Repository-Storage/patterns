package org.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Date: 4/20/15
 * Time: 1:48 PM
 */
public enum EnumSingleton {
    INSTANCE;
    private EnumSingleton() {
        System.out.println("one instance only");
    }
}
