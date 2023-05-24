package com.design.pattern.decorator.core;

/**
 * ConcreteDecoratorB
 *
 * @author Wenzhou
 * @since 2023/5/24 15:47
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehaviorB();
    }

    private void addBehaviorB() {
        System.out.println("为具体组件添加行为 B");
    }
}
