package com.design.pattern.decorator.example;

/**
 * YellowGemDecorator
 * <p>
 * 黄宝石装饰品
 * <p>
 * 每颗攻击力: +10
 * <p>
 * 这与武器等不同,它是可以累加的,而武器不能
 *
 * @author Wenzhou
 * @since 2023/5/24 15:56
 */
public class YellowGemDecorator implements IEquipDecorator {

    private IEquip iEquip;

    public YellowGemDecorator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    @Override
    public int calcAttack() {
        return 10 + iEquip.calcAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + " + 黄宝石";
    }
}
