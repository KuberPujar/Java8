package com.learn.java.optional;

import com.learn.java.data.Student;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> name = getStudentNamesOptional();
        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("Name not found");
        }
    }

    public static Optional<String> getStudentNamesOptional() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDatabse.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            studentOptional.get();
            return studentOptional.map(Student::getName);
        } else {
            return Optional.empty();
        }
    }
}
