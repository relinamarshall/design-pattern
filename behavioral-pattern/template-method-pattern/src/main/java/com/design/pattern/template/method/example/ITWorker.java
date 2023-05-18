package com.design.pattern.template.method.example;

/**
 * ITWorker
 *
 * @author Wenzhou
 * @since 2023/5/18 10:48
 */
public class ITWorker extends Worker{
    protected ITWorker(String name) {
        super(name);
    }

    /**
     * 重写父类的此方法,使可以查看离开公司时间
     */
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ", 写程序 - 测bug - 修复bug");
    }
}
