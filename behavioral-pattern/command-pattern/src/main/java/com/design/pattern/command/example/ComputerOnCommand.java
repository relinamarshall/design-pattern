package com.design.pattern.command.example;

/**
 * ComputerOnCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:30
 */
public class ComputerOnCommand implements Command {

    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}