package com.design.pattern.abs.factory.core;

/**
 * TestAbstractFactory
 *
 * @author Wenzhou
 * @since 2023/5/17 14:00
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        productA1.use();
        productB1.eat();

        ConcreteFactory2 factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();
        productA2.use();
        productB2.eat();
    }
}
