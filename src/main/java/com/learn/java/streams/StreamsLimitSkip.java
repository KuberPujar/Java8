package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkip {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 6, 9, 10);
        Optional<Integer> limit = limit(integerList);
        if (limit.isPresent()) {
            System.out.println("sum of limit numbers::" + limit.get());
        } else {
            System.out.println("Number not found");
        }

        Optional<Integer> skip = skip(integerList);
        if (skip.isPresent()) {
            System.out.println("sum non of skip numbers::" + skip.get());
        } else {
            System.out.println("Number not found");
        }
    }

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(2)
                .reduce(Integer::sum);
    }
}
