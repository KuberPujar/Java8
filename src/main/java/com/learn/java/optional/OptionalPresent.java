package com.learn.java.optional;
import java.util.Optional;

/***
 * isPresent,ifPresent
 */
public class OptionalPresent {
    public static void main(String[] args) {
        //isPresent
        Optional<String> optional=Optional.ofNullable("Hello");
        System.out.println(optional.isPresent());
        if(optional.isPresent())
        {
            System.out.println(optional.get());
        }
        else
        {
            System.out.println("default");
        }

        //ifPresent
        //takes producer as input
        optional.ifPresent(System.out::println);
    }
}
