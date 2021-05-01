package com.learn.java.streamsnumeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapEx {
    public static void main(String[] args) {
        List<Integer> integerList = mapToObj();
        System.out.println(integerList);
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }

    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5).mapToObj(s -> s).collect(Collectors.toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1, 5).mapToLong(s -> s).sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1, 5).mapToDouble(s -> s).sum();
    }
}
