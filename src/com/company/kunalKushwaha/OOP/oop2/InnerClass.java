package com.company.kunalKushwaha.OOP.oop2;


public class InnerClass {

    static class Test {
        static String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Shoaib");
        Test b = new Test("Nur");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(Test.name);

    }
}
