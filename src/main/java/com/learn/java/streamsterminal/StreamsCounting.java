package com.learn.java.streamsterminal;

import com.learn.java.data.StudentDatabse;

import java.util.stream.Collectors;

public class StreamsCounting {
    public static void main(String[] args) {
        System.out.println(counting());
    }
    public static long counting()
    {
        return StudentDatabse.getAllStudents().stream()
                .filter(student -> student.getGoal()>=3)
                .collect(Collectors.counting());
    }
}
