package com.design.pattern.builder.example.components;

import com.design.pattern.builder.example.cars.Car;

/**
 * TripComputer
 *
 * @author Wenzhou
 * @since 2023/6/8 15:13
 */
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
