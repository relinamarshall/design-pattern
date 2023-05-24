package com.design.pattern.decorator.example;

/**
 * RedGemDecorator
 * <p>
 * 红宝石装饰品
 * <p>
 * 每颗攻击力: +15
 * <p>
 * 这与武器等不同,它是可以累加的,而武器不能
 *
 * @author Wenzhou
 * @since 2023/5/24 15:55
 */
public class RedGemDecorator implements IEquipDecorator {
    private IEquip iEquip;

    public RedGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int calcAttack() {
        return 15 + iEquip.calcAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + " + 红宝石";
    }
}
