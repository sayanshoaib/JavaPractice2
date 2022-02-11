package com.company.bazlur.javaProgramming.chap12;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        String[] brackets = {
                "(()){}()", "({})", "({}(", "){})"
        };
        for (String exp : brackets) {
            String isBalanced = isBalanced(exp) ? "Balanced" : "Not Balanced";
            System.out.println(isBalanced);
        }
    }

    private static boolean isBalanced(String input) {
        Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                deque.push(c);
            } else if (c == ']') {
                if (deque.isEmpty() || deque.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (deque.isEmpty() || deque.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (deque.isEmpty() || deque.pop() != '{') {
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }
}
