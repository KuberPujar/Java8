package com.learn.java.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatingLocalDateEx {
    public static void main(String[] args) {
        parseLocalDate();
        formateLocalDate();
    }

    public static void parseLocalDate() {
        /**
         * String to a LocalDate
         */
        String date = "2021-05-15";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate:" + localDate);
        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println("localDate1:" + localDate1);

        String date1="20210515";
        LocalDate localDate2=LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2:"+localDate2);

        /**
         * Custom defined date format
         */
        String date2="2021|05|15";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3=LocalDate.parse(date2,dateTimeFormatter);
        System.out.println("localDate3:"+localDate3);

        String date3="2021*05*15";
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("yyyy*MM*dd");
        LocalDate localDate4=LocalDate.parse(date3,dateTimeFormatter1);
        System.out.println("localDate3:"+localDate4);
    }

    public static void formateLocalDate()
    {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate=LocalDate.now();
        String formattedDate=localDate.format(dateTimeFormatter);
        System.out.println("formattedDate::"+formattedDate);
    }
}
