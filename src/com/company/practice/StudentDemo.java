package com.company.practice;

import java.util.Arrays;

public class StudentDemo {

    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student student1 = new Student();
        student1.setName("Nowshin");
        student1.setRoll(1);
        students[0] = student1;

        Student student2 = new Student();
        student2.setName("Zaia");
        student2.setRoll(2);
        students[1] = student2;

        Student student3 = new Student();
        student3.setName("Tasmia");
        student3.setRoll(3);
        students[2] = student3;

        Student student4 = new Student();
        student4.setName("Elma");
        student4.setRoll(4);
        students[3] = student4;

        Student student5 = new Student();
        student5.setName("Shoaib");
        student5.setRoll(5);
        students[4] = student5;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student name: " + students[i].getName());
            System.out.println("Student roll: " + students[i].getRoll());
        }


    }
}
