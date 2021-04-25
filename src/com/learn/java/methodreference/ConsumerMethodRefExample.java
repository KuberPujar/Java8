package com.learn.java.methodreference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.function.Consumer;

public class ConsumerMethodRefExample {
    /**
     * classname::methodName
     **/
    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDatabse.getAllStudents().forEach(c1);
        StudentDatabse.getAllStudents().forEach(c2);
    }
}
