package com.design.pattern.command.example;

/**
 * TestControlPanel
 * <p>
 * 命令模式:
 * <p>
 * 定义：将"请求"封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 * <p>
 * 简化: 将请求封装成对象，将动作请求者和动作执行者解耦。
 * <p>
 * 命令模式的核心就是把命令封装成类，对于命令执行者不需要知道现在执行的具体是什么命令。
 * <p>
 * 假设现在有电视、电脑、电灯等家电，现在需要你做个遥控器控制所有家电的开关，
 * <p>
 * 要求做到每个按钮对应的功能供用户个性化，对于新买入家电要有非常强的扩展性。
 *
 * @author Wenzhou
 * @since 2023/5/22 16:30
 */
public class TestControlPanel {

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(6);
        controlPanel.keyPressed(7);
        controlPanel.keyPressed(8);
    }
}
