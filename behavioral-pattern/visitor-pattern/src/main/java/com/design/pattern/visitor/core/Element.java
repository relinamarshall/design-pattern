package com.design.pattern.visitor.core;

/**
 * Element
 *
 * @author Wenzhou
 * @since 2023/5/26 15:57
 */
public interface Element {
    void accept(Visitor visitor);
}
