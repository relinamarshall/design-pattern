package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subject
 *
 * @author Wenzhou
 * @since 2023/5/16 10:23
 */
public abstract class Subject<T> {
    protected List<T> oList;

    public void addObserver(T... o) {
        if (oList == null) {
            oList = new ArrayList<>();
        }
        oList.addAll(Arrays.asList(o));
    }

    public void deleteObserver(T... o) {
        if (oList.isEmpty()) {
            return;
        }
        oList.removeAll(Arrays.asList(o));
    }

    public abstract void notifyObserver();
}
