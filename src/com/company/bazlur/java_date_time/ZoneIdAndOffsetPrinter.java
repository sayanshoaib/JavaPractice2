package com.company.bazlur.java_date_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneIdAndOffsetPrinter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId id = ZoneId.of(zoneId);
            ZonedDateTime zonedDateTime = now.atZone(id);
            ZoneOffset zoneOffset = zonedDateTime.getOffset();
            String offset = zoneOffset.getId().replaceAll("Z", "+00:00");
        }
    }
}
