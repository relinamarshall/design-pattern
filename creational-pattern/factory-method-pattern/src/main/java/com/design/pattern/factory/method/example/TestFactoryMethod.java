package com.design.pattern.factory.method.example;

/**
 * TestFactoryMethod
 *
 * @author Wenzhou
 * @since 2023/5/15 15:14
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        KaoYaFactory xiAnRouJiaFactory = new KaoYaFactory();
        sellRouJiaMo(xiAnRouJiaFactory.buildFood());

        RouJiaMoFactory hangZhouRouJiaMoFactory = new RouJiaMoFactory();
        sellRouJiaMo(hangZhouRouJiaMoFactory.buildFood());
    }

    private static void sellRouJiaMo(Food food) {
        if (food == null) {
            return;
        }
        food.make();
    }
}
