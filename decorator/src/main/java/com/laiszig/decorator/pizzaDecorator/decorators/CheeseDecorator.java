package com.laiszig.decorator.pizzaDecorator.decorators;

import com.laiszig.decorator.pizzaDecorator.pizza.Pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() + addCheese();
    }

    private String addCheese() {
        return " Cheese";
    }
}
