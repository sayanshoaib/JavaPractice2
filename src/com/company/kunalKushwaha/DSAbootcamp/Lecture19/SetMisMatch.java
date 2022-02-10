package com.company.kunalKushwaha.DSAbootcamp.Lecture19;

// https://leetcode.com/problems/set-mismatch/submissions/

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 3, 4, 5};
        findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }

        // case 2
        return new int[] {-1, -1};
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
