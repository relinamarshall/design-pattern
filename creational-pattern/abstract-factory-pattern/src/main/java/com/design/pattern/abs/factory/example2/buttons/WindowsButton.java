package com.design.pattern.abs.factory.example2.buttons;

/**
 * WindowsButton
 *
 * @author Wenzhou
 * @since 2023/6/6 15:16
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
