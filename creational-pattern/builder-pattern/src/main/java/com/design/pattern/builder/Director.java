package com.design.pattern.builder;

/**
 * Director
 *
 * @author Wenzhou
 * @since 2023/5/15 16:32
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.create();
    }
}
