package com.design.pattern.abs.factory;

/**
 * BmwBusinessCar
 *
 * @author Wenzhou
 * @since 2023/5/15 16:02
 */
public class BmwBusinessCar extends BusinessCar {
    @Override
    public boolean isAutoDoor() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("宝马商务车");
    }
}
