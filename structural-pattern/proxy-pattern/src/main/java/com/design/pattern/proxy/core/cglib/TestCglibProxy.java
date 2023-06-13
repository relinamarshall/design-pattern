package com.design.pattern.proxy.core.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * TestCglibProxy
 *
 * @author Wenzhou
 * @since 2023/5/15 10:26
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(cglibProxy);

        UserService o = (UserService) enhancer.create();
        System.out.println(o.getName());
        System.out.println(o.getAge());
    }
}
