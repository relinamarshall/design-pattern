package com.design.pattern.factory.method.core;

/**
 * ConcreteFactoryB
 *
 * @author Wenzhou
 * @since 2023/5/17 13:48
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
