package com.company.bazlur.java_date_time;

public class practice {
    public static void main(String[] args) {
        String encoded = String.valueOf(encode("I am a student", 2));
        System.out.println(encoded);

    }

    public static char[] encode(String s, int j) {
        char[] alphabets = s.toCharArray();
        for (int i = 0; i < alphabets.length; i++) {
            if (i == j) {
                int asciiValueOfCurrentIndex = (int)alphabets[i];
                if (asciiValueOfCurrentIndex == 32) {
                    continue;
                } else {
                    alphabets[i] += 2;
                    j += 2;
                }
            }
        }
        return alphabets;
    }
}
