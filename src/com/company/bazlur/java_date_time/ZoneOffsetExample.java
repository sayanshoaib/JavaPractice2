package com.company.bazlur.java_date_time;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        ZoneOffset easternTimeZoneOffset = ZoneOffset.of("-05:00");
        System.out.println("easternTimeZoneOffSet = " + easternTimeZoneOffset);
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("Default ZoneId: " + defaultZoneId);

        Set<String> availableZoneId =ZoneId.getAvailableZoneIds();
        for (String zoneId : availableZoneId) {
            System.out.println(zoneId);
        }

    }
}
