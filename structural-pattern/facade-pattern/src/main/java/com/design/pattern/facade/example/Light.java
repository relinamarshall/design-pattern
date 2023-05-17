package com.design.pattern.facade.example;

/**
 * Light
 * <p>
 * 灯光
 *
 * @author Wenzhou
 * @since 2023/5/17 11:11
 */
public class Light {
    public void down() {
        System.out.println("Light---将灯光调暗");
    }

    public void up() {
        System.out.println("Light---将灯光调亮");
    }
}
