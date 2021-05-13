package com.learn.java.parallelstream;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        getParallelStudentActivities();
        getSequentiallyStudentActivities();
    }

    public static List<String> getSequentiallyStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> activityList = StudentDatabse.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("sequential time::" + duration);
        return activityList;
    }

    public static List<String> getParallelStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> activityList = StudentDatabse.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("parallel time::" + duration);
        return activityList;
    }
}
