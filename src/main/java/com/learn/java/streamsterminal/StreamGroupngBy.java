package com.learn.java.streamsterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;

public class StreamGroupngBy {
    public static void main(String[] args) {
        groupStudenstByGender();
        groupStudents();
    }

    public static void groupStudenstByGender() {
        Map<String, List<Student>> byStringListMap = StudentDatabse.getAllStudents().stream().collect(groupingBy(Student::getGender));
        System.out.println(byStringListMap);
    }

    public static void groupStudents()
    {
        Map<String,List<Student>> b=StudentDatabse.getAllStudents().stream()
                .collect(groupingBy(s->s.getGoal()>=3 ? "OUTSTANDING":"AVERAGE"));
        b.forEach((s, studentList) -> System.out.println(s+" "+studentList));
    }

}
