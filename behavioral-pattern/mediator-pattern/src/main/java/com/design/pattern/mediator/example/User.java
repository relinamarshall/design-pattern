package com.design.pattern.mediator.example;

/**
 * User
 *
 * @author Wenzhou
 * @since 2023/5/22 15:35
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        // 使用中介类
        Room.showMessage(this, message);
    }
}
