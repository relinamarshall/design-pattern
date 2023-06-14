package com.design.pattern.flyweight.example.trees;

import java.awt.Graphics;

/**
 * Tree
 * <p>
 * 包含每棵树的独特状态
 *
 * @author Wenzhou
 * @since 2023/6/14 15:45
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
