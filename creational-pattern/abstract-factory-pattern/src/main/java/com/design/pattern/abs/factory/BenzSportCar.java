package com.design.pattern.abs.factory;

/**
 * BenzSportCar
 *
 * @author Wenzhou
 * @since 2023/5/15 15:58
 */
public class BenzSportCar extends SportCar {

    @Override
    public void show() {
        System.out.println("奔驰跑车");
    }

    @Override
    public boolean isStrong() {
        return false;
    }
}
