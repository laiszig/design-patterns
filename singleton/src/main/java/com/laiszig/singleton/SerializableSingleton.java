package com.laiszig.singleton;

import java.io.Serializable;

/**
 * If our singleton implements Serializable, during deserialization a new object will be created.
 * To resolve this, we must implement the readResolve() method, to ensure the JVM replaces the
 * deserialized object with the existing singleton instance, preserving the singleton property.
 */
public class SerializableSingleton implements Serializable {

    private static SerializableSingleton instance = null;

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        if(instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    /**
    * To ensure the singleton property is maintained during deserialization, override the readResolve method.
    * This method is called during deserialization and allows you to replace the deserialized object with the original singleton instance.
     */
    protected Object readResolve() {
        return instance;
    }
}
