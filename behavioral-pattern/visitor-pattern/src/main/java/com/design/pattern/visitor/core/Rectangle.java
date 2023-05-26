package com.design.pattern.visitor.core;

/**
 * Rectangle
 *
 * @author Wenzhou
 * @since 2023/5/26 15:57
 */
public class Rectangle implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void draw() {
        System.out.println("画矩形");
    }
}
