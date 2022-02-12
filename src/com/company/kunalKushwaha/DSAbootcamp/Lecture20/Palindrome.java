package com.company.kunalKushwaha.DSAbootcamp.Lecture20;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String query = "Madam";
        String answer = palindrome(query) ? "Palindrome" : "Not Palindrome";
        System.out.println(answer);
    }

    static boolean palindrome(String input) {
        String inputInLowerCase = input.toLowerCase();
        int start = 0;
        int end = inputInLowerCase.length() - 1;

        while (start < end) {
            if (inputInLowerCase.charAt(start) == inputInLowerCase.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}
