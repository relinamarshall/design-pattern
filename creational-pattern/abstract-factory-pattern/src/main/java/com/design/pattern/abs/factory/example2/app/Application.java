package com.design.pattern.abs.factory.example2.app;

import com.design.pattern.abs.factory.example2.buttons.Button;
import com.design.pattern.abs.factory.example2.checkboxes.Checkbox;
import com.design.pattern.abs.factory.example2.factories.GUIFactory;


/**
 * Application
 *
 * @author Wenzhou
 * @since 2023/6/6 15:38
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
