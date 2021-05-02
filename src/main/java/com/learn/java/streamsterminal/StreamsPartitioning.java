package com.learn.java.streamsterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioning {
    public static void main(String[] args) {
        patitionByGpa();
        patitionByGpa1();
    }

    public static void patitionByGpa() {
        Predicate<Student> studentPredicate = student -> student.getGoal() >= 3;
        Map<Boolean, List<Student>> dsd = StudentDatabse.getAllStudents().stream()
                .collect(partitioningBy(studentPredicate));
        System.out.println(dsd);
    }

    public static void patitionByGpa1() {
        Predicate<Student> studentPredicate = student -> student.getGoal() >= 3;
        Map<Boolean, Set<Student>> dsd = StudentDatabse.getAllStudents().stream()
                .collect(partitioningBy(studentPredicate,toSet()));
        System.out.println(dsd);
    }
}
