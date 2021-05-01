package com.learn.java.functional;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Consumer<Boolean> print=System.out::println;
        Predicate<Integer> evenPredicate=integer -> integer%2==0;

        System.out.println(evenPredicate.test(4));
        Predicate<Integer> divBy5And2Predicate=integer -> integer%5==0;
        print.accept(evenPredicate.and(divBy5And2Predicate).test(10));
    }

}
