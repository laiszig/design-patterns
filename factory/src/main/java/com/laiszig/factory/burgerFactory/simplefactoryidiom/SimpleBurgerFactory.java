package com.laiszig.factory.burgerFactory.simplefactoryidiom;

/**
 * Simple factory idiom is not a full-fledged pattern, it os more of an idiom
 * that's commonly used.
 *
 * It's called a factory because its sole responsibility is creating burgers
 *
 * Follows SRP but not OCP.
 * If we add more recipes to the menu, the method is going to need to change
 */
public class SimpleBurgerFactory {

    public Burger createBurger(String request){
        Burger burger = null;
        if("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if ("VEGGIE".equals(request)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}
