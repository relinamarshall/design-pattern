package com.design.pattern.abs.factory.example;

/**
 * BmwSportCar
 *
 * @author Wenzhou
 * @since 2023/5/15 16:00
 */
public class BmwSportCar extends SportCar {
    @Override
    public void show() {
        System.out.println("宝马跑车");
    }

    @Override
    public boolean isStrong() {
        return true;
    }
}
