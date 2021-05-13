package com.learn.java.parallelstream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }

    public static int sequentialSum(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("sduration::" + duration);
        return sum.isPresent() ? sum.get() : sum.orElse(0);
    }

    public static int parallelSum(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Optional<Integer> sum = list.stream()
                .parallel()
                .reduce(Integer::sum);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("pduration::" + duration);
        return sum.isPresent() ? sum.get() : sum.orElse(0);
    }
}
