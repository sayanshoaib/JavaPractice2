package com.company.kunalKushwaha.OOP.oop3.polymorphism;

public class Calculator {

    double sum(double a, double b) {
        return a + b;
    }

    double sum(double a, double b, double c) {
        return a + b + c;
    }

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        var cal = new Calculator();

        System.out.println(cal.sum(1, 2));
    }
}
