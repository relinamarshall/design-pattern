package com.design.pattern.mediator.core;

/**
 * Mediator
 *
 * @author Wenzhou
 * @since 2023/5/22 11:28
 */
public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
