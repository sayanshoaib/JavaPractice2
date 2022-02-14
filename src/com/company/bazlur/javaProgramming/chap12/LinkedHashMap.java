package com.company.bazlur.javaProgramming.chap12;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<Person, String> phoneBook = new java.util.LinkedHashMap<>();
        Person shoaib = new Person("Shoaib");
        Person sayem = new Person("Sayem");
        Person abbu = new Person("Abdus Salam");
        phoneBook.put(shoaib, "01843548511");
        phoneBook.put(sayem, "01710339938");
        phoneBook.put(abbu, "01718833543");
        for (Map.Entry<Person, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}
