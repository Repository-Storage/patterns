package org.patterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 */
public class OnDemandSingleton {
    private OnDemandSingleton() {}

    private static class OnDemandSingletonHolder {
        public static final OnDemandSingleton instance = new OnDemandSingleton();
    }

    public static OnDemandSingleton getInstance() {
        return OnDemandSingletonHolder.instance;
    }

}
