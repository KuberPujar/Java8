package com.learn.java.streamsterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapping {
    public static void main(String[] args) {
        List<String> mapping= StudentDatabse.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(mapping);

        Set<String> map=StudentDatabse.getAllStudents().stream().map(Student::getName)
                .collect(Collectors.toSet());
        System.out.println(map);
    }
}
