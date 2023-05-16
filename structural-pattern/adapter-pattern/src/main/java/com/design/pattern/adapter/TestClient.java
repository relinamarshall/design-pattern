package com.design.pattern.adapter;

/**
 * Client
 *
 * @author Wenzhou
 * @since 2023/5/15 17:09
 */
public class TestClient {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();

        Target2 target2 = new Adapter2();
        target2.request();
    }
}
