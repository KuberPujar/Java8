package com.learn.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfIterateGenerate {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("kuber", "Pujar", "class");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x -> x * 2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> raSupplier = new Random()::nextInt;
        Stream.generate(raSupplier).limit(10).forEach(System.out::println);
    }
}
