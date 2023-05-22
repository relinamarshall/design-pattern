package com.design.pattern.command.example;

/**
 * ComputerOffCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:29
 */
public class ComputerOffCommand implements Command {

    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}