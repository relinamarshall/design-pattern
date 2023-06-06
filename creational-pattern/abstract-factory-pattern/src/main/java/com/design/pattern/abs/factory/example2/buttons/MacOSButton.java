package com.design.pattern.abs.factory.example2.buttons;

/**
 * MacOSButton
 *
 * @author Wenzhou
 * @since 2023/6/6 15:15
 */
public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
