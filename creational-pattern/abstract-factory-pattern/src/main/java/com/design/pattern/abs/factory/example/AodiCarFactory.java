package com.design.pattern.abs.factory.example;

/**
 * AodiCarFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 16:04
 */
public class AodiCarFactory extends CarFactory{
    @Override
    public SportCar buildSportCar() {
        return new AodiSportCar();
    }

    @Override
    public BusinessCar buildBusinessCar() {
        return new AodiBusinessCar();
    }
}
