package com.design.pattern.proxy.jdk;

/**
 * UserServiceImpl
 *
 * @author Wenzhou
 * @since 2023/5/15 9:58
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        System.out.println("----------getName----------");
        return "Jack";
    }

    @Override
    public Integer getAge() {
        System.out.println("----------getAge----------");
        return 10;
    }
}
