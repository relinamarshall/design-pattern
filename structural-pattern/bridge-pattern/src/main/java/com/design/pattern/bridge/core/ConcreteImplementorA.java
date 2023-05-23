package com.design.pattern.bridge.core;

/**
 * ConcreteImplementorA
 *
 * @author Wenzhou
 * @since 2023/5/23 14:43
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现类 A 的操作");
    }
}