package com.design.pattern.bridge.example;

/**
 * Shape
 *
 * @author Wenzhou
 * @since 2023/5/23 14:48
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
