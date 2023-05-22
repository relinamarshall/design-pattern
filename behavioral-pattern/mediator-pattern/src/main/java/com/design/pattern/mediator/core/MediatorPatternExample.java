package com.design.pattern.mediator.core;

/**
 * MediatorPatternExample
 *
 * @author Wenzhou
 * @since 2023/5/22 13:53
 */
public class MediatorPatternExample {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.sendMessage("Hello, colleagueB!");
        colleagueB.sendMessage("Hi, colleagueA!");
    }
}
