package com.learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxEx {
    public static void main(String[] args) {
        Integer [] arr={2, 5, 10, 25, 3, 7, 9};
        List<Integer> integers = Arrays.asList(2, 5, 10, 25, 3, 7, 9);
        System.out.println(getMaxValue(getArrayToList(arr)).get());
        System.out.println(getMinValue(integers).get());
        System.out.println(getSum(integers).get());
        System.out.println(getAverage(integers));
        //System.out.println(getMaxValue(Arrays.asList()));
    }

    private static Optional<Integer> getMaxValue(List<Integer> integers) {
        return integers.stream()
                .reduce((Integer::max));
    }

    private static Optional<Integer> getMinValue(List<Integer> integers) {
        return integers.stream()
                .reduce(Integer::min);
    }

    private static Optional<Integer> getSum(List<Integer> integers) {
        return integers.stream()
                .reduce(Integer::sum);
    }

    private static double getAverage(List<Integer> integers)
    {
       Optional<Integer> sum =integers.stream().reduce(Integer::sum);
       return sum.get()/integers.size();
    }

    private static <T> List<T> getArrayToList(T arr[])
    {
        List<T> list=new ArrayList<T>();
        for(T t:arr)
        {
            list.add(t);
        }
        return list;
    }
}
