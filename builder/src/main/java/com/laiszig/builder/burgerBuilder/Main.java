package com.laiszig.builder.burgerBuilder;

public class Main {

    public static void main(String[] args) {

        Burger burger = new Burger.BurgerBuilder()
                .mayonnaise(true)
                .onion(true)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();

        // GOF Builder example
        Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();

    }
}
