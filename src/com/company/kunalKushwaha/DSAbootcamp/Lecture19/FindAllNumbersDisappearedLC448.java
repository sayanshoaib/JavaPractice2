package com.company.kunalKushwaha.DSAbootcamp.Lecture19;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
// Asked in Google


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllNumbersDisappearedLC448 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }

        List<Integer> missingNum = new  ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                missingNum.add(index + 1);
            }
        }

        return missingNum;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}