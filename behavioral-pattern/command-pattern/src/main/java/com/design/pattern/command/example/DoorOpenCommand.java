package com.design.pattern.command.example;

/**
 * DoorOpenCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:29
 */
public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}