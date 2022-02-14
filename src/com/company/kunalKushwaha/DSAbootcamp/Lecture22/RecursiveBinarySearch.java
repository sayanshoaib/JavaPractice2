package com.company.kunalKushwaha.DSAbootcamp.Lecture22;

// My Solution

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 12, 23, 27, 30, 35, 40};
        int target = 35;
        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
