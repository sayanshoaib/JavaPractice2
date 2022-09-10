package com.company.bazlur.java_date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatStyleDateExample {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String fullDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("fullDate = " + fullDate);

        String longDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("longDate = " + longDate);

        String mediumDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("mediumDate = " + mediumDate);

        String shortDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("shortDate = " + shortDate);

        String date = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(date);

        LocalTime timeNow = LocalTime.now();

        // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: MonthOfYear

//        String mediumTimeNow = timeNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
//        System.out.println("mediumTimeNow = " + mediumTimeNow);
//
//        String shortTimeNow = timeNow.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
//        System.out.println("shortTimeNow = " + shortTimeNow);

        Locale.setDefault(Locale.CHINA);
        ZonedDateTime todayTime = ZonedDateTime.now();
        String todayTimeMedium = todayTime.format(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.LONG));
        System.out.println("timeMedium = " + todayTimeMedium);

        LocalTime newTimeNow = LocalTime.now();
        String formattedTime = newTimeNow.format(DateTimeFormatter.ISO_TIME);
        System.out.println("formattedTime = " + formattedTime);

    }
}
