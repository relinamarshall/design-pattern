package com.design.pattern.simple.factory;

/**
 * RouJiaMoStore
 *
 * @author Wenzhou
 * @since 2023/5/15 14:05
 */
public class RouJiaMoStore {
    private final SimpleRouJiaMoFactory factory;

    public RouJiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    public RouJiaMo sellRoujiaMo(String type) {
        RouJiaMo roujiaMo = factory.createRouJiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
