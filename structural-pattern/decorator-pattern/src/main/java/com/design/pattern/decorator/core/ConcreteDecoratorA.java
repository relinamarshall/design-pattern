package com.design.pattern.decorator.core;

/**
 * ConcreteDecoratorA
 *
 * @author Wenzhou
 * @since 2023/5/24 15:46
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehaviorA();
    }

    private void addBehaviorA() {
        System.out.println("为具体组件添加行为 A");
    }
}
