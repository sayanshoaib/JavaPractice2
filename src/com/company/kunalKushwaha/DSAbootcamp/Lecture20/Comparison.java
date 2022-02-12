package com.company.kunalKushwaha.DSAbootcamp.Lecture20;

public class Comparison {
    public static void main(String[] args) {
        String a = "Shoaib";
        String b = "Shoaib";

        System.out.println(a == b); // these two reference variable pointing to same object

        String name1 = new String("Shoaib");
        String name2 = new String("Shoaib");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(2));
    }
}
