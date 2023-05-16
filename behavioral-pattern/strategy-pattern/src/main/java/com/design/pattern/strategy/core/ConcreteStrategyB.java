package com.design.pattern.strategy.core;

/**
 * ConcreateStrategyB
 *
 * @author Wenzhou
 * @since 2023/5/16 9:31
 */
public class ConcreteStrategyB extends Strategy{
    @Override
    public void algorithm() {
        System.out.println("策略-B");
    }
}
