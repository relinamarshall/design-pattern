package com.design.pattern.factory.method.example2.buttons;

/**
 * HtmlButton
 *
 * @author Wenzhou
 * @since 2023/6/12 10:46
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
