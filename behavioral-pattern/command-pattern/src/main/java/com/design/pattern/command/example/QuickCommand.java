package com.design.pattern.command.example;

/**
 * QuickCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:28
 */
public class QuickCommand implements Command {

    private Command[] commands;

    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}