package com.design.pattern.command.core;

/**
 * ConcreteCommand
 *
 * @author Wenzhou
 * @since 2023/5/17 15:58
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
