package com.learn.java.streamsnumeric;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamEx {
    public static void main(String[] args) {
        Optional<Integer> sum = getSum(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        if (sum.isPresent()) {
            System.out.println("sum using normal method::" + sum.get());
        } else {
            System.out.println("sum not found");
        }
        OptionalInt summ=getSumUsingIntStream(1,9);
        if(summ.isPresent())
        {
            System.out.println("sum using IntStream method::" + summ.getAsInt());
        } else {
            System.out.println("sum not found");
        }
    }

    public static Optional<Integer> getSum(List<Integer> integerList) {
        return integerList.stream().reduce(Integer::sum);
    }

    public static OptionalInt getSumUsingIntStream(int start, int end) {
        return IntStream.rangeClosed(start, end).reduce(Integer::sum);
    }
}
