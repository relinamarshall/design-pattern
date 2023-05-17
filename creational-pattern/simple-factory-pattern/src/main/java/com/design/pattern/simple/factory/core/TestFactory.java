package com.design.pattern.simple.factory.core;

/**
 * TestFactory
 *
 * @author Wenzhou
 * @since 2023/5/17 13:42
 */
public class TestFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product a = factory.createProduct("A");
        a.use();

        Product b = factory.createProduct("B");
        b.use();
    }
}
