package com.design.pattern.abs.factory.example;

/**
 * AodiSportCar
 *
 * @author Wenzhou
 * @since 2023/5/15 15:59
 */
public class AodiSportCar extends SportCar {
    @Override
    public void show() {
        System.out.println("奥迪跑车");
    }

    @Override
    public boolean isStrong() {
        return true;
    }
}
