package com.company.bazlur.javaProgramming.chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Rahim"));
        people.add(new Person("karim"));
        people.add(new Person("Sourav"));
        people.add(new Person("Russel"));
        people.add(new Person("Montu"));

        Collections.sort(people);

        Person key = new Person("Russel");

        int index = Collections.binarySearch(people, key);
        if (index >= 0) {
            System.out.println("Found at " + index);
        } else {
            System.out.println("Not found " + index);
        }
    }
}
