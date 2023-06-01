package com.design.pattern.memento.example.shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Circle
 *
 * @author Wenzhou
 * @since 2023/6/1 11:06
 */
public class Circle extends BaseShape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
