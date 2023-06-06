package com.design.pattern.abs.factory.example2.checkboxes;

/**
 * WindowsCheckbox
 *
 * @author Wenzhou
 * @since 2023/6/6 15:17
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
