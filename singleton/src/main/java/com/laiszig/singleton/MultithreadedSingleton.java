package com.laiszig.singleton;

public class MultithreadedSingleton {

    private static MultithreadedSingleton instance = null;

    private MultithreadedSingleton() {
        // init here
    }

    public static MultithreadedSingleton getInstance() {
        // Here we need to have two null checks
        // The first, is in case no code in the app has called this class, so we need to create a new object
        if(instance == null) {
            // Our method is static, so we have class level lock
            // synchronized block only for the object creation
            // This way we avoid blocking a thread for too long
            synchronized (MultithreadedSingleton.class) {
                // Only one thread can access this part of the code at a time, the other has to wait
                // We need a second null check in case two threads enter the first if
                // One thread is locked while the other creates a new instance
                if (instance == null) {
                    instance = new MultithreadedSingleton();
                    // Thread 1 will arrive here, but thread 2 will see in the second null check
                    // That now, there is an instance of the class
                }
            }
        }
        return instance;
    }

}
