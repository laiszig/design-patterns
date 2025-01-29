package com.laiszig.builder.carBuilder;

import com.laiszig.builder.carBuilder.builders.CarBuilder;
import com.laiszig.builder.carBuilder.builders.CarManualBuilder;
import com.laiszig.builder.carBuilder.cars.Car;
import com.laiszig.builder.carBuilder.cars.Manual;
import com.laiszig.builder.carBuilder.director.Director;

/**
 * Client code.
 * Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCarManual built:\n" + carManual.print());

    }
}
