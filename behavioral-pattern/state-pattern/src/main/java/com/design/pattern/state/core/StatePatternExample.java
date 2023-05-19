package com.design.pattern.state.core;

/**
 * StatePatternExample
 *
 * @author Wenzhou
 * @since 2023/5/19 14:30
 */
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // 请求初始状态
        context.request();

        // 切换到另一个状态
        State newState = new ConcreteStateB();
        context.setState(newState);

        // 请求新状态
        context.request();
    }

}
