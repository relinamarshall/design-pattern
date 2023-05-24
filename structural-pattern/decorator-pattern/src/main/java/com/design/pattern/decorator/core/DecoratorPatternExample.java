package com.design.pattern.decorator.core;

/**
 * DecoratorPatternExample
 *
 * @author Wenzhou
 * @since 2023/5/24 15:47
 */
public class DecoratorPatternExample {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        Component decoratedComponentA = new ConcreteDecoratorA(component);
        decoratedComponentA.operation();

        Component decoratedComponentB = new ConcreteDecoratorB(component);
        decoratedComponentB.operation();
    }
}
