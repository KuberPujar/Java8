package com.learn.java.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceEx {
    static Function<String, String> toUpperCaseFunction =String::toUpperCase;
    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseFunction.apply("kuber"));
        System.out.println(toUpperCaseMethodRef.apply("kuber"));
    }
}
