package com.company.kunalKushwaha.OOP.oop3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();
        Triangle triangle = new Triangle();
        Shapes triangle1 = new Triangle();

        shapes.area();
        circle.area();
        square.area();
        triangle.area(2, 3);
        shapes.toString();
        triangle1.greeting();
    }
}
