package com.design.pattern.interpreter.core;

/**
 * NumberExpression
 *
 * @author Wenzhou
 * @since 2023/5/30 14:43
 */
public class NumberExpression implements Expression{
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret(Context context) {
        return number;
    }
}
