package com.design.pattern.builder;

/**
 * Builder
 *
 * @author Wenzhou
 * @since 2023/5/15 16:20
 */
public abstract class Builder {
    protected final Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public abstract Product create();
}
