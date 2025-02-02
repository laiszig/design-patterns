package com.laiszig.decorator.pizzaDecorator;

import com.laiszig.decorator.pizzaDecorator.decorators.CheeseDecorator;
import com.laiszig.decorator.pizzaDecorator.decorators.JalapenoDecorator;
import com.laiszig.decorator.pizzaDecorator.pizza.BasePizza;
import com.laiszig.decorator.pizzaDecorator.pizza.Pizza;

/**
 * Decorator Patterns allows us to keep adding new decorators, achieving dynamic object extension.
 * Inheritance also helps to expand functionalities but that is at compile-time not at runtime.
 *
 * Steps:
 * Create Interface - Base product
 * Create abstract class - Base product's base impl
 * Abstract Decorator - Implement the base product - This works as the foundation of what other decorators need to do.
 * Different decorators - Take the product input and decorate it.
 */
public class Main {
    public static void main(String[] args) {
        // We got pizza with different topings , we can keep adding topings
        Pizza pizza = new JalapenoDecorator((new CheeseDecorator(new BasePizza())));
        System.out.println(pizza.bake());
    }
}
