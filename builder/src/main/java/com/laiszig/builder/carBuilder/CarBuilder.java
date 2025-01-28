package com.laiszig.builder.carBuilder;

/**
 *  The concrete builder classes follow the builder interface and
 *  provide specific implementations of the building steps. Your
 *  program may have several variations of builders, each
 *  implemented differently.
 */
public class CarBuilder implements Builder {

    private Car car;

    // A fresh builder instance should contain a blank product
    // object which it uses in further assembly.
    public CarBuilder() {
        this.reset();
    }

    @Override
    // The reset method clears the object being built.
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        // Set the number of seats in the car.
    }

    @Override
    public void setEngine(String engine) {
        // Install a given engine.
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        // Install a trip computer.
    }

    @Override
    public void setGPS(boolean hasGPS) {
        // Install a GPS.
    }

    /**
     *  Concrete builders are supposed to provide their own
     *  methods for retrieving results. That's because various
     *  types of builders may create entirely different products
     *  that don't all follow the same interface. Therefore, such
     *  methods can't be declared in the builder interface (at
     *  least not in a statically-typed programming language).
     *
     *  Usually, after returning the end result to the client, a
     *  builder instance is expected to be ready to start
     *  producing another product. That's why it's a usual
     *  practice to call the reset method at the end of the
     *  `getProduct` method body. However, this behavior isn't
     *  mandatory, and you can make your builder wait for an
     *  explicit reset call from the client code before disposing
     *  of the previous result.
     * @return
     */
    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
