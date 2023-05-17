package com.design.pattern.simple.factory.core;

/**
 * Factory
 *
 * @author Wenzhou
 * @since 2023/5/17 13:40
 */
public class Factory {

    public Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ConcreteProductA();
        }
        if ("B".equals(type)) {
            return new ConcreteProductB();
        }

        return null;
    }
}
