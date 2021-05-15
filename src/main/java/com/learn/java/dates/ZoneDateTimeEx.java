package com.learn.java.dates;

import java.time.*;

public class ZoneDateTimeEx {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime:" + zonedDateTime);
        System.out.println("getOffset:" + zonedDateTime.getOffset());
        System.out.println("getZone:" + zonedDateTime.getZone());

        System.out.println("getAvailableZoneIds:" + ZoneId.getAvailableZoneIds());
        ZoneId.getAvailableZoneIds().stream().sorted().filter(s -> s.contains("Asia")).forEach(System.out::println);
        System.out.println("getAvailableZoneIds().size()::" + ZoneId.getAvailableZoneIds().size());

        //ACT,AKT,AKT
        System.out.println("Asia/Calcutta::" + ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));
        System.out.println("Asia/Chongqing::" + ZonedDateTime.now(ZoneId.of("Asia/Chongqing")));
        System.out.println("Asia/Dacca::" + ZonedDateTime.now(ZoneId.of("Asia/Dacca")));
        System.out.println("Asia/Istanbul::" + ZonedDateTime.now(ZoneId.of("Asia/Istanbul")));
        System.out.println("Asia/Katmandu::" + ZonedDateTime.now(ZoneId.of("Asia/Katmandu")));
        System.out.println("Asia/Kolkata::" + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println("ZoneDateTime using clock::" + ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Chongqing"))));
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Colombo"));
        System.out.println("Colombo::" + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("Asia/Hong_Kong")));
        System.out.println("Hong-Kong::" + localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("instant::" + localDateTime2);

        /**
         * Convert from LocalDateTime, Instant to ZonedLocalDate/Time
         */

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("localDateTime3:" + localDateTime3);
        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("Asia/Hong_Kong"));
        System.out.println("zonedDateTime1::" + zonedDateTime1);
        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("instant::" + zonedDateTime2);
       OffsetDateTime offsetDateTime=localDateTime3.atOffset(ZoneOffset.ofHours(-8));
        System.out.println("offsetDateTime::"+offsetDateTime);
    }
}
