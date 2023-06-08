package com.design.pattern.builder.core;

/**
 * @author Wenzhou
 * @since 2023/5/15 16:26
 */
public class ConcreateBuilder extends Builder {
    @Override
    public void buildPartA() {
        product.setA("A部件");
    }

    @Override
    public void buildPartB() {
        product.setB("B部件");

    }

    @Override
    public void buildPartC() {
        product.setC("C部件");

    }

    @Override
    public Product create() {
        return product;
    }
}
