package com.learn.java.functional;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Consumer<Boolean> print=(s)-> System.out.println(s);
        Predicate<Integer> evenPredicate=integer -> {
        return  integer%2==0;
        };
        System.out.println(evenPredicate.test(4));
        Predicate<Integer> divBy5And2Predicate=integer -> integer%5==0;
        print.accept(evenPredicate.and(divBy5And2Predicate).test(10));
    }

}
