package com.company.kunalKushwaha.DSAbootcamp.Lecture16;

// My solution

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = start; i <= end; i++) {
            for (int j = 0; j <= end - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
