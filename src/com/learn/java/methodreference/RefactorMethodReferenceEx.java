package com.learn.java.methodreference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;
import java.util.function.Predicate;

public class RefactorMethodReferenceEx {
    static Predicate<Student> studentPredicate = RefactorMethodReferenceEx::getSudents;

    public static boolean getSudents(Student student) {
        return student.getGradeLevel() >= 2;
    }

    public static void main(String[] args) {
        System.out.println(studentPredicate.test(StudentDatabse.studentSupplier.get()));
    }
}
