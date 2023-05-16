package com.design.pattern.strategy.core;

/**
 * Context
 *
 * @author Wenzhou
 * @since 2023/5/16 9:29
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
