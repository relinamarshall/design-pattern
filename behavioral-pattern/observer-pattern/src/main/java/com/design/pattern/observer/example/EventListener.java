package com.design.pattern.observer.example;

import java.io.File;

/**
 * EventListener
 *
 * @author Wenzhou
 * @since 2023/6/1 10:57
 */
public interface EventListener {
    void update(String eventType, File file);
}
