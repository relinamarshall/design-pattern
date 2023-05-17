package com.design.pattern.facade.core;

/**
 * Facade
 *
 * @author Wenzhou
 * @since 2023/5/17 11:23
 */
public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }

    public void wrapOperation() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
        System.out.println("启动成功");
    }
}
