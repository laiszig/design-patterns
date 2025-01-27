package com.laiszig.builder.burgerBuilder;

public class VegMealBuilder extends MealBuilder{

    private Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void addFries() {
        this.meal.setFries("Large");

    }

    @Override
    public void addBread() {
        this.meal.setBread("Brioche");
    }

    @Override
    public void addDrink() {
        this.meal.setDrink("Sprite");

    }

    @Override
    public void addProtein() {
        this.meal.setProtein("Veg");
    }

    @Override
    public Meal build() {
        return meal;
    }
}
