package com.design.pattern.visitor.core;

/**
 * Visitor
 *
 * @author Wenzhou
 * @since 2023/5/26 15:57
 */
public interface Visitor {
    void visit(Rectangle rectangle);

    void visit(Circle circle);
}
