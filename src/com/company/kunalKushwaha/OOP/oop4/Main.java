package com.company.kunalKushwaha.OOP.oop4;

import com.company.kunalKushwaha.OOP.oop4.access.A;
import com.company.kunalKushwaha.OOP.oop4.access.ObjectDemo;

public class Main {
    public static void main(String[] args) {

        A aaa = new A(5, "Shoaib");
        Object obj = new Object();
        System.out.println(obj.hashCode());
        ObjectDemo demo = new ObjectDemo(5);
        System.out.println(demo.hashCode());
    }
}
