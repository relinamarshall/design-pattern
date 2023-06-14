package com.design.pattern.flyweight.example.forest;

import com.design.pattern.flyweight.example.trees.Tree;
import com.design.pattern.flyweight.example.trees.TreeFactory;
import com.design.pattern.flyweight.example.trees.TreeType;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * Forest
 * <p>
 * 我们绘制的森林
 *
 * @author Wenzhou
 * @since 2023/6/14 15:47
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
