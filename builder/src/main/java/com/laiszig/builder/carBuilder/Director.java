package com.laiszig.builder.carBuilder;

/**
 *  The director is only responsible for executing the building
 *  steps in a particular sequence. It's helpful when producing
 *  products according to a specific order or configuration.
 *  Strictly speaking, the director class is optional, since the
 *  client can control builders directly.
 */
public class Director {

    /**
     *  The director works with any builder instance that the
     *  client code passes to it. This way, the client code may
     *  alter the final type of the newly assembled product.
     *  The director can construct several product variations
     *  using the same building steps.
     * @param builder
     */
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("SUVEngine");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
