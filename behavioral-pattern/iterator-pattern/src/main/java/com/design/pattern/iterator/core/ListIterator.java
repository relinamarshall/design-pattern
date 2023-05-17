package com.design.pattern.iterator.core;

import java.util.List;

/**
 * ListIterator
 *
 * @author Wenzhou
 * @since 2023/5/17 14:22
 */
public class ListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int position;

    public ListIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(position++);
        }
        return null;
    }
}
