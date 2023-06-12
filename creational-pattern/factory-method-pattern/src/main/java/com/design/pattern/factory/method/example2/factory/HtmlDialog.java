package com.design.pattern.factory.method.example2.factory;

import com.design.pattern.factory.method.example2.buttons.Button;
import com.design.pattern.factory.method.example2.buttons.HtmlButton;

/**
 * HtmlDialog
 *
 * @author Wenzhou
 * @since 2023/6/12 10:48
 */
public class HtmlDialog implements Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
