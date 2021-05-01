package com.learn.java.streamsnumeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRanges {
    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,50);
        System.out.println("IntStream count::"+intStream.count());
        IntStream.range(1,50).forEach(s-> System.out.print(s+","));
        System.out.println("\n"+"RangeClosed count::"+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(s-> System.out.print(s+","));
        System.out.println("\n"+"LongStream range count::"+ LongStream.range(1,50).count());
        LongStream.range(1,50).forEach(s-> System.out.print(s+","));
        System.out.println("\n"+"RangeClosed count for LongStream::"+LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(s-> System.out.print(s+","));
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(System.out::println);
    }
}
