package com.design.pattern.observer;

/**
 * TestObserver
 *
 * @author Wenzhou
 * @since 2023/5/16 10:52
 */
public class TestObserver {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.setState(5);

        System.out.println(subject.getState());
        System.out.println(observer.getObserverState());

        subject.deleteObserver(observer);
        subject.setState(1);

        System.out.println(subject.getState());
        System.out.println(observer.getObserverState());
    }
}
