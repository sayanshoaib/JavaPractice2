package com.company.bazlur.string_math_api;

import java.lang.management.OperatingSystemMXBean;

public class Immutable {
    public static void main(String[] args) {
        String currency1 = "Taka";
        String currency2 = "Taka";
        System.out.println(currency1.equals(currency2));
        System.out.println(currency1 == currency2);

        String currency3 = "Dollar";
        currency1 = currency3;
        System.out.println(currency1.equals(currency2));
        System.out.println(currency3.equals(currency1));
        String curr = currency2 + currency3;
        System.out.println(curr);
        currency3 = "Euro";
        System.out.println(currency1);
        System.out.println(curr);
    }
}
