package com.company.bazlur.javaProgramming.chap12;

public class PersonEquality {
    public static void main(String[] args) {
        Person person1 = new Person("Nur");
        Person person2 = new Person("Nur");

        if (person1.equals(person2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
