package com.learn.java.defualt;

public class Client123 implements interace1,interface2,Interface3{

    //1->class that implements the iterface
    //2->sub-interface that extends the interface
    public void methodA()
    {
        System.out.println("inside methodA of ::"+Client123.class);
    }
    public static void main(String[] args) {
        Client123 client123=new Client123();
        client123.methodA();
        client123.methodB();
        client123.methodC();
    }
}
