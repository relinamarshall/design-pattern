package com.design.pattern.visitor.core;

/**
 * VisitorPatternDemo
 *
 * @author Wenzhou
 * @since 2023/5/26 15:59
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Rectangle());
        objectStructure.attach(new Circle());

        Visitor drawingVisitor = new DrawingVisitor();

        objectStructure.accept(drawingVisitor);
    }
}
