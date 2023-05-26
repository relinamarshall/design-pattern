package com.design.pattern.visitor.core;

/**
 * DrawingVisitor
 *
 * @author Wenzhou
 * @since 2023/5/26 15:59
 */
public class DrawingVisitor implements Visitor {

    @Override
    public void visit(Rectangle rectangle) {
        rectangle.draw();
    }

    @Override
    public void visit(Circle circle) {
        circle.draw();
    }
}