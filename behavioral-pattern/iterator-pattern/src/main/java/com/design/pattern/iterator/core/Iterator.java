package com.design.pattern.iterator.core;

/**
 * Iterator
 *
 * @author Wenzhou
 * @since 2023/5/17 14:22
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
