package com.design.pattern.chain.of.responsibility.core;

/**
 * ConcreteHandlerA
 *
 * @author Wenzhou
 * @since 2023/5/30 13:53
 */
public class ConcreteHandlerA  extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
