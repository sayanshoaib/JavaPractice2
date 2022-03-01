package com.company.practice;

public class IsPrime {
    public static void main(String[] args) {
        int number = 19;
        System.out.println(isPrime(16));
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
