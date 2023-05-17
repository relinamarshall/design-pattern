package com.design.pattern.facade.example;

/**
 * TestFacade
 *
 * @author Wenzhou
 * @since 2023/5/17 11:15
 */
public class TestFacade {
    public static void main(String[] args) throws InterruptedException {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.watchMovie();
        Thread.sleep(3000);
        facade.stopMovie();
    }
}
