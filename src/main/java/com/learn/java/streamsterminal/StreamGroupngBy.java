package com.learn.java.streamsterminal;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;
import java.util.*;
import static java.util.stream.Collectors.*;

public class StreamGroupngBy {
    public static void main(String[] args) {
        groupStudenstByGender();
        groupStudents();
        groupStudentsByGrade();
        groupStudentsWithNoptebook();
        groupByThreeArguments();
        groupByMaxGpa();
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

    public static void groupStudentsByGrade()
    {
        Map<Integer,Map<String,List<Student>>> b=StudentDatabse.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,groupingBy(s->s.getGoal()>=3 ? "OUTSTANDING":"AVERAGE")));
        b.forEach((s, studentList) -> System.out.println(s+" "+studentList));
    }

    public static void groupStudentsWithNoptebook()
    {
        Map<String,Integer> b=StudentDatabse.getAllStudents().stream()
                .collect(groupingBy(Student::getName,summingInt(Student::getNoteBooks)));
        b.forEach((s, integer) -> {
            System.out.println(s + "=" + integer);
        });
    }

    public static void groupByThreeArguments()
    {
    LinkedHashMap<String, Set<Student>> stringSetLinkedHashMap= StudentDatabse.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(stringSetLinkedHashMap);
    }

    public static void groupByMaxGpa()
    {
       Map<Integer,Student> integerListMap= StudentDatabse.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(maxBy(Comparator.comparing(Student::getGoal)),Optional::get)));
        System.out.println(integerListMap);
    }
}
