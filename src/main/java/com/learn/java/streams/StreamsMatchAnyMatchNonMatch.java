package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;

public class StreamsMatchAnyMatchNonMatch {

    public static void main(String[] args) {
        List<Student> studentList= StudentDatabse.getAllStudents();
        System.out.println("all match ::"+allMatch(studentList));
        System.out.println("any match ::"+anyMatch(studentList));
        System.out.println("none match ::"+noneMatch(studentList));
    }

    public static boolean allMatch(List<Student> studentList)
    {
        return studentList.stream().allMatch(student -> student.getGoal()>=2);
    }

    public static boolean anyMatch(List<Student> studentList)
    {
        return studentList.stream().anyMatch(student -> student.getGoal()>=3);
    }

    public static boolean noneMatch(List<Student> studentList)
    {
        return studentList.stream().noneMatch(student -> student.getGoal()>=4);
    }
}
