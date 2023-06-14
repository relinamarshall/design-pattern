package com.design.pattern.flyweight.example.trees;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 * TreeFactory
 *
 * @author Wenzhou
 * @since 2023/6/14 15:46
 */
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        return treeTypes.computeIfAbsent(name, n -> new TreeType(n, color, otherTreeData));
    }
}
