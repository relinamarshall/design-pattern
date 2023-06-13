package com.design.pattern.proxy.core.jdk;

import java.lang.reflect.Proxy;

/**
 * TestJdkProxy
 *
 * @author Wenzhou
 * @since 2023/5/15 10:07
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), invocationHandler);

        System.out.println("------------------------------");
        System.out.println(userServiceProxy.getName());
        System.out.println(userServiceProxy.getAge());
    }
}
