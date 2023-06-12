package com.design.pattern.singleton.core.enums;

/**
 * EnumSingletonExample
 *
 * @author Wenzhou
 * @since 2023/5/15 12:28
 */
public class EnumSingletonExample {
    private EnumSingletonExample() {

    }

    /**
     * Java虚拟机会保证枚举类型不能被反射并且构造函数只被执行一次
     */
    public enum EnumSingletonInstance {
        INS;

        private EnumSingletonExample instance;

        EnumSingletonInstance() {
            instance = new EnumSingletonExample();
        }

        public EnumSingletonExample getInstance() {
            return instance;
        }
    }
}
