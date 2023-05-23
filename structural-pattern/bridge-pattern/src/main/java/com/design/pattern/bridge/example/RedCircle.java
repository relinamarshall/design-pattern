package com.design.pattern.bridge.example;

/**
 * RedCircle
 *
 * @author Wenzhou
 * @since 2023/5/23 14:50
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}