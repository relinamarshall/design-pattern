package com.design.pattern.observer.core;

/**
 * ConcreteSubject
 *
 * @author Wenzhou
 * @since 2023/5/16 10:30
 */
public class ConcreteSubject extends Subject<Observer> {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer... o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : oList) {
            o.update(this);
        }
    }
}
