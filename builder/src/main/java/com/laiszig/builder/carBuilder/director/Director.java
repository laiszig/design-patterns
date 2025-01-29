package com.laiszig.builder.carBuilder.director;

import com.laiszig.builder.carBuilder.builders.Builder;
import com.laiszig.builder.carBuilder.cars.CarType;
import com.laiszig.builder.carBuilder.components.Engine;
import com.laiszig.builder.carBuilder.components.GPSNavigator;
import com.laiszig.builder.carBuilder.components.Transmission;
import com.laiszig.builder.carBuilder.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore, it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}
