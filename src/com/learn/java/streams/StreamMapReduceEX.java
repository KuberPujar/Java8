package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

public class StreamMapReduceEX {
    public static void main(String[] args) {
        System.out.println(getNoteBooks());
    }

    private static int getNoteBooks() {
        return StudentDatabse.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equalsIgnoreCase("Female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }
}
