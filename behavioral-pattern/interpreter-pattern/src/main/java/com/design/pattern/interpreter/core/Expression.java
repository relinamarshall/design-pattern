package com.design.pattern.interpreter.core;

/**
 * Expression
 *
 * @author Wenzhou
 * @since 2023/5/30 14:42
 */
public interface Expression {
    int interpret(Context context);
}
