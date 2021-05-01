package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterEx {
    public static void main(String[] args) {
        getFemaleStudents().forEach(System.out::println);
    }

    public static List<Student> getFemaleStudents() {
        return StudentDatabse.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .filter(student -> student.getGoal()>2)
                .collect(Collectors.toList());
    }
}
