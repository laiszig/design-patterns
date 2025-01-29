package com.laiszig.builder.carBuilder.builders;

import com.laiszig.builder.carBuilder.cars.CarType;
import com.laiszig.builder.carBuilder.components.Engine;
import com.laiszig.builder.carBuilder.components.GPSNavigator;
import com.laiszig.builder.carBuilder.components.Transmission;
import com.laiszig.builder.carBuilder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
