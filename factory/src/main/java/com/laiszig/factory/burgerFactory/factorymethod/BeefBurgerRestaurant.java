package com.laiszig.factory.burgerFactory.factorymethod;

public class BeefBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
