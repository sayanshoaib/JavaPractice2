package com.company.kunalKushwaha.OOP.oop4.access;

import com.company.kunalKushwaha.OOP.oop4.Main;
import com.company.kunalKushwaha.OOP.oop4.Student;

public class A extends Student {
    int num;
    String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    protected void hello() {
        System.out.println("Hello Section A Students");
    }
}
