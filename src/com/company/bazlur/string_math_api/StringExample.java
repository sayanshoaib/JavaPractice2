package com.company.bazlur.string_math_api;

import java.time.LocalDate;

public class StringExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String dateString = localDate.toString();
        System.out.println("Today is " + dateString);

        String anthem = "Amar shonar bangla. Ami tmy valobashi";
        System.out.println(anthem.lastIndexOf("a"));

        String spy = "James Bond OO7";
        System.out.println(spy.contains("Bond"));

        String password = "              a1b2c3d4e5               ";
        System.out.println(password);
        System.out.println(password.length());
        System.out.println(password.trim());
        System.out.println(password.trim().length());

        String company = "Apple, Facebook, Google, Microsoft, Tesla, Uber, Stripe, Amazon";
        String[] companies = company.split(",");

        for (String name : companies) {
            System.out.println(name.trim());
        }
        LocalDate localDate1 = LocalDate.now();
        String time = localDate1.toString();
        System.out.println(time.repeat(5));
    }
}

