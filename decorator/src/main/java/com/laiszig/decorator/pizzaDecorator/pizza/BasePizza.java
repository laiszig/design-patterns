package com.laiszig.decorator.pizzaDecorator.pizza;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "Base Pizza";
    }
}
