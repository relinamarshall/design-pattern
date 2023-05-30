package com.design.pattern.interpreter.core;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Client
 *
 * @author Wenzhou
 * @since 2023/5/30 15:08
 */
public class Client {
    public static void main(String[] args) {
        String expression = "1 + 2 + 3 + 4 + 5 + 6";
        Context context = new Context(expression);

        List<Expression> tree = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(expression);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equals("+")) {
                tree.add(new PlusExpression(tree.remove(tree.size() - 1),
                        new NumberExpression(Integer.parseInt(tokenizer.nextToken()))));
            } else {
                tree.add(new NumberExpression(Integer.parseInt(token)));
            }
        }

        tree.get(0).interpret(context);

        System.out.println(expression + " = " + context.getOutput());
    }
}
