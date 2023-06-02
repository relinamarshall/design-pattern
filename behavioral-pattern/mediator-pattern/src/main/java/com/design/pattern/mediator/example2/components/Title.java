package com.design.pattern.mediator.example2.components;


import com.design.pattern.mediator.example2.mediator.Mediator;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;


/**
 * Title
 * <p>
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 *
 * @author Wenzhou
 * @since 2023/6/1 13:39
 */
public class Title extends JTextField implements Component {
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
        return "Title";
    }
}
