package com.design.pattern.chain.of.responsibility.core;

/**
 * Client
 *
 * @author Wenzhou
 * @since 2023/5/30 13:55
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}
