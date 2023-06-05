package com.design.pattern.adapter.example.round;

/**
 * RoundPeg
 * <p>
 * 圆钉
 *
 * @author Wenzhou
 * @since 2023/6/5 19:04
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
