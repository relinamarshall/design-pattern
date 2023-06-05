package com.design.pattern.adapter.core;

/**
 * Adapter2
 * <p>
 * 类适配器
 *
 * @author Wenzhou
 * @since 2023/5/15 17:20
 */
public class Adapter2 extends Adaptee implements Target2{
    @Override
    public void request() {
        specificRequest();
    }
}
