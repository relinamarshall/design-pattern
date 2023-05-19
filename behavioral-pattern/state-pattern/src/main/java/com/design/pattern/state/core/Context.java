package com.design.pattern.state.core;

/**
 * Context
 *
 * @author Wenzhou
 * @since 2023/5/19 14:23
 */
public class Context {
    private State currentState;

    public Context() {
        // 初始状态为 A
        currentState = new ConcreteStateA();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void request() {
        currentState.handle();
    }
}
