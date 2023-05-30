package com.design.pattern.chain.of.responsibility.core;

/**
 * ConcreteHandlerC
 *
 * @author Wenzhou
 * @since 2023/5/30 13:55
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.getClass().getName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
