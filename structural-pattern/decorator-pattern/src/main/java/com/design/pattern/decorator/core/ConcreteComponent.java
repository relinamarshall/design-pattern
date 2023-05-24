package com.design.pattern.decorator.core;

/**
 * ConcreteComponent
 *
 * @author Wenzhou
 * @since 2023/5/24 15:45
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("执行具体组件的操作");
    }
}
