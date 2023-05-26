package com.design.pattern.flyweight.core;

/**
 * FlyweightPatternDemo
 *
 * @author Wenzhou
 * @since 2023/5/26 15:45
 */
public class FlyweightPatternDemo {
    private static final String[] colors = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Shape circle = ShapeFactory.getShape(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
