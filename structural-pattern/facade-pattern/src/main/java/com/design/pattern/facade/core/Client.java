package com.design.pattern.facade.core;

/**
 * Client
 *
 * @author Wenzhou
 * @since 2023/5/17 11:23
 */
public class Client {
    private static final Facade facade = new Facade();
    public static void main(String[] args) {
        facade.wrapOperation();
    }
}
