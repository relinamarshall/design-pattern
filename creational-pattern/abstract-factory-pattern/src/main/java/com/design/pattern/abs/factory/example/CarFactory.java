package com.design.pattern.abs.factory.example;

/**
 * @author Wenzhou
 * @since 2023/5/15 16:03
 */
public abstract class CarFactory {
    public abstract SportCar buildSportCar();

    public abstract BusinessCar buildBusinessCar();
}
