package com.design.pattern.proxy.core.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * MyInvocationHandler
 *
 * @author Wenzhou
 * @since 2023/5/15 10:01
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler() {
        super();
    }

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("getName".equals(method.getName())) {
            System.out.println("----------before " + method.getName() + "----------");
            Object result = method.invoke(target, args);
            System.out.println("----------after " + method.getName() + "----------");
            return result;
        } else {
            return method.invoke(target, args);
        }
    }
}
