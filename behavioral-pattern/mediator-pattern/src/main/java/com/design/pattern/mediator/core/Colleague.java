package com.design.pattern.mediator.core;

/**
 * Colleague
 *
 * @author Wenzhou
 * @since 2023/5/22 11:28
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message);

    public abstract void sendMessage(String message);
}
