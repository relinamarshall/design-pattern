package com.design.pattern.composite.example;

import com.design.pattern.composite.example.editor.ImageEditor;
import com.design.pattern.composite.example.shapes.Circle;
import com.design.pattern.composite.example.shapes.CompoundShape;
import com.design.pattern.composite.example.shapes.Dot;
import com.design.pattern.composite.example.shapes.Rectangle;

import java.awt.Color;


/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/14 14:59
 */
public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

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
