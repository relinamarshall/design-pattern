package com.design.pattern.facade.example;

/**
 * HomeTheaterFacade
 * <p>
 * 家庭影院
 *
 * @author Wenzhou
 * @since 2023/5/17 11:14
 */
public class HomeTheaterFacade {
    private Computer computer;
    private Light light;
    private Player player;
    private PopcornPopper popcornPopper;
    private Projector projector;

    public HomeTheaterFacade() {
        this.computer = new Computer();
        this.light = new Light();
        this.player = new Player();
        this.popcornPopper = new PopcornPopper();
        this.projector = new Projector();
    }

    public HomeTheaterFacade(Computer computer, Light light, Player player, PopcornPopper popcornPopper, Projector projector) {
        this.computer = computer;
        this.light = light;
        this.player = player;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
    }

    /**
     * 一键观影
     */
    public void watchMovie() {
        computer.on();
        light.down();
        popcornPopper.on();
        popcornPopper.makePopcorn();
        projector.on();
        projector.open();
        player.on();
        player.make3DListener();
    }

    /**
     * 一键关闭
     */
    public void stopMovie() {
        computer.off();
        light.up();
        player.off();
        popcornPopper.off();
        projector.close();
        projector.off();
    }
}
