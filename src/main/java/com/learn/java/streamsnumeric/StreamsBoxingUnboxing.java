package com.learn.java.streamsnumeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsBoxingUnboxing {
    public static void main(String[] args) {
        System.out.println("boxing:::" + boxing());
        System.out.println("unboxing and sum:::" + unBoxingAndSum(boxing()));
    }

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
    }

    public static int unBoxingAndSum(List<Integer> integerList) {
        return integerList.stream().mapToInt(Integer::intValue)
                .sum();
    }
}
