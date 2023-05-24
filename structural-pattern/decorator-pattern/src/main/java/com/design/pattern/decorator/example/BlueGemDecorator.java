package com.design.pattern.decorator.example;

/**
 * BlueGemDecorator
 * <p>
 * 蓝宝石装饰品
 * <p>
 * 每颗攻击力: +5
 * <p>
 * 这与武器等不同,它是可以累加的,而武器不能
 *
 * @author Wenzhou
 * @since 2023/5/24 15:53
 */
public class BlueGemDecorator implements IEquipDecorator {

    private IEquip iEquip;

    public BlueGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int calcAttack() {
        return 5 + iEquip.calcAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + " + 蓝宝石";
    }
}
