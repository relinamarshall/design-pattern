package com.design.pattern.state.example2;

/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/1 10:51
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
