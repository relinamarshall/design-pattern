package com.design.pattern.strategy.example;

/**
 * DefendTBS
 *
 * @author Wenzhou
 * @since 2023/5/16 9:48
 */
public class DefendTBS implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("铁布衫");
    }
}
