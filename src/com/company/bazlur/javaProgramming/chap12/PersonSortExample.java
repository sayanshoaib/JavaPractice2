package com.company.bazlur.javaProgramming.chap12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonSortExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ryan Gosling"));
        persons.add(new Person("Benedict Cumberbach"));
        persons.add(new Person("James Franco"));
        persons.add(new Person("Adam Sandler"));
        persons.add(new Person("Bryan Cranston"));
        Collections.sort(persons);
        for (Person p : persons) {
            System.out.println(p.getName());
        }
    }
}
