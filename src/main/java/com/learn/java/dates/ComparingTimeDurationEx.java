package com.learn.java.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationEx {
    public static void main(String[] args) {
        LocalTime localTime= LocalTime.of(6,32);
        LocalTime localTime1=LocalTime.of(9,56);
        long diff=localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("diff:"+diff);
        Duration duration=Duration.between(localTime,localTime1);
        System.out.println("toMinutes:"+duration.toMinutes());
        Duration duration1=Duration.ofHours(9);
        System.out.println("toMinutes:"+duration1.toMinutes());
    }
}
