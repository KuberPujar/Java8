package com.learn.java.defualt;

public class Cleint14 implements interace1,Interface4{
    public void methodA()
    {
        System.out.println("Inside methodA::"+Cleint14.class);
    }

    public static void main(String[] args) {
        Cleint14 cleint14=new Cleint14();
        cleint14.methodA();
    }
}
