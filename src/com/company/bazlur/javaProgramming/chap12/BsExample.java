package com.company.bazlur.javaProgramming.chap12;

import java.util.Arrays;

public class BsExample {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 8, 1, 9, 5};

        Arrays.sort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
        int searchValue = 5;
        int index = Arrays.binarySearch(array, searchValue);

        System.out.println("The index of element 12 is : " + index);
    }
}
