package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapEx {
    public static void main(String[] args) {
        System.out.println(getNameList());
        System.out.println(getNameSet());
    }

    public static List<String> getNameList() {
        return StudentDatabse.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> getNameSet() {
        return StudentDatabse.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }
}
