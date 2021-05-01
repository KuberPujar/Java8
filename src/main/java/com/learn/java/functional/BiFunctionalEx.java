package com.learn.java.functional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;

import java.util.List;
import java.util.function.BiConsumer;

public class BiFunctionalEx {
    public static void main(String[] args) {
        BiConsumer<String, String> stringBiConsumer = (s, s2) -> System.out.println("s:" + s + ", s2:" + s2);

        stringBiConsumer.accept("Kuber", "Pujar");

        BiConsumer<Integer, Integer> addBiConsumer = (integer, integer2) -> System.out.println("add:" + (integer + integer2));

        BiConsumer<Integer, Integer> subBiConsumer = (integer, integer2) ->
            System.out.println("sub:" + (integer - integer2));

        BiConsumer<Integer, Integer> divBiConsumer = (integer, integer2) ->
            System.out.println("div:" + (integer / integer2));

        BiConsumer<Integer, Integer> multiBiConsumer = (integer, integer2) ->
            System.out.println("multi:" + (integer * integer2));

        BiConsumer<Integer, Integer> remBiConsumer = (integer, integer2) ->
            System.out.println("rem:" + (integer % integer2));

        addBiConsumer.andThen(subBiConsumer)
                .andThen(divBiConsumer)
                .andThen(multiBiConsumer)
                .andThen(remBiConsumer)
                .accept(9, 3);
        getNameAndActivities();
    }

    static BiConsumer<String, List<String>> nameAndActivitiesBiConsumer = (s, strings) ->
        System.out.println("Name:" + s + " activities:" + strings);

    public static void getNameAndActivities() {
        List<Student> studentList = StudentDatabse.getAllStudents();
        studentList.forEach(student -> nameAndActivitiesBiConsumer.accept(student.getName(), student.getActivities()));
    }
}
