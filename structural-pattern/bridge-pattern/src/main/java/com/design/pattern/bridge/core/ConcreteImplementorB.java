package com.design.pattern.bridge.core;

/**
 * ConcreteImplementorB
 *
 * @author Wenzhou
 * @since 2023/5/23 14:43
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现类 B 的操作");
    }
}
