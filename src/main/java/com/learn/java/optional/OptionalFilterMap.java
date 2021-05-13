package com.learn.java.optional;

import com.learn.java.data.Bike;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.Optional;

public class OptionalFilterMap {
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }

    //filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabse.studentSupplier.get());
        studentOptional.filter(student -> student.getGoal() >= 3)
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {
        Optional<Student> optional = Optional.ofNullable(StudentDatabse.studentSupplier.get());
        optional.filter(student -> student.getGoal() >= 3)
                .map(Student::getActivities)
                .ifPresent(list -> list.forEach(s -> System.out.println(s)));
    }

    //flatmap
    public static void optionalFlatMap() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDatabse.studentSupplier.get());
        optionalStudent.filter(student -> student.getGoal() >= 3)
                .flatMap(Student::getBike)
                .map(Bike::getName)
                .ifPresent(System.out::println);
    }
}
