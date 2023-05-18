package com.design.pattern.template.method.example;

import java.util.Date;

/**
 * Worker
 *
 * @author Wenzhou
 * @since 2023/5/18 10:46
 */
public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    /**
     * 具体方法
     */
    public final void workOneDay() {
        System.out.println("workOneDay-----------------work start----------------");

        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();

        System.out.println("workOneDay-----------------work end----------------");
    }

    /**
     * 工作  抽象方法
     */
    public abstract void work();

    /**
     * 钩子方法
     */
    public boolean isNeedPrintDate() {
        return false;
    }

    private void exitCompany() {
        if (isNeedPrintDate()) {
            System.out.println("exitCompany---" + new Date().toLocaleString() + "--->");
        }
        System.out.println("exitCompany" + name + "---离开公司");
    }

//    -----------------------------------

    private void computerOn() {
        System.out.println("computerOn---打开电脑");
    }

    private void computerOff() {
        System.out.println("computerOff---关闭电脑");
    }

    private void enterCompany() {
        System.out.println("enterCompany---进入公司");
    }
}
