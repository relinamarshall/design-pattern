package com.design.pattern.factory.method;

/**
 * @author Wenzhou
 * @since 2023/5/15 14:35
 */
public abstract class Food {
    protected String name;

    /**
     * 准备工作
     */
    public void make() {
        System.out.println(name + ": 制作流程");
    }
}