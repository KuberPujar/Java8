package com.learn.java.lambda;

import java.util.function.Consumer;

/**
 * Lambda's are allowed to use local variables
 * but not allowed to modify it even though
 * they are not declared as final. This concept is called
 * effectively final.
 */
public class LambdaReassignLocalVariableEx {
    static int value=0;
    public static void main(String[] args) {
        //int value=0; //cann't reassign value of local variable in lambda.
        Consumer<Integer> c=integer ->
        {
            value++;
            System.out.println(value+9);
        };
        c.accept(10);
    }
}
