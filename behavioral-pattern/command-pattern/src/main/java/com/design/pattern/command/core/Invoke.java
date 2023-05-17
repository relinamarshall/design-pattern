package com.design.pattern.command.core;

/**
 * Invoke
 *
 * @author Wenzhou
 * @since 2023/5/17 16:00
 */
public class Invoke {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
