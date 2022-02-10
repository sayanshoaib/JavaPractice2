package com.company.bazlur.javaProgramming.chap12;

public class IntRangeDemo {
    public static void main(String[] args) {
        IntRange range = new IntRange(0, 10);
        for (Integer value : range) {
            System.out.println(value);
        }
    }
}
