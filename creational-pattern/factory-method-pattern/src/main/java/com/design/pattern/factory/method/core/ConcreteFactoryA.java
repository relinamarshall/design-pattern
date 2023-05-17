package com.design.pattern.factory.method.core;

/**
 * ConcreteFactoryA
 *
 * @author Wenzhou
 * @since 2023/5/17 13:48
 */
public class ConcreteFactoryA extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
