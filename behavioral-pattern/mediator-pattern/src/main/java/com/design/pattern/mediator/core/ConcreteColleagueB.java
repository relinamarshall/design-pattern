package com.design.pattern.mediator.core;

/**
 * ConcreteColleagueB
 *
 * @author Wenzhou
 * @since 2023/5/22 13:51
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("ConcreteColleagueB 接收到消息：" + message);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("ConcreteColleagueB 发送消息：" + message);
        mediator.sendMessage(message, this);
    }
}
