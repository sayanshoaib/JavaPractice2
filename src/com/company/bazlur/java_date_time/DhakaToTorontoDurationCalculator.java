package com.company.bazlur.java_date_time;

import java.time.*;

public class DhakaToTorontoDurationCalculator {
    public static void main(String[] args) {
        ZoneId dhakaZone = ZoneId.of("Asia/Dhaka");
        ZoneId torontoTimeZone = ZoneId.of("Canada/Eastern");

        LocalDateTime localTakeOffTime = LocalDateTime
                .of(2021, Month.FEBRUARY, 7, 10, 5);
        ZonedDateTime zonedTakeOffTime = ZonedDateTime.of(localTakeOffTime, dhakaZone);

        LocalDateTime localArrivalTIme = LocalDateTime
                .of(2021, Month.FEBRUARY, 8, 14, 30);
        ZonedDateTime zonedArrivalTime = ZonedDateTime.of(localArrivalTIme, torontoTimeZone);

        Duration flightDuration = Duration.between(zonedTakeOffTime, zonedArrivalTime);
        long hours = flightDuration.toHours();
        int minutesPart = flightDuration.toMinutesPart();

        System.out.printf("Total Duration: %d hours %d minutes", hours, minutesPart);
    }
}
