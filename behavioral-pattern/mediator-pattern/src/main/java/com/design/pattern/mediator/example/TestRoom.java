package com.design.pattern.mediator.example;

/**
 * TestRoom
 *
 * @author Wenzhou
 * @since 2023/5/22 15:36
 */
public class TestRoom {
    public static void main(String[] args) {
        User jack = new User("jack");
        User mark = new User("mark");

        mark.sendMessage("hi jack");
        jack.sendMessage("hi mark");
    }
}

