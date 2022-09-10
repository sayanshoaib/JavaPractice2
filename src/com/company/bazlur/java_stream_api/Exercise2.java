package com.company.bazlur.java_stream_api;

// Check if a name's first two letter matcher with last two later
public class Exercise2 {
    public static void main(String[] args) {
        String name = "shush";
        System.out.println(isMatching(name));
    }

    private static boolean isMatching(String name) {
        String firstTwoChar = name.substring(0, 2);
        System.out.println(firstTwoChar);
        if (name.endsWith(firstTwoChar)) {
            return true;
        } else {
            return false;
        }
    }
}