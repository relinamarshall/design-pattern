package com.design.pattern.template.method.core;

/**
 * AbstractClass
 *
 * @author Wenzhou
 * @since 2023/5/18 10:42
 */
public abstract class AbstractClass {
    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    protected abstract void step1();

    protected abstract void step2();

    protected abstract void step3();
}
