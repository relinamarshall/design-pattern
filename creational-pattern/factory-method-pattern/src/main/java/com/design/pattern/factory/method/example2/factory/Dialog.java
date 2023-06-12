package com.design.pattern.factory.method.example2.factory;

import com.design.pattern.factory.method.example2.buttons.Button;

/**
 * Dialog
 *
 * @author Wenzhou
 * @since 2023/6/12 10:48
 */
public interface Dialog {
    default void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    Button createButton();
}
