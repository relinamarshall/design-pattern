package com.design.pattern.composite.core;

/**
 * TestCompositePattern
 *
 * @author Wenzhou
 * @since 2023/5/17 16:09
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        // 创建根节点
        Composite root = new Composite("Root");

        // 创建树枝节点
        Composite branch1 = new Composite("Branch 1");
        Composite branch2 = new Composite("Branch 2");

        // 创建叶子节点
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");

        // 构建树结构
        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf1);
        branch1.add(leaf2);
        branch2.add(leaf3);

        // 显示整个树结构
        root.display();
    }
}
