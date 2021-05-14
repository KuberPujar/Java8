package com.learn.java.dates;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println("localTime::"+localTime);
        LocalTime localTime1=LocalTime.of(12,59);
        System.out.println("localTime1:"+localTime1);
        LocalTime localTime2=LocalTime.of(12,59,59);
        System.out.println("localTime2:"+localTime2);
        LocalTime  localTime3=LocalTime.of(12,59,59,98926952);
        System.out.println("localTime3:"+localTime3);
        LocalTime localTime4=LocalTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("localTime4::"+localTime4);

        /***
         * getting values from local time instance
         */

        System.out.println("getHour::"+localTime.getHour());
        System.out.println("getMinute::"+localTime.getMinute());
        System.out.println("CLOCK_HOUR_OF_DAY::"+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("toSecondOfDay::"+localTime.toSecondOfDay());

        /*
         *Modify values of local time
         */
        System.out.println("minusHours:"+localTime.minusHours(2));
        System.out.println("ChronoUnit.HOURS:"+localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("MIDNIGHT:"+localTime.with(LocalTime.MIDNIGHT));
        System.out.println("ChronoField.HOUR_OF_DAY:"+localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("plusMinutes:"+localTime.plusMinutes(2));
        System.out.println("withHour:"+localTime.withHour(2));
    }
}
