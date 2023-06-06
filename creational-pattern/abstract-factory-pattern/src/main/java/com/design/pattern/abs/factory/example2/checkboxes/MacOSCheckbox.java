package com.design.pattern.abs.factory.example2.checkboxes;

/**
 * MacOSCheckbox
 *
 * @author Wenzhou
 * @since 2023/6/6 15:16
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
