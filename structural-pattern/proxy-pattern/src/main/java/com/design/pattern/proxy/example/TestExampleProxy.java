package com.design.pattern.proxy.example;

/**
 * TestExampleProxy
 *
 * @author Wenzhou
 * @since 2023/5/15 10:57
 */
public class TestExampleProxy {
    /**
     * 一个类代表另一个类的功能。在代理模式中，创建具有现有对象的对象，以便向外界提供功能接口。
     * <p>
     * 可以理解为内存中没有这个对象就创建，有就直接返回这个对象
     */
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("test.png");
        // 第一次是new的，图像从磁盘加载
        image.display();
        // 第二次取缓存，图像不需要从磁盘加载
        image.display();
    }
}
