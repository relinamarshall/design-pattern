package com.design.pattern.bridge.core;

/**
 * Abstraction
 *
 * @author Wenzhou
 * @since 2023/5/23 14:43
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
