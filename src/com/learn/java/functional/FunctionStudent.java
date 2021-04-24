package com.learn.java.functional;


import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;
import com.learn.java.functional.PredicateStudent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudent {

    static Function<List<Student>, Map<String, Double>> studeFunction = students ->
    {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(
                student -> {
                    if (PredicateStudent.gpaStudentPredicate.test(student)) {
                        studentGradeMap.put(student.getName(), student.getGoal());
                    }
                }
        );

        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(studeFunction.apply(StudentDatabse.getAllStudents()));
    }
}
