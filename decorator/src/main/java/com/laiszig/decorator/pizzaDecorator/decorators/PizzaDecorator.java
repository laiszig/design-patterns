package com.laiszig.decorator.pizzaDecorator.decorators;

import com.laiszig.decorator.pizzaDecorator.pizza.Pizza;

public class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String bake() {
        return pizza.bake();
    }
}
