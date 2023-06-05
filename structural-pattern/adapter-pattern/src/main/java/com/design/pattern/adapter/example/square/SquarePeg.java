package com.design.pattern.adapter.example.square;

/**
 * SquarePeg
 * <p>
 * 方钉
 *
 * @author Wenzhou
 * @since 2023/6/5 19:04
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
