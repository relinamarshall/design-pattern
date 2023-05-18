package com.design.pattern.template.method.example;

/**
 * QAWorker
 *
 * @author Wenzhou
 * @since 2023/5/18 10:50
 */
public class QAWorker extends Worker {
    public QAWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work--" + name + ", 写测试用例 - 提交Bug - 复查Bug");
    }
}
