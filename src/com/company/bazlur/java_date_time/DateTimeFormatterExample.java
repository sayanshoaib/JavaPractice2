package com.company.bazlur.java_date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        String formattedTime = timeNow.format(DateTimeFormatter.ISO_TIME);
        System.out.println("formattedTime = " + formattedTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String zonedDateTimeFormatted = zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Zoned date time formatted: " + zonedDateTimeFormatted);

        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTimeFormatted = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Local date time formatted: " + localDateTimeFormatted);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        String offsetDateFormatted = offsetDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Offset date time formatted: " + offsetDateFormatted);
    }
}
