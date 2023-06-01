package com.design.pattern.memento.core;

/**
 * Memento
 *
 * @author Wenzhou
 * @since 2023/5/31 15:01
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
