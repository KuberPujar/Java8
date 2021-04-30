package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapEx {
    public static void main(String[] args) {
        System.out.println(getActivities());
        System.out.println(getActivitiesCount());
    }

    public static List<String> getActivities()
    {
        return StudentDatabse.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static long getActivitiesCount()
    {
        return StudentDatabse.getAllStudents().stream().map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
}
