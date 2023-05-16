package com.design.pattern.strategy.core;

/**
 * ConcreateStrategyA
 *
 * @author Wenzhou
 * @since 2023/5/16 9:31
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void algorithm() {
        System.out.println("策略-A");
    }
}
