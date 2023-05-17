package com.design.pattern.abs.factory.example;

/**
 * AodiBusinessCar
 *
 * @author Wenzhou
 * @since 2023/5/15 16:02
 */
public class AodiBusinessCar extends BusinessCar{
    @Override
    public boolean isAutoDoor() {
        return false;
    }

    @Override
    public void show() {
        System.out.println("奥迪商务车");
    }
}
