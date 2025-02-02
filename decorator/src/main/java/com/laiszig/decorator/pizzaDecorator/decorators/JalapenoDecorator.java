package com.laiszig.decorator.pizzaDecorator.decorators;

import com.laiszig.decorator.pizzaDecorator.pizza.Pizza;

public class JalapenoDecorator extends PizzaDecorator{
    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake() {
        return pizza.bake() + addJalepano();
    }

    public String addJalepano(){
        return " Jalepeno";
    }
}
