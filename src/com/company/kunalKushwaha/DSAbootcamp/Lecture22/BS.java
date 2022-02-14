package com.company.kunalKushwaha.DSAbootcamp.Lecture22;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 12, 23, 27, 30, 35, 40};
        int target = 35;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m-1);
        }
        return search(arr, target, m + 1, e);

    }
}
