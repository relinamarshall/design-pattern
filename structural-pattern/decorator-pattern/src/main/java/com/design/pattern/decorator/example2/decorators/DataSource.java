package com.design.pattern.decorator.example2.decorators;

/**
 * DataSource
 *
 * @author Wenzhou
 * @since 2023/6/14 15:08
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
