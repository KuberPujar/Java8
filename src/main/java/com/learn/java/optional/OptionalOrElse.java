package com.learn.java.optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabse;
import java.util.Optional;

/*
* orElse,orElseGet,orElseThrow
*
*/
public class OptionalOrElse {

    public static void main(String[] args) {
        System.out.println("orElse ::"+elseM());
        System.out.println("orElseGet ::"+getT());
        System.out.println("orElseThrow ::"+throwR());
    }

    //orElse
    public static String elseM()
    {
        Optional<Student> studentOptional=Optional.ofNullable(StudentDatabse.studentSupplier.get());
        //Optional<Student> studentOptional=Optional.ofNullable(null); //going to execute orElse condition.
        return studentOptional.map(Student::getName).orElse("Default");
    }

    //orElseGet
    //orElseGet will have supplier as argument
    public static String getT()
    {
        Optional<Student> studentOptional=Optional.ofNullable(StudentDatabse.studentSupplier.get());
        //Optional<Student> studentOptional=Optional.ofNullable(null); //going to execute orElseGet condition
        return studentOptional.map(Student::getName).orElse("Default");
    }

    //orElseThrow
    //we can throw exception using orElseThrow
    //orElseThrow will have supplier as argument or default
    public static String throwR()
    {
        Optional<Student> studentOptional= Optional.ofNullable(StudentDatabse.studentSupplier.get());
        //Optional<Student> studentOptional= Optional.ofNullable(null); //going to throw orElseThrow exception.
        return  studentOptional.map(Student::getName).orElseThrow(()->new RuntimeException("No Data available."));
    }

}
