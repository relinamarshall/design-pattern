package com.design.pattern.abs.factory.example;

/**
 * BenzCarFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 16:05
 */
public class BenzCarFactory extends CarFactory{
    @Override
    public SportCar buildSportCar() {
        return new BenzSportCar();
    }

    @Override
    public BusinessCar buildBusinessCar() {
        return new BenzBusinessCar();
    }
}
