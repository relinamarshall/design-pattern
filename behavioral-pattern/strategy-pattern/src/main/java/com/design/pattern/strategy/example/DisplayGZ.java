package com.design.pattern.strategy.example;

/**
 * DisplayGZ
 *
 * @author Wenzhou
 * @since 2023/5/16 9:40
 */
public class DisplayGZ implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("古装");
    }
}
