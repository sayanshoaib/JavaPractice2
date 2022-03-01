package com.company.kunalKushwaha.OOP.oop3.polymorphism;

public class Triangle extends Shapes {
    @Override
    void area() {
        System.out.println("This is a Triangle");
    }

    @Override
    void area(int height, int width) {
        System.out.println(height * width);
    }
     

}
