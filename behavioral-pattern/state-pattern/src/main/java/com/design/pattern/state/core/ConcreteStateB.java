package com.design.pattern.state.core;

/**
 * ConcreteStateB
 *
 * @author Wenzhou
 * @since 2023/5/19 14:23
 */
public class ConcreteStateB implements State{
    @Override
    public void handle() {
        System.out.println("当前状态为-B");
    }
}
