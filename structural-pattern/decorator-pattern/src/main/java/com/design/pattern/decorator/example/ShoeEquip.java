package com.design.pattern.decorator.example;

/**
 * ShoeEquip
 * <p>
 * 鞋子
 * <p>
 * 攻击力: 5
 *
 * @author Wenzhou
 * @since 2023/5/24 15:59
 */
public class ShoeEquip implements IEquip {
    @Override
    public int calcAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战靴子";
    }
}
