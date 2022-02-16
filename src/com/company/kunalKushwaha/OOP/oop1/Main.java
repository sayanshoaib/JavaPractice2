package com.company.kunalKushwaha.OOP.oop1;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names;
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student shoaib = new Student();
        shoaib.name = "Shoaib Hasan";
        System.out.println(shoaib.name);
        shoaib.changeName("Nur");
        System.out.println(shoaib.name);

        Student linus = new Student(1, "Torvalds", 99.00F);
        System.out.println(linus.name);
        Student unknown = new Student();
        System.out.println(unknown.name);

        Student one = new Student();
        Student two = one;

        one.name = "Elon";
        System.out.println(two.name);

        two.name = "Musk";
        System.out.println(one.name);

    }

    static class Student {
        int rno;
        String name;
        float marks;

        public Student() {
            this (13, "default person", 100.0f);
        }

        public Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        void changeName(String name) {
            this.name = name;
        }
    }
}
