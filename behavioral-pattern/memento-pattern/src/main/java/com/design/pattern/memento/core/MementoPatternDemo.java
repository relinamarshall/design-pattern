package com.design.pattern.memento.core;

/**
 * MementoPatternDemo
 *
 * @author Wenzhou
 * @since 2023/5/31 15:02
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("状态 #1");
        originator.setState("状态 #2");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("状态 #3");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("状态 #4");

        System.out.println("当前状态为 " + originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("第一次保存的状态为 " + originator.getState());
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("第二次保存的状态为 " + originator.getState());
    }
}
