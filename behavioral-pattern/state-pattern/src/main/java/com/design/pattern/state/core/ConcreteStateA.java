package com.design.pattern.state.core;

/**
 * ConcreteStateA
 *
 * @author Wenzhou
 * @since 2023/5/19 14:23
 */
public class ConcreteStateA implements State{
    @Override
    public void handle() {
        System.out.println("当前状态为-A");
    }
}
