package com.design.pattern.abs.factory.core;

/**
 * ConcreteFactory2
 *
 * @author Wenzhou
 * @since 2023/5/17 14:00
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }

}
