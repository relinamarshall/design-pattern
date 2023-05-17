package com.design.pattern.composite.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 *
 * @author Wenzhou
 * @since 2023/5/17 16:09
 */
public class Composite extends Component {
    private List<Component> children;

    public Composite(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Component child : children) {
            child.display();
        }
    }
}
