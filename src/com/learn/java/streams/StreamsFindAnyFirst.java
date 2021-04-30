package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Optional;

public class StreamsFindAnyFirst {
    public static void main(String[] args) {
        Optional<Student> student = findAny(StudentDatabse.getAllStudents());
        if (student.isPresent()) {
            System.out.println("any find of >=3:::" + student.get());
        } else {
            System.out.println("Not found");
        }

        Optional<Student> studentFirst = findFirst(StudentDatabse.getAllStudents());
        if (studentFirst.isPresent()) {
            System.out.println("first find of >=3.5:::" + studentFirst.get());
        } else {
            System.out.println("Not found");
        }

    }

    public static Optional<Student> findAny(List<Student> studentList) {
        return studentList.stream()
                .filter(student -> student.getGoal() >= 3)
                .findAny();
    }

    public static Optional<Student> findFirst(List<Student> studentList) {
        return studentList.stream().filter(student -> student.getGoal() >= 3)
                .findFirst();
    }
}
