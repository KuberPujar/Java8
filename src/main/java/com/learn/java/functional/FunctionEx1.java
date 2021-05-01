package com.learn.java.functional;

import java.util.function.Consumer;

public class FunctionEx1 {
    public static String performConcat(String s) {
        return FunctionEx.addSomeString.apply(s);
    }

    static Consumer<String> print = System.out::println;

    public static void main(String[] args) {
        String result = performConcat("hello");
        print.accept(result);
    }
}
