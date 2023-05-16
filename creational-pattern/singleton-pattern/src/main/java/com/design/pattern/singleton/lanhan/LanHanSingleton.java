package com.design.pattern.singleton.lanhan;

/**
 * LanHanSingleton
 * <p>
 * 单例模式的懒汉式
 *
 * @author Wenzhou
 * @since 2023/5/15 11:22
 */
public class LanHanSingleton {
    private LanHanSingleton() {

    }

    /**
     * 懒汉式[线程不安全，不可用]
     */
    private static LanHanSingleton singleton;

    public static LanHanSingleton getSingleton() {
        // 这里线程是不安全的,可能得到两个不同的实例
        if (singleton == null) {
            singleton = new LanHanSingleton();
        }
        return singleton;
    }

    /**
     * 懒汉式线程安全的:[线程安全，效率低不推荐使用]
     * <p>
     * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。
     * 而其实这个方法只执行一次实例化代码就够了，
     * 后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
     * <p>
     * 跟锁的粒度也有关系  static synchronized 锁的是整个对象
     */
    private static LanHanSingleton singleton2;

    public static synchronized LanHanSingleton getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new LanHanSingleton();
        }
        return singleton2;
    }

    /**
     * 懒汉式[线程不安全，不可用]
     * <p>
     * 虽然加了锁，但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，
     * 另一个进入if语句的线程同样会实例化另外一个Singleton对象，线程不安全的原理跟3类似。
     */
    private static LanHanSingleton singleton3;

    public static LanHanSingleton getSingleton3() {
        if (null == singleton3) {
            synchronized (LanHanSingleton.class) {
                singleton3 = new LanHanSingleton();
            }
        }
        return singleton3;
    }

    /**
     * 懒汉式-双重校验锁[推荐用]
     * <p>
     * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
     */
    private static volatile LanHanSingleton singleton4;

    public static LanHanSingleton getSingleton4() {
        if (singleton4 == null) {
            synchronized (LanHanSingleton.class) {
                if (singleton4 == null) {
                    singleton4 = new LanHanSingleton();
                }
            }
        }
        return singleton4;
    }
}
