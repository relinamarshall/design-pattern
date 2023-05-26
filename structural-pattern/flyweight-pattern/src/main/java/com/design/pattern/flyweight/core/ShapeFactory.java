package com.design.pattern.flyweight.core;

import java.util.HashMap;

/**
 * ShapeFactory
 *
 * @author Wenzhou
 * @since 2023/5/26 15:44
 */
public class ShapeFactory {
    private ShapeFactory() {

    }

    private static final HashMap<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String color) {
        // 先从缓存中获取相应的对象，如果不存在，则创建一个新的对象，并放入缓存中
        Shape shape = shapes.get(color);
        if (shape == null) {
            shape = new Circle(color);
            shapes.put(color, shape);
        }
        return shape;
    }
}
