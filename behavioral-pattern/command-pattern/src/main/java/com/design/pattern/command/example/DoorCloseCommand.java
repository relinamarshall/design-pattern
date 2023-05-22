package com.design.pattern.command.example;

/**
 * DoorCloseCommand
 *
 * @author Wenzhou
 * @since 2023/5/22 16:29
 */
public class DoorCloseCommand implements Command {

    private Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}