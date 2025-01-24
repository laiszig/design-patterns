package com.laiszig.singleton;

/**
 * Reflection can break the singleton pattern because it allows access to private constructors,
 * bypassing the usual restrictions and safeguards designed to enforce the singleton property.
 * Using reflection, someone can create multiple instances of a class that is intended to follow the singleton pattern,
 * violating its core principle of having only one instance.
 * Solution:
 * The best way to prevent singleton breakage by reflection is to use an enum.
 * Java ensures that enums are inherently singleton and prevents reflection from instantiating new objects.
 * ENUM's constructor gets invoked by the JVM not the user.
 * They are thread-safe
 * Java's Enum inherently protects against reflection and serialization,
 * making it a robust choice for singleton implementation.
 */
public enum EnumSingleton {

    // Declared enums are by default static values, so we can call them directly
    INSTANCE;

    public void doSomething() {
        System.out.println("Enum");
    }
}
