package com.learn.java.defualt;

public interface Interface3 {
    default void methodC()
    {
        System.out.println("Inside methodC");
    }
}
