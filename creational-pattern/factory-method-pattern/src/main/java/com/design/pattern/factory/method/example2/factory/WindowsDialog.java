package com.design.pattern.factory.method.example2.factory;

import com.design.pattern.factory.method.example2.buttons.Button;
import com.design.pattern.factory.method.example2.buttons.WindowsButton;

/**
 * WindowsDialog
 *
 * @author Wenzhou
 * @since 2023/6/12 13:59
 */
public class WindowsDialog implements Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
