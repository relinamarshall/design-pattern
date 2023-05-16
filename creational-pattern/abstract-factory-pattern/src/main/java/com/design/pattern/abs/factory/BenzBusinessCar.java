package com.design.pattern.abs.factory;

/**
 * BenzBusinessCar
 *
 * @author Wenzhou
 * @since 2023/5/15 16:01
 */
public class BenzBusinessCar extends BusinessCar {
    @Override
    public boolean isAutoDoor() {
        return true;
    }

    @Override
    public void show() {
        System.out.println("奔驰商务车");
    }
}
