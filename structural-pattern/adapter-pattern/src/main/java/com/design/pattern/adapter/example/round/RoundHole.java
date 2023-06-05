package com.design.pattern.adapter.example.round;

/**
 * RoundHole
 * <p>
 * 圆孔
 *
 * @author Wenzhou
 * @since 2023/6/5 19:04
 */
public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
