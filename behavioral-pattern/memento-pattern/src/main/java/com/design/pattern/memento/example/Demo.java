package com.design.pattern.memento.example;

import com.design.pattern.memento.example.shapes.Circle;
import com.design.pattern.memento.example.shapes.CompoundShape;
import com.design.pattern.memento.example.shapes.Dot;
import com.design.pattern.memento.example.shapes.Rectangle;

import java.awt.Color;

/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/1 11:22
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
