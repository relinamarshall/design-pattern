package com.design.pattern.abs.factory.example;

/**
 * BmwCarFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 16:04
 */
public class BmwCarFactory extends CarFactory{
    @Override
    public SportCar buildSportCar() {
        return new BmwSportCar();
    }

    @Override
    public BusinessCar buildBusinessCar() {
        return new BenzBusinessCar();
    }
}
