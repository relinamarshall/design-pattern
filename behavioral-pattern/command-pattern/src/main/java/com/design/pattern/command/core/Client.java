package com.design.pattern.command.core;

/**
 * Client
 *
 * @author Wenzhou
 * @since 2023/5/17 15:57
 */
public class Client {
    public static void main(String[] args) {
        // 接收者
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand();
        concreteCommand.setReceiver(receiver);

        // 调用者
        Invoke invoke = new Invoke();
        invoke.setCommand(concreteCommand);
        invoke.executeCommand();
    }
}
