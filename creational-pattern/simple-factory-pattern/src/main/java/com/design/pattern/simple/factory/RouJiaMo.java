package com.design.pattern.simple.factory;

/**
 * RouJiaMo
 * <p>
 * 肉夹馍
 *
 * @author Wenzhou
 * @since 2023/5/15 13:55
 */
public abstract class RouJiaMo {
    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        System.out.println(name + ": 揉面-剁肉-完成准备工作");
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        System.out.println(name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用各自专用袋-包装
     */
    public void pack() {
        System.out.println(name + ": 肉夹馍-专用袋-包装---end");
    }
}
