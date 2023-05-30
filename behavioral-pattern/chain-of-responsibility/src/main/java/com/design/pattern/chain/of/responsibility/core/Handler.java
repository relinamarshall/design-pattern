package com.design.pattern.chain.of.responsibility.core;

/**
 * Handler
 *
 * @author Wenzhou
 * @since 2023/5/30 13:52
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
