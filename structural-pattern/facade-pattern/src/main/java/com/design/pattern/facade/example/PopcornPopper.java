package com.design.pattern.facade.example;

/**
 * PopcornPopper
 * <p>
 * 爆米花机
 *
 * @author Wenzhou
 * @since 2023/5/17 11:11
 */
public class PopcornPopper {
    public void on() {
        System.out.println("PopcornPopper---打开爆米花机");
    }

    public void off() {
        System.out.println("PopcornPopper---关闭爆米花机");
    }

    public void makePopcorn() {
        System.out.println("PopcornPopper---制作爆米花");
    }
}
