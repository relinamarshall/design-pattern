package com.design.pattern.factory.method.example;

/**
 * HangZhouRouJiaMoFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 14:57
 */
public class RouJiaMoFactory extends FoodFactory {
    @Override
    public RouJiaMo buildFood() {
        return new RouJiaMo();
    }
}
