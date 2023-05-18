package com.design.pattern.template.method.core;

/**
 * TemplateMethodPatternExample
 *
 * @author Wenzhou
 * @since 2023/5/18 10:43
 */
public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
