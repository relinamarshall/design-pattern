package com.design.pattern.bridge.core;

/**
 * RefinedAbstraction
 *
 * @author Wenzhou
 * @since 2023/5/23 14:44
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象类的操作");
        implementor.operationImpl();
    }
}