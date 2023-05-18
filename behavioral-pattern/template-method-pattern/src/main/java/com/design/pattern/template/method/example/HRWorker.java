package com.design.pattern.template.method.example;

/**
 * HRWorker
 *
 * @author Wenzhou
 * @since 2023/5/18 10:49
 */
public class HRWorker extends Worker {
    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ", 看简历 - 打电话 - 接电话");
    }
}
