package com.design.pattern.mediator.example2.components;


import com.design.pattern.mediator.example2.mediator.Mediator;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * DeleteButton
 * <p>
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 *
 * @author Wenzhou
 * @since 2023/6/1 13:36
 */
public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
