package com.design.pattern.prototype.core;

/**
 * TestShape
 *
 * @author Wenzhou
 * @since 2023/5/16 9:16
 */
public class TestShape {
    static {
        ShapeCache.loadCache();
    }

    public static void main(String[] args) {
        Shape shape = ShapeCache.getShape("1");
        shape.draw();

        Shape shape2 = ShapeCache.getShape("2");
        shape2.draw();

        Shape shape3 = ShapeCache.getShape("1");
        System.out.println(shape3.equals(shape));

    }
}
