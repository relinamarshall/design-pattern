package com.design.pattern.bridge.example;

/**
 * TestDrawShape
 *
 * @author Wenzhou
 * @since 2023/5/23 14:51
 */
public class TestDrawShape {
    public static void main(String[] args) {
        Circle circle1 = new Circle(20, 20, 100, new GreenCircle());
        circle1.draw();

        Circle circle2 = new Circle(20, 20, 100, new RedCircle());
        circle2.draw();
    }
}
