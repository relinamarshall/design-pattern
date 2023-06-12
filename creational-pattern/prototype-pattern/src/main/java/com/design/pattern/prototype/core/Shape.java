package com.design.pattern.prototype.core;

/**
 * Shape
 *
 * @author Wenzhou
 * @since 2023/5/16 8:58
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }
        return o;
    }
}
