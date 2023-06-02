package com.design.pattern.mediator.example2.components;


import com.design.pattern.mediator.example2.mediator.Mediator;

/**
 * Component
 *
 * @author Wenzhou
 * @since 2023/6/1 13:36
 */
public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
