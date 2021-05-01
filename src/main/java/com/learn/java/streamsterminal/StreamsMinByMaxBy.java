package com.learn.java.streamsterminal;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;
import java.util.Comparator;
import java.util.Optional;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxBy {
    public static void main(String[] args) {
        Optional<Student> minStudent=minByStudent();
        if (minStudent.isPresent()) {
            System.out.println(minStudent.get());
        }
        Optional<Student> maxStudent=maxByStudent();
        if (maxStudent.isPresent()) {
            System.out.println(maxStudent.get());
        }
    }

    public static Optional<Student> minByStudent() {
        return StudentDatabse.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGoal)));
    }

    public static Optional<Student> maxByStudent() {
        return StudentDatabse.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGoal)));
    }
}
