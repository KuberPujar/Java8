package com.learn.java.streamsterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumingAveraging {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(average());
    }
    public static int sum()
    {
        return StudentDatabse.getAllStudents().stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static double average()
    {
        return StudentDatabse.getAllStudents().stream()
                .collect(averagingInt(Student::getNoteBooks));
    }
}
