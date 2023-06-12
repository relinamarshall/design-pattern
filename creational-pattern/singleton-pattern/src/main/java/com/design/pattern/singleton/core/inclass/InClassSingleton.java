package com.design.pattern.singleton.core.inclass;

/**
 * InClassSingleton
 * <p>
 * 内部类[推荐用]
 * <p>
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * <p>
 * 优点：避免了线程不安全，延迟加载，效率高。
 *
 * @author Wenzhou
 * @since 2023/5/15 12:16
 */
public class InClassSingleton {
    private InClassSingleton() {

    }

    private static class InClassSingletonHolder {
        private static InClassSingleton singleton = new InClassSingleton();
    }

    public static InClassSingleton getInstance() {
        return InClassSingletonHolder.singleton;
    }
}
