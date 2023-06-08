package com.design.pattern.builder.example.components;

/**
 * GPSNavigator
 *
 * @author Wenzhou
 * @since 2023/6/8 15:12
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
