package com.design.pattern.interpreter.core;

/**
 * PlusExpression
 *
 * @author Wenzhou
 * @since 2023/5/30 15:07
 */
public class PlusExpression implements Expression{
    private Expression left;
    private Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        int r = left.interpret(context) + right.interpret(context);
        context.setOutput(r);
        return r;
    }
}
