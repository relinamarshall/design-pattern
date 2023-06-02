package com.design.pattern.iterator.example.iterators;


import com.design.pattern.iterator.example.profile.Profile;

/**
 * ProfileIterator
 *
 * @author Wenzhou
 * @since 2023/6/2 15:56
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
