package com.design.pattern.command.example;

/**
 * ControlPanel
 *
 * @author Wenzhou
 * @since 2023/5/22 16:30
 */
public class ControlPanel {
    private static final int CONTROL_SIZE = 9;

    private Command[] commands;

    public ControlPanel() {
        commands = new Command[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands[i] = new NoCommand();
        }
        /**
         * 三个家电
         */
        Door door = new Door();
        Light light = new Light();
        Computer computer = new Computer();

        /**
         * 一个控制器,假设是我们的APP界面
         */
        setCommands(0, new DoorOpenCommand(door));// 开门
        setCommands(3, new DoorCloseCommand(door));// 关门
        setCommands(1, new LightOnCommand(light));// 开灯
        setCommands(4, new LightOffCommand(light));// 关灯
        setCommands(2, new ComputerOnCommand(computer));// 开电脑
        setCommands(5, new ComputerOffCommand(computer));// 关电脑
        // controlPanel.keyPressed(8);//这个没有设置命令,但不会出问题,因为我们的NoCommand的功劳

        QuickCommand quickOpenCommand = new QuickCommand(new Command[]{new LightOnCommand(light), new ComputerOnCommand(computer), new DoorOpenCommand(door)});
        QuickCommand quickCloseCommand = new QuickCommand(new Command[]{new LightOffCommand(light), new ComputerOffCommand(computer), new DoorCloseCommand(door)});
        setCommands(6, quickOpenCommand);
        setCommands(7, quickCloseCommand);
    }

    /**
     * 设置每个按钮对应的位置
     */
    public void setCommands(int index, Command command) {
        commands[index] = command;
    }

    /**
     * 模拟点击按钮
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }
}
