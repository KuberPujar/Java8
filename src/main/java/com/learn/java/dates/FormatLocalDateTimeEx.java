package com.learn.java.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTimeEx {
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }

    public static void parseLocalDateTime()
    {
     String dateTime="2021-05-15T04:50:58";
        LocalDateTime localDateTime=LocalDateTime.parse(dateTime);
        System.out.println("localDateTime:"+localDateTime);
        String dateTime1="2021-05-15T04:55:58";
        LocalDateTime localDateTime1=LocalDateTime.parse(dateTime1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTime1:"+localDateTime1);

        /**
         * Custom LocalDateTime format
         */
        String dateTime2="2021|05|15T05|01|58";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH|mm|ss");
        LocalDateTime localDateTime2=LocalDateTime.parse(dateTime2,dateTimeFormatter);
        System.out.println("localDateTime2:"+localDateTime2);

        String dateTime3="2021|05|15abc05|01|58";
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy|MM|dd'abc'HH|mm|ss");
        LocalDateTime localDateTime3=LocalDateTime.parse(dateTime2,dateTimeFormatter);
        System.out.println("localDateTime3:"+localDateTime3);


    }

    public static void formatLocalDateTime()
    {
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy|MM|dd'abc'HH|mm|ss");
        LocalDateTime localDateTime3=LocalDateTime.now();
        String formattedDate= localDateTime3.format(dateTimeFormatter1);
        System.out.println("formattedDate:"+formattedDate);
    }
}
