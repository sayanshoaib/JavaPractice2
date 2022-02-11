package com.company.bazlur.javaProgramming.chap12;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Shoaib"));
        persons.add(new Person("Nur"));
        persons.add(new Person("Sayem"));
        persons.add(new Person("Sourav"));
        //persons.add(new Person("Shoaib"));

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
