package com.company.bazlur.javaProgramming.chap12;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
    }
}
