package com.design.pattern.simple.factory.core;

/**
 * ConcreteProductA
 *
 * @author Wenzhou
 * @since 2023/5/17 13:40
 */
public class ConcreteProductA extends Product{
    @Override
    public void use() {
        System.out.println("A");
    }
}
