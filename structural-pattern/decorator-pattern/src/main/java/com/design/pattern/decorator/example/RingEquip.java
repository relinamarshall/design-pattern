package com.design.pattern.decorator.example;

/**
 * RingEquip
 * <p>
 * 戒指
 * <p>
 * 攻击力 5
 *
 * @author Wenzhou
 * @since 2023/5/24 15:58
 */
public class RingEquip implements IEquip {
    @Override
    public int calcAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
