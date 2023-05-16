package com.design.pattern.strategy.core;

/**
 * TestContext
 *
 * @author Wenzhou
 * @since 2023/5/16 9:32
 */
public class TestContext {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.algorithm();

        context.setStrategy(new ConcreteStrategyB());
        context.algorithm();
    }
}
