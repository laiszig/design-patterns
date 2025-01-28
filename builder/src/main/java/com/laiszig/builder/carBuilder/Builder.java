package com.laiszig.builder.carBuilder;

public interface Builder {

    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}
