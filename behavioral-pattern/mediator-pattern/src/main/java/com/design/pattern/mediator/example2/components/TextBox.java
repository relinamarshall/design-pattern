package com.design.pattern.mediator.example2.components;


import com.design.pattern.mediator.example2.mediator.Mediator;

import java.awt.event.KeyEvent;

import javax.swing.JTextArea;

/**
 * TextBox
 *
 * @author Wenzhou
 * @since 2023/6/1 13:38
 */
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
