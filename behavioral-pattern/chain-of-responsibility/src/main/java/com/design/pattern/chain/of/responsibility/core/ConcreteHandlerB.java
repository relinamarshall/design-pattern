package com.design.pattern.chain.of.responsibility.core;

/**
 * ConcreteHandlerB
 *
 * @author Wenzhou
 * @since 2023/5/30 13:55
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.getClass().getName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
