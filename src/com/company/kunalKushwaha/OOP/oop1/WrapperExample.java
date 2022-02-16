package com.company.kunalKushwaha.OOP.oop1;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 45;

        swap(a, b);
        System.out.println(a + " " + b);

//        final int bonus = 2;

        A shoaib = new A("Shoaib");
        shoaib.name = "hasan";

        A obj;

        for (int i = 0; i < 10000000; i++) {
            obj = new A("Random name");
        }


    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}