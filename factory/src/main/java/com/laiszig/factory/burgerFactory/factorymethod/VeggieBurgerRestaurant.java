package com.laiszig.factory.burgerFactory.factorymethod;

public class VeggieBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
