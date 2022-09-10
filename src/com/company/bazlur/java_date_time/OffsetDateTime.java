package com.company.bazlur.java_date_time;

import java.time.ZoneOffset;

public class OffsetDateTime {
    public static void main(String[] args) {
        ZoneOffset zoneOffset = ZoneOffset.of("+06:00");
        java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.now(zoneOffset);
        System.out.println("offsetDateTime = " + offsetDateTime);
    }
}
