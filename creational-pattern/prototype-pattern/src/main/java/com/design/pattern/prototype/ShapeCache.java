package com.design.pattern.prototype;

import java.util.Hashtable;

/**
 * ShapeCache
 *
 * @author Wenzhou
 * @since 2023/5/16 9:13
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape shapeCache = shapeMap.get(id);
        return (Shape) shapeCache.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
