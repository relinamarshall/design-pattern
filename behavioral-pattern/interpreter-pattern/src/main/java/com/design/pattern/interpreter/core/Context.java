package com.design.pattern.interpreter.core;

/**
 * Context
 *
 * @author Wenzhou
 * @since 2023/5/30 14:43
 */
public class Context {
    private String input;
    private int output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
