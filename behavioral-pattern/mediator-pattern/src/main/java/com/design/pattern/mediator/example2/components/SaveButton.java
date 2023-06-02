package com.design.pattern.mediator.example2.components;


import com.design.pattern.mediator.example2.mediator.Mediator;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * SaveButton
 * <p>
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 *
 * @author Wenzhou
 * @since 2023/6/1 13:38
 */
public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
