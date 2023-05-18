package com.design.pattern.template.method.core;

/**
 * ConcreteClass
 *
 * @author Wenzhou
 * @since 2023/5/18 10:43
 */
public class ConcreteClass extends AbstractClass{
    @Override
    protected void step1() {
        System.out.println("ConcreteClass: 执行步骤1");
    }

    @Override
    protected void step2() {
        System.out.println("ConcreteClass: 执行步骤2");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClass: 执行步骤3");
    }
}
