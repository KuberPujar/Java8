package com.learn.java.functional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class StudentBiFunction {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studenFunction = (students, studentPredicate) ->
    {
        Map<String, Double> studentMap = new HashMap<>();
        students.forEach(
                student -> {
                    if (studentPredicate.test(student)) {
                        studentMap.put(student.getName(), student.getGoal());
                    }
                }
        );
        return studentMap;
    };

    public static void main(String[] args) {
        System.out.println(studenFunction.apply(StudentDatabse.getAllStudents(), PredicateStudent.gpaStudentPredicate));
    }
}
