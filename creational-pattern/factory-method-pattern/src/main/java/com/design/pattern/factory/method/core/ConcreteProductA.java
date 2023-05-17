package com.design.pattern.factory.method.core;

/**
 * ConcreteProductA
 *
 * @author Wenzhou
 * @since 2023/5/17 13:47
 */
public class ConcreteProductA extends Product{

    @Override
    public void use() {
        System.out.println("A");
    }
}
