package com.design.pattern.abs.factory.example2;

import com.design.pattern.abs.factory.example2.app.Application;
import com.design.pattern.abs.factory.example2.factories.GUIFactory;
import com.design.pattern.abs.factory.example2.factories.MacOSFactory;
import com.design.pattern.abs.factory.example2.factories.WindowsFactory;

/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/6 15:39
 */
public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
