package com.learn.java.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatePeriodEx {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(2021,01,01);
        LocalDate localDate1=LocalDate.of(2018,01,01);

        /**
         * Comparing dates
         */

        Period period= Period.between(localDate1,localDate);
        System.out.println("period:"+period);
        Period period1=localDate1.until(localDate);
        System.out.println("getDays:"+period1.getDays());
        System.out.println("getMonths:"+period1.getMonths());
        System.out.println("getYears:"+period1.getYears());
        Period period2=Period.ofDays(20);
        System.out.println("period.getDays::"+period2.getDays());
        Period period3=Period.ofYears(10);
        System.out.println("getYears:"+period3.getYears());
        System.out.println("toTotalMonths:"+period3.toTotalMonths());
    }
}
