package com.company.kunalKushwaha.DSAbootcamp.Lecture20;

public class StringgBuilderr {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch + " ");
        }

        System.out.println(builder.toString());
    }
}
