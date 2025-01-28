package com.laiszig.builder.carBuilder;

/**
 * Unlike other creational patterns, builder lets you construct
 * products that don't follow the common interface.
 */
public class CarManualBuilder implements Builder{

    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        // Document car seat features.
    }

    @Override
    public void setEngine(String engine) {
        // Add engine instructions.
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        // Add trip computer instructions.
    }

    @Override
    public void setGPS(boolean hasGPS) {
        // Add GPS instructions.
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
