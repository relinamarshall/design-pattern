package com.design.pattern.bridge.example;

/**
 * GreenCircle
 *
 * @author Wenzhou
 * @since 2023/5/23 14:49
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}