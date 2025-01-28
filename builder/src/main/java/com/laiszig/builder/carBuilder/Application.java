package com.laiszig.builder.carBuilder;

/**
 * The client code creates a builder object, passes it to the
 * director and then initiates the construction process. The end
 * result is retrieved from the builder object.
 */
public class Application {

    public void makeCar() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getProduct();
        // The final product is often retrieved from a builder
        // object since the director isn't aware of and not
        // dependent on concrete builders and products.

    }
}
