package com.design.pattern.decorator.example2;

import com.design.pattern.decorator.example2.decorators.CompressionDecorator;
import com.design.pattern.decorator.example2.decorators.DataSource;
import com.design.pattern.decorator.example2.decorators.DataSourceDecorator;
import com.design.pattern.decorator.example2.decorators.EncryptionDecorator;
import com.design.pattern.decorator.example2.decorators.FileDataSource;

/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/14 15:12
 */
public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("F:/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("F:/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
