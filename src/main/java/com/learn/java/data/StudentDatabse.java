package com.learn.java.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabse {
    public static Supplier<Student> studentSupplier = () -> {
        Bike bike=new Bike("Bajaj","Palser 125");
     Student student=   new Student("Kuber", 2, 3, "Male", Arrays.asList("Coaching", "Teaching"));
     student.setBike(Optional.ofNullable(bike));
     return student;
    };

    public static List<Student> getAllStudents() {
        Student student1 = new Student();
        student1.setName("Kuber");
        student1.setGradeLevel(2);
        student1.setGoal(5);
        student1.setGender("Male");
        student1.setActivities(Arrays.asList("Cricket", "Reading", "Jumpping"));
        student1.setNoteBooks(10);

        Student student2 = new Student();
        student2.setName("Pujar");
        student2.setGradeLevel(2);
        student2.setGoal(2.5);
        student2.setGender("Male");
        student2.setActivities(Arrays.asList("Playing", "Reading", "Jumpping"));
        student2.setNoteBooks(20);

        Student student3 = new Student();
        student3.setName("John");
        student3.setGradeLevel(3);
        student3.setGoal(4.5);
        student3.setGender("Male");
        student3.setActivities(Arrays.asList("Climbing", "Trekking", "Cycling"));
        student3.setNoteBooks(15);

        Student student4 = new Student();
        student4.setName("Kavitha");
        student4.setGradeLevel(3);
        student4.setGoal(3);
        student4.setGender("Female");
        student4.setActivities(Arrays.asList("Tennis", "Carrum", "Gardening"));
        student4.setNoteBooks(25);

        Student student5 = new Student();
        student5.setName("Pinki");
        student5.setGradeLevel(4);
        student5.setGoal(2);
        student5.setGender("Female");
        student5.setActivities(Arrays.asList("Cricket", "Reading", "Jumpping"));
        student5.setNoteBooks(30);

        Student student6 = new Student();
        student6.setName("Paapu");
        student6.setGradeLevel(4);
        student6.setGoal(2);
        student6.setGender("Male");
        student6.setActivities(Arrays.asList("Cricket", "Reading", "Jumpping"));
        student6.setNoteBooks(36);

        List<Student> stdList = new ArrayList<>();
        stdList.add(student1);
        stdList.add(student2);
        stdList.add(student3);
        stdList.add(student4);
        stdList.add(student5);
        stdList.add(student6);
        return stdList;
    }
}
