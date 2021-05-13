package com.learn.java.defualt;

public interface interface2 extends interace1{
    default void methodB()
    {
        System.out.println("Inside methodB");
    }

    @Override
    default void methodA() {
        System.out.println("inside interface2 methodA"+interface2.class);
    }
}
