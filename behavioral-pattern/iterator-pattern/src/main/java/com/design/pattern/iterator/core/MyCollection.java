package com.design.pattern.iterator.core;

import java.util.ArrayList;
import java.util.List;

/**
 * MyCollection
 *
 * @author Wenzhou
 * @since 2023/5/17 14:24
 */
public class MyCollection<T> {
    private List<T> list;

    public MyCollection() {
        this.list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public Iterator<T> iterator() {
        return new ListIterator<>(list);
    }
}
