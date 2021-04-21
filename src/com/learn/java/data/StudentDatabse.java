package com.learn.java.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabse {

    public static List<Student> getAllStudents()
    {
        Student student1=new Student();
        student1.setName("Kuber");
        student1.setGradeLevel(2);
        student1.setGoal(5);
        student1.setGender("Male");
        student1.setActivities(Arrays.asList("Cricket","Reading","Jumpping"));

        Student student2=new Student();
        student2.setName("Pujar");
        student2.setGradeLevel(2);
        student2.setGoal(2.5);
        student2.setGender("Male");
        student2.setActivities(Arrays.asList("Playing","Reading","Jumpping"));

        Student student3=new Student();
        student3.setName("John");
        student3.setGradeLevel(3);
        student3.setGoal(4.5);
        student3.setGender("Male");
        student3.setActivities(Arrays.asList("Climbing","Trekking","Cycling"));

        Student student4=new Student();
        student4.setName("Tom");
        student4.setGradeLevel(3);
        student4.setGoal(3);
        student4.setGender("Male");
        student4.setActivities(Arrays.asList("Tennis","Carrum","Gardening"));

        Student student5=new Student();
        student5.setName("Quinto");
        student5.setGradeLevel(4);
        student5.setGoal(2);
        student5.setGender("Male");
        student5.setActivities(Arrays.asList("Cricket","Reading","Jumpping"));

        Student student6=new Student();
        student6.setName("Paapu");
        student6.setGradeLevel(4);
        student6.setGoal(2);
        student6.setGender("Male");
        student6.setActivities(Arrays.asList("Cricket","Reading","Jumpping"));
        List<Student> stdList=new ArrayList<>();
        stdList.add(student1);
        stdList.add(student2);
        stdList.add(student3);
        stdList.add(student4);
        stdList.add(student5);
        stdList.add(student6);
        return stdList;
    }
}
