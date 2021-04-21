package com.learn.java.functional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerEx {
    static Consumer<Student> studentConsumer = (student) -> {
        System.out.println(student.toString());
    };

    static Consumer<Student> nameConsumerr = student -> {
        System.out.print(student.getName());
    };
    static Consumer<Student> activityConsumer = student -> {
        System.out.println(student.getActivities());
    };

    static Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase(Locale.GERMAN));

    public static void main(String[] args) {

        consumer.accept("flower");
        printStudents();
        printNamesAndActivities();
    }

    public static void printStudents() {
        List<Student> stdList = StudentDatabse.getAllStudents();
        stdList.forEach(studentConsumer);
    }

    public static void printNamesAndActivities() {
        List<Student> stdList = StudentDatabse.getAllStudents();
        stdList.forEach(nameConsumerr.andThen(activityConsumer));
    }
}
