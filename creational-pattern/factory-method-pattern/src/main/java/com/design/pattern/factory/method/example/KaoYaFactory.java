package com.design.pattern.factory.method.example;

/**
 * XiAnRouJiaFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 15:07
 */
public class KaoYaFactory extends FoodFactory {
    @Override
    public KaoYa buildFood() {
        return new KaoYa();
    }
}
