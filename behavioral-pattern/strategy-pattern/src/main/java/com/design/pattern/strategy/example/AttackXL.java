package com.design.pattern.strategy.example;

/**
 * AttackXL
 *
 * @author Wenzhou
 * @since 2023/5/16 9:46
 */
public class AttackXL implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("降龙十八掌");
    }
}
