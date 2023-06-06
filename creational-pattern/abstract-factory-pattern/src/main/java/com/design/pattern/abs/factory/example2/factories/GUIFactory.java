package com.design.pattern.abs.factory.example2.factories;

import com.design.pattern.abs.factory.example2.buttons.Button;
import com.design.pattern.abs.factory.example2.checkboxes.Checkbox;

/**
 * GUIFactory
 *
 * @author Wenzhou
 * @since 2023/6/6 15:17
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
