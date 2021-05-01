package com.learn.java.functional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerEx {
    static List<Student> studentList = StudentDatabse.getAllStudents();
    static Predicate<Student> p1 = student -> student.getGradeLevel() > 1;
    static Predicate<Student> p2 = student -> student.getGoal() > 2;
    static BiPredicate<Integer,Double> biPredicate=(integer, aDouble) -> integer>1 && aDouble>2;
    static BiConsumer<String, List<String>> stringListBiConsumer = (s, strings) -> System.out.println("Name::" + s + " , Activities::" + strings);
    static Consumer<Student> studentConsumer = student -> {
        if (biPredicate.test(student.getGradeLevel(),student.getGoal())) {
            stringListBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    static void printStudents(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        printStudents(studentList);
    }
}
