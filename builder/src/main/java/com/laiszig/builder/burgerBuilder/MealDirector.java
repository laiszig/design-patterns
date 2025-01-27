package com.laiszig.builder.burgerBuilder;

/**
 * calls the correct builder according to the input
 */
public class MealDirector {

    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal prepareMeal() {
        mealBuilder.addBread();
        mealBuilder.addFries();
        mealBuilder.addProtein();
        mealBuilder.addDrink();
        return mealBuilder.build();
    }
}
