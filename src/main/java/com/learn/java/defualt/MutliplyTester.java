package com.learn.java.defualt;

import java.util.Arrays;
import java.util.List;

public class MutliplyTester {
    public static void main(String[] args) {
        MultiplyImpl multiply=new MultiplyImpl();
        List<Integer> integerList=Arrays.asList(1,2,3,2,4,7,9,5,5);
        System.out.println(multiply.multiply(integerList));
        System.out.println(multiply.size(integerList));
        System.out.println(Multiplier.isEmpty(integerList));
    }
}
