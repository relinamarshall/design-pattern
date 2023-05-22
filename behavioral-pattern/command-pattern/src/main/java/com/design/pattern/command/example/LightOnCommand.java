package com.design.pattern.command.example;

/**
 * LightOnCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:29
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}