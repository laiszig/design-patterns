package com.laiszig.builder.burgerBuilder;

public abstract class MealBuilder {

    public abstract void addFries();
    public abstract void addBread();
    public abstract void addDrink();
    public abstract void addProtein();

    public abstract Meal build();
}
