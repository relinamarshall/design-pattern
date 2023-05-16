package com.design.pattern.proxy.example;

/**
 * RealImage
 *
 * @author Wenzhou
 * @since 2023/5/15 10:52
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFormDisk();
    }

    private void loadFormDisk() {
        System.out.println("RealImage loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("RealImage displaying " + fileName);
    }
}
