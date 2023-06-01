package com.design.pattern.memento.core;

/**
 * Originator
 *
 * @author Wenzhou
 * @since 2023/5/31 15:01
 */
public class Originator {
    private String state;

    public void setState(String state) {
        System.out.println("设置状态为 " + state);
        this.state = state;
    }

    public Memento saveStateToMemento() {
        System.out.println("保存状态到 Memento");
        return new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("从 Memento 恢复状态为 " + state);
    }
}
