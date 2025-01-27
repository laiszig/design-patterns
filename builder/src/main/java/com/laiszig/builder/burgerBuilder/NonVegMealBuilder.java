package com.laiszig.builder.burgerBuilder;

public class NonVegMealBuilder extends MealBuilder {

    private Meal meal;

    public NonVegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void addFries() {
        this.meal.setFries("Medium");

    }

    @Override
    public void addBread() {
        this.meal.setBread("White");
    }

    @Override
    public void addDrink() {
        this.meal.setDrink("Coke");

    }

    @Override
    public void addProtein() {
        this.meal.setProtein("Chicken");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
