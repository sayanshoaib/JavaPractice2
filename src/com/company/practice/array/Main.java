package com.company.practice.array;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[7];
        Student s1 = new Student("Nowshin", 2, "CSE", 3.58);
        Student s2 = new Student("Shoaib", 3, "CSE", 2.89);
        Student s3 = new Student("Nur", 4, "CSE", 3.50);
        Student s4 = new Student("Tas", 5, "CSE", 3.45);

//        students[0] = s1;
//        students[1] = null;
//        students[2] = s2;
//        students[3] = s3;
//        students[4] = s4;
//        students[5] = null;
//        students[6] = null;
        insert(students, s1, 0);
        insert(students, null, 1);
        insert(students, s2, 2);
        insert(students, s3, 3);
        insert(students, s4, 4);
        insert(students, null, 5);
        insert(students, null, 6);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        remove(students, 2);
        remove(students, 4);

        for (Student student : students) {
            System.out.println(student);
        }

    }

    public static void insert(Student[] students, Student student, int index) {
        students[index] = student;
    }

    public static void remove(Student[] students, int index) {
        students[index] = null;
    }
}
