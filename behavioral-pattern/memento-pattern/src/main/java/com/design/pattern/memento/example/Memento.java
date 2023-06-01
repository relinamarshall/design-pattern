package com.design.pattern.memento.example;

/**
 * Memento
 *
 * @author Wenzhou
 * @since 2023/6/1 11:04
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
