package com.company.bazlur.javaProgramming.chap12;

import java.util.Arrays;
import java.util.Random;

public class ArraySortExample2 {
    public static void main(String[] args) {

        char[] array = new char[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (rand.nextInt(26) + 'A');
        }

        System.out.println("Array before sort: ");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(array));
    }
}
