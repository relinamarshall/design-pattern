package com.design.pattern.visitor.core;

/**
 * Circle
 *
 * @author Wenzhou
 * @since 2023/5/26 15:58
 */
public class Circle implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void draw() {
        System.out.println("画圆形");
    }
}
