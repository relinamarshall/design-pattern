package com.design.pattern.adapter.example.adapters;

import com.design.pattern.adapter.example.round.RoundPeg;
import com.design.pattern.adapter.example.square.SquarePeg;

/**
 * SquarePegAdapter
 * <p>
 * 方钉到圆孔的适配器
 *
 * @author Wenzhou
 * @since 2023/6/5 19:05
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
