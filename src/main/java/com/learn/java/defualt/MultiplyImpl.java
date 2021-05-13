package com.learn.java.defualt;

import java.util.List;

public class MultiplyImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1,(x,y)->(x*y));
    }

    @Override
    public int size(List<Integer> integerList) {
        System.out.println("invoke in MultiplyImpl class::");
        return Multiplier.super.size(integerList);
    }


}
