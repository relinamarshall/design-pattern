package com.design.pattern.decorator.example2.decorators;

/**
 * DataSourceDecorator
 *
 * @author Wenzhou
 * @since 2023/6/14 15:09
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
