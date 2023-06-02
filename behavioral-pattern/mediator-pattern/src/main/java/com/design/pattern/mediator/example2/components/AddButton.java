package com.design.pattern.mediator.example2.components;

import com.design.pattern.mediator.example2.mediator.Mediator;
import com.design.pattern.mediator.example2.mediator.Note;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 * AddButton
 * <p>
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 *
 * @author Wenzhou
 * @since 2023/6/1 13:36
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
