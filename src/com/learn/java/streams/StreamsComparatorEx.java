package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorEx {
    public static void main(String[] args) {
        System.out.println(getStudentsByName());
        System.out.println(getStudentsByGpa());
        System.out.println(getStudentsByGpaDesc());
    }

    public static List<Student> getStudentsByName() {
        return StudentDatabse.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static  List<Student> getStudentsByGpa()
    {
        return  StudentDatabse.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGoal))
                .collect(Collectors.toList());
    }

    public static  List<Student> getStudentsByGpaDesc()
    {
        return  StudentDatabse.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGoal).reversed())
                .collect(Collectors.toList());
    }
}
