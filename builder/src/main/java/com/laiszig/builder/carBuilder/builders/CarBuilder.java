package com.laiszig.builder.carBuilder.builders;

import com.laiszig.builder.carBuilder.cars.Car;
import com.laiszig.builder.carBuilder.cars.CarType;
import com.laiszig.builder.carBuilder.components.Engine;
import com.laiszig.builder.carBuilder.components.GPSNavigator;
import com.laiszig.builder.carBuilder.components.Transmission;
import com.laiszig.builder.carBuilder.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface
 */
public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
