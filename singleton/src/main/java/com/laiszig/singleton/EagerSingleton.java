package com.laiszig.singleton;

/**
 * Eager initialization means that as soon as the JVM starts, the object
 * will be created irrespective of whether it was called by any code in the application.
 * It fixes the problem with multiple threads creating new objects, however,
 * it will consume resource even if the application doesn't call this class
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        //init here
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
