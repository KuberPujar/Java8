package com.learn.java.dates;

import com.sun.source.tree.UnionTypeTree;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.*;

public class Date2Ex {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("localDate::"+localDate);
        LocalDate laLocalDate1=LocalDate.of(2021,05,17);
        System.out.println("laLocalDate1"+laLocalDate1);
        LocalDate localDate1=LocalDate.ofYearDay(2021,59);
        System.out.println("localDate1::"+localDate1);
        System.out.println("localDate.getMonth()::"+localDate.getMonth());
        System.out.println("localDate.getDayOfMonth()::"+localDate.getDayOfMonth());
        System.out.println("localDate.getDayOfWeek()::"+localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear()::"+localDate.getDayOfYear());
        System.out.println("localDate.getMonthValue()::"+localDate.getMonthValue());
        System.out.println("localDate.getYear()::"+localDate.getYear());
        System.out.println("localDate.getChronology()::"+localDate.getChronology());
        System.out.println("localDate.getEra()::"+localDate.getEra());
        System.out.println("localDate.get(ChronoField.DAY_OF_MONTH)::"+localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying local dates
         */
        System.out.println("plusDays::"+localDate.plusDays(2));
        System.out.println("plusMonths::"+localDate.plusMonths(4));
        System.out.println("plusWeeks::"+localDate.plusWeeks(16));
        System.out.println("plusYears::"+localDate.plusYears(2568));
        System.out.println("plus with long amount and ChronoUnit::"+localDate.plus(1, ChronoUnit.MONTHS));
        System.out.println("plus with TemporalAmount::"+localDate.plus(Period.ofYears(236)));
        System.out.println("with::"+localDate.with(ChronoField.YEAR,2019));
        System.out.println("withYear::"+localDate.withYear(2025));
        System.out.println("TemporalAdjusters::"+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit minus::"+localDate.minus(2,ChronoUnit.MONTHS));

        /**
         * Additional support methods
         */
        System.out.println("leapYear::"+LocalDate.ofYearDay(2020,01).isLeapYear());
        System.out.println("isEqual::"+localDate.isEqual(localDate1));
        System.out.println("isAfter::"+localDate.isAfter(localDate1));
        System.out.println("isBefore::"+localDate.isBefore(localDate1));

        /**
         * Unsupported
         */
        //System.out.println("unsupported minutes::"+localDate.minus(10,ChronoUnit.MINUTES));
        System.out.println("isSupported::"+localDate.isSupported(ChronoUnit.MINUTES));
    }
}
