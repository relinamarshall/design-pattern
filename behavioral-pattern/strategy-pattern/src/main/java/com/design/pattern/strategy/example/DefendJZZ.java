package com.design.pattern.strategy.example;

/**
 * DefendJZZ
 *
 * @author Wenzhou
 * @since 2023/5/16 9:47
 */
public class DefendJZZ implements IDefendBehavior {

    @Override
    public void defend() {
        System.out.println("金钟罩");
    }
}
