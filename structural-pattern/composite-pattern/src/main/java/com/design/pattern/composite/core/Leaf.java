package com.design.pattern.composite.core;

/**
 * Leaf
 *
 * @author Wenzhou
 * @since 2023/5/17 16:08
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        // 叶子节点无法添加子节点，因此不做任何操作
    }

    @Override
    public void remove(Component component) {
        // 叶子节点无法移除子节点，因此不做任何操作
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
