package com.design.pattern.composite.example.shapes;

import java.awt.Graphics;

/**
 * Shape
 *
 * @author Wenzhou
 * @since 2023/6/14 14:54
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
