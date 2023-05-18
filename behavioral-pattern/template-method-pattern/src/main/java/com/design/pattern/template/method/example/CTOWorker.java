package com.design.pattern.template.method.example;

/**
 * CTOWorker
 *
 * @author Wenzhou
 * @since 2023/5/18 10:51
 */
public class CTOWorker extends Worker {
    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ", 开会 - 出API - 检查进度");
    }
}
