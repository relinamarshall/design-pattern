package com.design.pattern.mediator.example2;

import com.design.pattern.mediator.example2.components.AddButton;
import com.design.pattern.mediator.example2.components.DeleteButton;
import com.design.pattern.mediator.example2.components.Filter;
import com.design.pattern.mediator.example2.components.List;
import com.design.pattern.mediator.example2.components.SaveButton;
import com.design.pattern.mediator.example2.components.TextBox;
import com.design.pattern.mediator.example2.components.Title;
import com.design.pattern.mediator.example2.mediator.Editor;
import com.design.pattern.mediator.example2.mediator.Mediator;

import javax.swing.DefaultListModel;

/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/1 17:19
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
