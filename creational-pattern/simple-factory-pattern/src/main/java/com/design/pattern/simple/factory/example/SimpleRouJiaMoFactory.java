package com.design.pattern.simple.factory.example;

/**
 * SimpleRouJiaMoFactory
 * <p>
 * 简单工厂模式
 *
 * @author Wenzhou
 * @since 2023/5/15 14:01
 */
public class SimpleRouJiaMoFactory {
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo;
        switch (type) {
            case "La":
                rouJiaMo = new ZLaRouJiaMo();
                break;
            case "Tian":
                rouJiaMo = new ZTianRouJiaMo();
                break;
            case "Suan":
            default:
                rouJiaMo = new ZSuanRouJiaMo();
                break;
        }
        return rouJiaMo;
    }
}
