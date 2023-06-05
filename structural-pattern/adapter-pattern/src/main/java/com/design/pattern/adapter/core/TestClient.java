package com.design.pattern.adapter.core;

/**
 * Client
 *
 * @author Wenzhou
 * @since 2023/5/15 17:09
 */
public class TestClient {
    public static void main(String[] args) {
        // 测试对象装饰器
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();

        // 测试类装饰器
        Target2 target2 = new Adapter2();
        target2.request();
    }
}
