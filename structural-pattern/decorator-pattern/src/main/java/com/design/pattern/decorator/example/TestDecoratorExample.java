package com.design.pattern.decorator.example;

/**
 * TestDecoratorExample
 * <p>
 * 装饰者模式:
 * <p>
 * 装饰者模式：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。
 * <p>
 * 先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，
 * 并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。
 * 这里还体现了一个原则：类应该对扩展开放，对修改关闭。
 * <p>
 * eg:
 * <p>
 * 1、武器（攻击力20） 、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）
 * <p>
 * 2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）
 * <p>
 * 3、每个装备可以随意镶嵌3颗
 *
 * @author Wenzhou
 * @since 2023/5/24 16:00
 */
public class TestDecoratorExample {
    public static void main(String[] args) {
        System.out.println("一个镶嵌2颗红宝石,1颗蓝宝石的靴子");
        IEquip iEquip1 = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        System.out.println("攻击力:" + iEquip1.calcAttack());
        System.out.println("描述语:" + iEquip1.description());

        System.out.println("一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指");
        IEquip iEquip2 = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new RingEquip())));
        System.out.println("攻击力:" + iEquip2.calcAttack());
        System.out.println("描述语:" + iEquip2.description());
    }
}
