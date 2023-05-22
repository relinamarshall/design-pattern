package com.design.pattern.command.example;

/**
 * LightOffCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:28
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}