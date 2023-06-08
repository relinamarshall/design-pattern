package com.design.pattern.builder.example.builders;

import com.design.pattern.builder.example.cars.Car;
import com.design.pattern.builder.example.cars.CarType;
import com.design.pattern.builder.example.components.Engine;
import com.design.pattern.builder.example.components.GPSNavigator;
import com.design.pattern.builder.example.components.Transmission;
import com.design.pattern.builder.example.components.TripComputer;

/**
 * CarBuilder
 *
 * @author Wenzhou
 * @since 2023/6/8 15:10
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

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
