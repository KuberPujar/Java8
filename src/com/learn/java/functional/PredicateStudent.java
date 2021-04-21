package com.learn.java.functional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudent {
    static Predicate<Student> gpaStudentPredicate = student -> student.getGoal() > 3;
    static Predicate<Student> gradeAndGpaPredicate=student -> student.getGradeLevel()>2 && student.getGoal()>2;
    static List<Student> students = StudentDatabse.getAllStudents();

    public static void main(String[] args) {
        printStudentsByGpa();
        printStudentsByGpaAndGrade();
        printStudents();
    }

    public static void printStudentsByGpa() {
        System.out.println("Filter student by gpa::");
        students.forEach(student -> {
            if (gpaStudentPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void printStudentsByGpaAndGrade() {
        System.out.println("Filter student by gpa and grade::");
        students.forEach(student -> {
            if (gradeAndGpaPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void printStudents() {
        System.out.println("Filter students by gpa and grade::");
        students.forEach(student -> {
            if (gradeAndGpaPredicate.or(gpaStudentPredicate).test(student)) {
                System.out.println(student);
            }
        });
    }
}
