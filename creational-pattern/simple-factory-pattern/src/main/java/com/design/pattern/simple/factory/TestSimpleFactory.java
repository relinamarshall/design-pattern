package com.design.pattern.simple.factory;

/**
 * TestSimpleFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 14:07
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleRouJiaMoFactory factory = new SimpleRouJiaMoFactory();
        RouJiaMoStore store = new RouJiaMoStore(factory);
        System.out.println(store.sellRoujiaMo("Suan"));
        //System.out.println(store.sellRoujiaMo("La"));
        //System.out.println(store.sellRoujiaMo("Tian"));
        //System.out.println(store.sellRoujiaMo(""));
    }
}
