package com.learn.java.functional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Kuber", 3, 4, "Male", Arrays.asList("Cricket", "Reading"));
        System.out.println(studentSupplier.get());

        Supplier<List<Student>> listSupplier = StudentDatabse::getAllStudents;
        System.out.println(listSupplier.get());
    }
}

