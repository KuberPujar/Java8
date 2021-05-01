package com.learn.java.streamsterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.stream.Collectors;

public class StreamsJoining {
    public static void main(String[] args) {
        System.out.println("joining_1::"+joining());
        System.out.println("joining with delimiter::"+joiningWithDelimiter());
        System.out.println("joining with delimiter,suffix,prefix::"+joiningWithDelimiterPrefixSuffix());
    }
    public static String joining()
    {
        return StudentDatabse.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joiningWithDelimiter()
    {
        return StudentDatabse.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joiningWithDelimiterPrefixSuffix()
    {
        return StudentDatabse.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }
}
