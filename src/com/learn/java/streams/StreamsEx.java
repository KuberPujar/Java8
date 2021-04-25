package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsEx {
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = student -> student.getGradeLevel() > 2;
        Predicate<Student> studentPredicate1 = student -> student.getGoal() > 2;
        Consumer<Student> studentConsumer= System.out::println;
        Consumer<Student> gradeLevelConsumer=student -> System.out.println("Students after 1st filter:: "+student);
        Consumer<Student> gpaStudentConsumer1=student ->  System.out.println("Students after 2nd filter:: "+student);
        Map<String, List<String>> stringListMap = StudentDatabse.getAllStudents()
                .stream()
                .peek(studentConsumer)
                .filter(studentPredicate)
                .peek(gradeLevelConsumer)
                .filter(studentPredicate1)
                .peek(gpaStudentConsumer1)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(stringListMap);
    }
}
