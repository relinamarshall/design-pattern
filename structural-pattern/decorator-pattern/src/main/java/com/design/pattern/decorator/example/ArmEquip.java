package com.design.pattern.decorator.example;

/**
 * ArmEquip
 * <p>
 * 武器
 * <p>
 * 攻击力 20
 *
 * @author Wenzhou
 * @since 2023/5/24 15:57
 */
public class ArmEquip implements IEquip {

    @Override
    public int calcAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙宝刀";
    }
}
