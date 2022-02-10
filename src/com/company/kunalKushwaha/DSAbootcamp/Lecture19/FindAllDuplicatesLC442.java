package com.company.kunalKushwaha.DSAbootcamp.Lecture19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllDuplicatesLC442 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 3, 4};
        findDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> duplicatesNums = new  ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                duplicatesNums.add(nums[index]);
            }
        }

        return duplicatesNums;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}