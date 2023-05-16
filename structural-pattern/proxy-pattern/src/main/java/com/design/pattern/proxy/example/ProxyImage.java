package com.design.pattern.proxy.example;

/**
 * ProxyImage
 *
 * @author Wenzhou
 * @since 2023/5/15 10:55
 */
public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
