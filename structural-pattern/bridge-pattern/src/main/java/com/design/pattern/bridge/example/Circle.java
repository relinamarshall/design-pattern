package com.design.pattern.bridge.example;

/**
 * Circle
 *
 * @author Wenzhou
 * @since 2023/5/23 14:50
 */
public class Circle extends Shape {

    private final int x;
    private final int y;
    private final int radius;

    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
