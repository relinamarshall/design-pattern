package com.design.pattern.command.example;

/**
 * NoCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:27
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("哥们,这个没效!");
    }
}