package com.design.pattern.abs.factory.core;

/**
 * ConcreteFactory1
 *
 * @author Wenzhou
 * @since 2023/5/17 13:59
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
