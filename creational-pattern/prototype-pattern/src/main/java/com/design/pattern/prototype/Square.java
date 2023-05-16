package com.design.pattern.prototype;

/**
 * Square
 *
 * @author Wenzhou
 * @since 2023/5/16 9:12
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("---Inside Square::draw() method.");
    }
}
