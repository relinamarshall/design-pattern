package com.design.pattern.visitor.core;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure
 *
 * @author Wenzhou
 * @since 2023/5/26 15:59
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
