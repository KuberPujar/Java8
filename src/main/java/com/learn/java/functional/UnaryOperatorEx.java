package com.learn.java.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
    public static void main(String[] args) {
        UnaryOperator<String> str=s ->s.concat("default");
        System.out.println(str.apply("java8"));
    }
}
