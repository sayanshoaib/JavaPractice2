package com.company.bazlur.java_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateManipulation {

    public static void main(String[] args) {
        LocalDate firstDayOf2021
                = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate programmersDay = firstDayOf2021.plusDays(255);
        System.out.println("Next programmers Day = " +
                programmersDay);

        LocalTime bedTime = LocalTime.of(22, 30);
        LocalTime wakeUpTime = bedTime.plusHours(8);
        System.out.println("Wake up time: " + wakeUpTime);
    }

}
