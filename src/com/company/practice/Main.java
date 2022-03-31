package com.company.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        double gpa = 3.68;
//        System.out.println("My gpa: " + gpa);
//        double[] cgpa = {3.68, 3.75, 3.40, 3.50, 3.45};
//
//        String[] favColor = new String[5];
//
//        for (int i = 0; i < favColor.length; i++) {
//            favColor[i] = in.next();
//            System.out.println("Favourite color: " + favColor[i]);
//        }

        Student student1 = new Student();
        student1.setName("Afsana");
        System.out.println(student1.getName());
        System.out.println(student1.getBalance());
        System.out.println(student1.toString());

//        for (int i = 0; i < cgpa.length; i++) {
//            int a = i + 1;
//            System.out.println("My Cgpa in " + a + " trimester " + cgpa[i]);
//        }


    }
}
