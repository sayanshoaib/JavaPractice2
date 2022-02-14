package com.company.kunalKushwaha.DSAbootcamp.Lecture22;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Abba";
        int start = 0;
        int end = word.length() - 1;
        if (palindrome(word, start, end)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("It is not");
        }

    }

    static boolean palindrome(String input, int start, int end) {

        if (input.length() == 0 || input.length() == 1) {
            return true;
        }

        if (input.charAt(start) == input.charAt(end)) {
            return palindrome(input, start++, end--);
        }

        return false;
    }
}
