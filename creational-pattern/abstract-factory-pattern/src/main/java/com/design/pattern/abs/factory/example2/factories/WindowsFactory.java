package com.design.pattern.abs.factory.example2.factories;

import com.design.pattern.abs.factory.example2.buttons.Button;
import com.design.pattern.abs.factory.example2.buttons.WindowsButton;
import com.design.pattern.abs.factory.example2.checkboxes.Checkbox;
import com.design.pattern.abs.factory.example2.checkboxes.WindowsCheckbox;

/**
 * WindowsFactory
 *
 * @author Wenzhou
 * @since 2023/6/6 15:18
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
