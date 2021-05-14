package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class DateTimeEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("localDateTime:"+localDateTime);
        LocalDateTime localDateTime1=LocalDateTime.of(2021,05,13,15,23,33,6985);
        System.out.println("localDateTime1:"+localDateTime1);
        LocalDateTime localDateTime2=LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2:"+localDateTime2);
        /**
         * Getting time and date from LocalDateTime instance
         */
        System.out.println("getHour:"+localDateTime.getHour());
        System.out.println("getMinute:"+localDateTime.getMinute());
        System.out.println("getDayOfMonth:"+localDateTime.getDayOfMonth());
        System.out.println("DAY_OF_MONTH:"+localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying LocalDateTime
         */
        System.out.println("plusHours:"+localDateTime.plusHours(2));
        System.out.println("minusDays:"+localDateTime.minusDays(2));
        System.out.println("withMonth:"+localDateTime.withMonth(4));
        /**
         * Converting LocalDate and LocalTime to LoalDateTime and vice-versa
         */
        LocalDate localDate=LocalDate.of(2021,05,14);
        System.out.println("atTime:"+localDate.atTime(LocalTime.now()));

        LocalTime localTime=LocalTime.of(21,40);
        System.out.println("atDate:"+localTime.atDate(LocalDate.now()));

        LocalDateTime localDateTime3=localTime.atDate(localDate);
        System.out.println("toLocalDate:"+localDateTime3.toLocalDate());
        System.out.println("toLocalTime:"+localDateTime3.toLocalTime());
    }
}
