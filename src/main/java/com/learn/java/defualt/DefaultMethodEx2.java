package com.learn.java.defualt;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodEx2 {
    public static final Consumer<Student> studentConsumer=System.out::println;
    public static final Comparator<Student> gradeComparator=Comparator.comparing(Student::getGradeLevel);
    public static final Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
    public static void main(String[] args) {
        System.out.println("Before sort...................................................");
        List<Student> list= StudentDatabse.getAllStudents();
        list.forEach(studentConsumer);
        System.out.println("After sortByName...................................................");
        sortByName(list);
        System.out.println("After sortByGpa...................................................");
        sortByGpa(list);
        System.out.println("After sortByGradeAndName...................................................");
        sortByGradeAndName(list);
        System.out.println("After sortByNullableFirst...................................................");
        sortByNullableFirst(list);
    }

    public static  void sortByName(List<Student> list)
    {
        Comparator<Student> studentComparator=Comparator.comparing(Student::getName);
        list.sort(studentComparator);
        list.forEach(studentConsumer);
    }

    public static  void sortByGpa(List<Student> list)
    {
        Comparator<Student> studentComparator=Comparator.comparing(Student::getGoal);
        list.sort(studentComparator);
        list.forEach(studentConsumer);
    }

    public static  void sortByGradeAndName(List<Student> list)
    {
        list.sort(gradeComparator.thenComparing(nameComparator));
        list.forEach(studentConsumer);
    }

    public static void sortByNullableFirst(List<Student> list)
    {
     //Comparator<Student> nullableCompare=Comparator.nullsFirst(nameComparator);
        Comparator<Student> nullableCompare=Comparator.nullsLast(nameComparator);
     list.sort(nullableCompare);
     list.forEach(studentConsumer);
    }
}

