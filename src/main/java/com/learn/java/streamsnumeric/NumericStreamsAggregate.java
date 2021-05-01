package com.learn.java.streamsnumeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggregate {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,50).sum());
        OptionalInt max=IntStream.rangeClosed(1,50).max();
        if(max.isPresent())
        {
            System.out.println("max:::"+max.getAsInt());
        }
        else
        {
            System.out.println("value not present");
        }

        OptionalInt min=IntStream.rangeClosed(1,50).min();
        if(min.isPresent())
        {
            System.out.println("min::"+min.getAsInt());
        }
        else
        {
            System.out.println("value not present");
        }

       OptionalDouble average= IntStream.rangeClosed(1,50).asDoubleStream().average();
        if(average.isPresent())
        {
            System.out.println("average::"+average.getAsDouble());
        }
    }
}
