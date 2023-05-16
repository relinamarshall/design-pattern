package com.design.pattern.singleton.ehan;

/**
 * EHanSingleton2
 * <p>
 * 另一种写法 基本没区别
 *
 * @author Wenzhou
 * @since 2023/5/15 11:20
 */
public class EHanSingleton2 {
    private EHanSingleton2() {
    }

    private static EHanSingleton2 singleton = null;

    static {
        singleton = new EHanSingleton2();
    }

    public static EHanSingleton2 getSingleton() {
        if (singleton == null) {
            singleton = new EHanSingleton2();
        }
        return singleton;
    }
}
