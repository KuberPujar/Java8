package com.learn.java.optional;

import java.util.Optional;

public class OptionalOfEmptyNullable {
    public static void main(String[] args) {
        System.out.println("ofNullable::"+ofNullable().isPresent());
        System.out.println("of::"+of());
    }
    public static Optional<String> ofNullable()
    {
       // Optional<String> stringOptional=Optional.ofNullable(null); // returns empty object
        Optional<String> stringOptional=Optional.ofNullable("Hello");
        return  stringOptional;
    }

    public static Optional<String> of()
    {
        Optional<String> stringOptional=Optional.of("Hello");
        // Optional<String> stringOptional=Optional.of(null); //throw exception if value is null.
        return  stringOptional;
    }

}
