package com.learn.java.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEx {
    public static void main(String[] args) {
        System.out.println("sequentialStream sum time::" + checkPerformance(ParallelStreamEx::sequentialStream,20));
        System.out.println("parallelStream sum time::" + checkPerformance(ParallelStreamEx::parallelStream,20));

    }

    public static int sequentialStream() {
        return IntStream.rangeClosed(1, 1000).sum();
    }

    public static int parallelStream() {
        return IntStream.rangeClosed(1, 1000).parallel().sum();
    }

    public static long checkPerformance(Supplier<Integer> supplier, int noOfTimes) {
        long startTimes = System.currentTimeMillis();
        for (int i = 0; i < noOfTimes; i++) {
            supplier.get();
        }
        long endTimes = System.currentTimeMillis();
        return (endTimes - startTimes);
    }
}
