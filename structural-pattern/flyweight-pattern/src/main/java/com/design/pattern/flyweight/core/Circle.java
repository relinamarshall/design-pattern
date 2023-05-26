package com.design.pattern.flyweight.core;

/**
 * Circle
 *
 * @author Wenzhou
 * @since 2023/5/26 15:45
 */
public class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画" + color + "色的圆形");
    }
}
