package com.learn.java.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorUsingLambda {
    public static void main(String[] args) {
        //before java 8
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("comparator before java8 = " + comparator.compare(2,3));

        //using java 8 lambda

        Comparator<Integer> comparator1=(a,b)->{
            return  a.compareTo(b);
        };

        System.out.println("comparator after java8 = " + comparator1.compare(2,3));
    }
}
