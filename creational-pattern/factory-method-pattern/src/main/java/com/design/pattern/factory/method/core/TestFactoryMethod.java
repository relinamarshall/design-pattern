package com.design.pattern.factory.method.core;

/**
 * TestFactoryMethod
 *
 * @author Wenzhou
 * @since 2023/5/17 13:49
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        ConcreteFactoryA factoryA = new ConcreteFactoryA();
        Product a = factoryA.factoryMethod();
        a.use();

        ConcreteFactoryB factoryB = new ConcreteFactoryB();
        Product b = factoryB.factoryMethod();
        b.use();
    }
}
