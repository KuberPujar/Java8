package com.learn.java.functional;

import java.util.function.Function;

public class FunctionEx {
    static Function<String,String> function= String::toUpperCase;
static Function<String,String> addSomeString=s -> s.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("Result is::"+function.apply("kuber"));
        System.out.println("Result of andThen is::"+function.andThen(addSomeString).apply("kuber"));
        System.out.println("Result of  compose is::"+function.compose(addSomeString).apply("kuber"));
    }
}
