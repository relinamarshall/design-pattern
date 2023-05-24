package com.design.pattern.decorator.example;

/**
 * WristEquip
 * <p>
 * 护腕
 * <p>
 * 攻击力: 5
 *
 * @author Wenzhou
 * @since 2023/5/24 15:59
 */
public class WristEquip implements IEquip {
    @Override
    public int calcAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}
