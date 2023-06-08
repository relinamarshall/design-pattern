package com.design.pattern.builder.example.builders;

import com.design.pattern.builder.example.cars.CarType;
import com.design.pattern.builder.example.cars.Manual;
import com.design.pattern.builder.example.components.Engine;
import com.design.pattern.builder.example.components.GPSNavigator;
import com.design.pattern.builder.example.components.Transmission;
import com.design.pattern.builder.example.components.TripComputer;

/**
 * CarManualBuilder
 *
 * @author Wenzhou
 * @since 2023/6/8 15:11
 */
public class CarManualBuilder implements Builder{
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
