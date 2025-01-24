package com.laiszig.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        exampleSerialization();
        exampleReflection();
    }

    /**
     * When a class implements Serializable, its state can be written to a stream and later restored by reading from that stream.
     * During deserialization, the JVM creates a new instance of the class.
     * This bypasses the mechanisms you put in place to enforce a single instance,
     * effectively creating multiple instances of the supposed singleton class.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1: " + lazySingleton.hashCode());
        System.out.println("Object 2: " + deserializedLazy.hashCode());
        System.out.println("**------------------------------------**");

        // Solution - overriding readResolve() method
        SerializableSingleton lazySingleton2 = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream2.writeObject(lazySingleton2);
        objectOutputStream2.close();
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object.obj"));
        SerializableSingleton deserializedLazy2 = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println("Object 1: " + lazySingleton2.hashCode());
        System.out.println("Object 2: " + deserializedLazy2.hashCode());
    }

    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();

        // There is only one constructor - getting it through the index
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Reflected singleton hashcode: " + lazySingleton.hashCode());
        System.out.println("Singleton instance hashcode: " + instance.hashCode());

        // Solution: Singleton Enum
        EnumSingleton.INSTANCE.doSomething();
    }

}
