package com.design.pattern.prototype.core;

/**
 * Circle
 *
 * @author Wenzhou
 * @since 2023/5/16 9:10
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("---Inside Circle::draw() method.");
    }
}
