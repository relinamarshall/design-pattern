package com.design.pattern.decorator.core;

/**
 * Decorator
 *
 * @author Wenzhou
 * @since 2023/5/24 15:45
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
