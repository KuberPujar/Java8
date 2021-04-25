package com.learn.java.lambda;

import java.util.function.Consumer;

public class LambdaLocalVariableEx {
    public static void main(String[] args) {
        int i=0;
       // Consumer<Integer> c=i -> System.out.println(i); //compile error due local variable with same name not in scope in lambda expression.
        Consumer<Integer> c=System.out::println;
        c.accept(10);
    }
}
