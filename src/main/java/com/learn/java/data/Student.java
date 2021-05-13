package com.learn.java.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int gradeLevel;
    private double goal;
    private String gender;
    private int noteBooks;
    private Optional<Bike> bike=Optional.empty();
    public Student(String name, int gradeLevel, double goal, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.goal = goal;
        this.gender = gender;
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", goal=" + goal +
                ", gender='" + gender + '\'' +
                ", noteBooks=" + noteBooks +
                ", bike=" + bike +
                ", activities=" + activities +
                '}';
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    public Student(String name, int gradeLevel, double goal, String gender, int noteBooks, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.goal = goal;
        this.gender = gender;
        this.noteBooks = noteBooks;
        this.activities = activities;
    }

    public Student() {

    }

    public Student(String s) {
        this.name=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGoal() {
        return goal;
    }

    public void setGoal(double goal) {
        this.goal = goal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    List<String> activities = new ArrayList<>();

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void printActivities() {
        activities.forEach(System.out::println);
    }

}
