package com.design.pattern.decorator.example;

/**
 * IEquip
 * <p>
 * 装备的接口
 * <p>
 * 下面有:武器,护腕,鞋子,戒指、、、、还有装饰品接口
 *
 * @author Wenzhou
 * @since 2023/5/24 15:52
 */
public interface IEquip {
    /**
     * 计算攻击力
     */
    int calcAttack();

    /**
     * 装备的描述
     */
    String description();
}
