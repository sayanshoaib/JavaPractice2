package com.company.bazlur.java_date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZoneId dhaka = ZoneId.of("Asia/Dhaka");
        ZonedDateTime dhakaTime = ZonedDateTime.now(dhaka);
        System.out.println("dhakaTime = " + dhakaTime);

        ZoneId canadaTimeZone = ZoneId.of("Canada/Eastern");
        ZonedDateTime canadaTime = dhakaTime.withZoneSameInstant(canadaTimeZone);
        System.out.println("canadaTime = " + canadaTime);
    }
}
