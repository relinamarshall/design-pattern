package com.design.pattern.abs.factory.example2.factories;

import com.design.pattern.abs.factory.example2.buttons.Button;
import com.design.pattern.abs.factory.example2.buttons.MacOSButton;
import com.design.pattern.abs.factory.example2.checkboxes.Checkbox;
import com.design.pattern.abs.factory.example2.checkboxes.MacOSCheckbox;

/**
 * MacOSFactory
 *
 * @author Wenzhou
 * @since 2023/6/6 15:18
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
