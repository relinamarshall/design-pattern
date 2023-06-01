package com.design.pattern.memento.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 * 负责人
 *
 * @author Wenzhou
 * @since 2023/5/31 15:02
 */
public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
