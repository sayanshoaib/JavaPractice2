package com.company.kunalKushwaha.OOP.oop4.access;

public class ObjectDemo {
    public int code;

    public ObjectDemo(int code) {
        this.code = code;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
