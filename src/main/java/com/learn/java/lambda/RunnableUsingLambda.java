package com.learn.java.lambda;

public class RunnableUsingLambda {
    public static void main(String [] args)
    {
//legacy Runnable
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("legacy runnable 1");
            }
        };

        new Thread(runnable).start();

        //lambda
        Runnable runnable1=()->System.out.println("using lambda..");
        new Thread(runnable1).start();

        new Thread(()->System.out.println("using lambda 2")).start();

        new Thread(()->
        {
            System.out.println("lambda...");
            System.out.println("lambda......."+"hello");
        });
    }
}
