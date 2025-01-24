package com.laiszig.singleton;

import java.io.Serializable;

/**
 * Lazy initialization means the application will create an instance when
 * the object of this class is created.
 * Not thread-safe in Multithreaded environments.
 * Two threads can arrive at the null check and create two different objects
 *
 * This approach should only be used in single-threaded applications
 */
public class LazySingleton implements Serializable {

    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
