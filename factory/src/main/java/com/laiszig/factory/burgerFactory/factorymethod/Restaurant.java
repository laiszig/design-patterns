package com.laiszig.factory.burgerFactory.factorymethod;

/**
 * Useful when we don't know the exact types of objects the code will work with
 * Makes it easy to extend the product construction code independently of the rest of the application
 * Allows introducing new products without breaking the existing code
 *
 * Applies OCP and SRP since it centralizes the product creation code in one place
 *
 * What if we create a new Restaurant type?!
 * What about the delivery options?
 * We would depend on the request again... We would need a different pattern - Abstract Factory
 */
public abstract class Restaurant {

    /**
     * Not dependent on the request object because it is not necessary
     * The user can now directly instantiate and invoke the concrete restaurant class implementation
     * they need and the correct prepared burger will be returned to them.
     */
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    /**
     * this is the factory method
     * Implemented by the subclasses of the Restaurant class
     *
     * The factory method relies heavily on inheritance
     * It delegates the object's creation to subclasses that implement the factory method
     *
     * Lets the creator-subclasses decide which class to instantiate
     */
    public abstract Burger createBurger();
}
