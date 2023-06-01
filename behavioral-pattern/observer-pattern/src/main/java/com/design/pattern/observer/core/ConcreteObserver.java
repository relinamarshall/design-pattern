package com.design.pattern.observer.core;

/**
 * ConcreteObserver
 *
 * @author Wenzhou
 * @since 2023/5/16 10:31
 */
public class ConcreteObserver extends Observer {
    private int observerState;

    @Override
    protected void update(Subject subject) {
        this.observerState = ((ConcreteSubject) subject).getState();
    }

    public int getObserverState() {
        return observerState;
    }
}
