package com.design.pattern.builder.core;

/**
 * TestBuilder
 *
 * @author Wenzhou
 * @since 2023/5/15 16:33
 */
public class TestBuilder {
    public static void main(String[] args) {
        ConcreateBuilder concreateBuilder = new ConcreateBuilder();
        Director director = new Director(concreateBuilder);

        Product product = director.construct();
        System.out.println(product.getA());
        System.out.println(product.getB());
        System.out.println(product.getC());
    }
}
