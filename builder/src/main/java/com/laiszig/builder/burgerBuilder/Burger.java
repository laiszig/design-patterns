package com.laiszig.builder.burgerBuilder;

public class Burger {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonnaise;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder) {
        // Initialize all fields, we can also add validations here
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public void setMayonnaise(boolean mayonnaise) {
        this.mayonnaise = mayonnaise;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    /**
     * Return same object everytime this builder is used
     * Once the build method is invoked, return actual object
     */
    public static class BurgerBuilder {

        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonnaise;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder mayonnaise(boolean mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
