package com.laiszig.prototype.vehiclePrototype;

/**
 * Prototype pattern comes is a creational design pattern.
 * It consists in creating objects from some reference which we already have.
 * It is mainly useful when we have an Object which is already created with costly operations
 * so we keep that object after creation whenever we need
 * A new object is simply a cloned object that can have modifications when we use it.
 * It is useful when we want to hide the creation of the object.
 *
 * Objects can have a high cost of creation, like when they are created by some database operations or io operation.
 *
 * We can choose to have a shallow copy or a depp copy.
 *
 * There are mainly three components involved in simple Prototype design pattern.
 * 1. Prototype : Usually an abstract class which has a clone method and is the super class of all prototypes.
 * 2. Sub-Classes - implements cloning.
 * 3. Client - uses this subclass and clone
 * 4. Registry - Optional - we can maintain registry which helps to store and use specific prototypes.
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        TwoWheelerVehicle twoWheelerVehicle = (TwoWheelerVehicle)vehicleRegistry.getVehicle("TWO");
        System.out.println(twoWheelerVehicle);

    }
}
