package com.design.pattern.mediator.core;

/**
 * ConcreteMediator
 *
 * @author Wenzhou
 * @since 2023/5/22 13:53
 */
public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.receiveMessage(message);
        } else if (colleague == colleagueB) {
            colleagueA.receiveMessage(message);
        }
    }
}
