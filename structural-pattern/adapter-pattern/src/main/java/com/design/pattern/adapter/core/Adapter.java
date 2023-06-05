package com.design.pattern.adapter.core;

/**
 * Adapter
 * <p>
 * 对象适配器
 *
 * @author Wenzhou
 * @since 2023/5/15 17:04
 */
public class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
