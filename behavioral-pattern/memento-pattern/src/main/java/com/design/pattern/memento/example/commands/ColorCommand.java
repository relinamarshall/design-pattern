package com.design.pattern.memento.example.commands;

import com.design.pattern.memento.example.Editor;
import com.design.pattern.memento.example.shapes.Shape;

import java.awt.Color;

/**
 * ColorCommand
 *
 * @author Wenzhou
 * @since 2023/6/1 11:04
 */
public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}