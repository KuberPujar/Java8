package com.learn.java.defualt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodEx {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Apple","Pineapple","Guava","Pappaya");
        /*
         * prior java 8
         */
        Collections.sort(list);
        System.out.println("Before java 8 Collections.Sort()::"+list);

        /**
         * in java 8 and after
         */
        list.sort(Comparator.naturalOrder());
        System.out.println("in java 8 default methods in interface::"+list);
        list.sort(Comparator.reverseOrder());
        System.out.println("in java 8 default methods in interface::"+list);
    }
}
