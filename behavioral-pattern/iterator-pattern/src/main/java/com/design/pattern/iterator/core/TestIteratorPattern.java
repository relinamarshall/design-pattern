package com.design.pattern.iterator.core;

/**
 * TestIteratorPattern
 *
 * @author Wenzhou
 * @since 2023/5/17 14:26
 */
public class TestIteratorPattern {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
