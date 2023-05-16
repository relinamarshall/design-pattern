package com.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibProxy
 *
 * @author Wenzhou
 * @since 2023/5/15 10:21
 */
public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----------before " + methodProxy.getSuperName() + "----------");
        System.out.println(method.getName());
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("----------after " + methodProxy.getSuperName() + "----------");
        return result;
    }
}
