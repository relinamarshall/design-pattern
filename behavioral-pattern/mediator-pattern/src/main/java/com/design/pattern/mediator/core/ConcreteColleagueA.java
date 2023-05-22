package com.design.pattern.mediator.core;

/**
 * ConcreteColleagueA
 *
 * @author Wenzhou
 * @since 2023/5/22 13:51
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleagueA 接收到消息：" + message);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("ConcreteColleagueA 发送消息：" + message);
        mediator.sendMessage(message, this);
    }
}
