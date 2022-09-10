package com.company.bazlur.java_date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate firstPublished = LocalDate.of(2017, Month.FEBRUARY, 14);
        System.out.println("First published: " + firstPublished);

    }
}
