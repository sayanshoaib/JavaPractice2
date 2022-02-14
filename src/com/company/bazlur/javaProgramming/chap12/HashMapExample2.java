package com.company.bazlur.javaProgramming.chap12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Person, Address> addressBook = new HashMap<>();

        Person person = new Person("Shoaib");
        Address address = new Address("500 kingston Rd", "Toronto", "ON", "Canada", "M4L1V3");

        Person person1 = new Person("Shoaib");

        addressBook.put(person, address);
        addressBook.put(person1, address);

        System.out.println(addressBook);
        System.out.println(addressBook.size());
    }
}
