package com.learn.java.functional;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorEx {
    public static void main(String[] args) {
        IntBinaryOperator binaryOperator = (integer, integer2) -> integer * integer2;
        System.out.println(binaryOperator.applyAsInt(5, 3));
        Comparator<Integer> maxMinBy = Integer::compareTo;
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(maxMinBy);
        System.out.println(maxBy.apply(4,6));
        BinaryOperator<Integer> minBy=BinaryOperator.minBy(maxMinBy);
        System.out.println(minBy.apply(6,9));
    }
}
