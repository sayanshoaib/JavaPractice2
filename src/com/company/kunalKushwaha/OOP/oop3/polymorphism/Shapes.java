package com.company.kunalKushwaha.OOP.oop3.polymorphism;

public class Shapes {
    void area() {
        System.out.println("Shape");
    }

    void area(int height, int width) {
        System.out.println(height * width);
    }

    @Override
    public String toString() {
        return "Shapes{}";
    }

    static void greeting() {
        System.out.println("Hello Triangle");
    }
}
