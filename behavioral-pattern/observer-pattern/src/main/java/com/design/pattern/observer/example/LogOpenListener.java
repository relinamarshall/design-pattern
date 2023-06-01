package com.design.pattern.observer.example;

import java.io.File;

/**
 * LogOpenListener
 *
 * @author Wenzhou
 * @since 2023/6/1 10:59
 */
public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}