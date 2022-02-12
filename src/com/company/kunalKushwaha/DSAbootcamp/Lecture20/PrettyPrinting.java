package com.company.kunalKushwaha.DSAbootcamp.Lecture20;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted number is %.3f", a);
        System.out.println();

        System.out.printf("Pi: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and I'm a %s", "Shoaib", "Programmer");
        System.out.println();
        System.out.println('a' + 'b');
        System.out.println((char) ('a' + 3));
        System.out.println("Shoaib" + new ArrayList<>());
    }
}
