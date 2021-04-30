package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceEx {
    public static void main(String[] args) {
        System.out.println(getMultiplication(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        System.out.println(getMultiplicationWithoutDefaultVal(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)).isPresent());
        System.out.println(getMultiplicationWithoutDefaultVal(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)).get());
        List<Integer> list = new ArrayList<>();
        System.out.println(getMultiplicationWithoutDefaultVal(list).isPresent());
        //System.out.println(getMultiplicationWithoutDefaultVal(list).get());
        if (getHighestGpaStudent().isPresent()) {
            System.out.println(getHighestGpaStudent().get());
        }

    }

    public static int getMultiplication(List<Integer> integers) {
        return integers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> getMultiplicationWithoutDefaultVal(List<Integer> integers) {
        return integers.stream()
                .reduce((a, b) -> a * b);
    }


    public static Optional<Student> getHighestGpaStudent() {
        return StudentDatabse.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGoal() > s2.getGoal()) ? s1 : s2);
    }

}
