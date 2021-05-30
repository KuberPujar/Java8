package com.learn.java.challenges;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String ch=scanner.next();
        System.out.println(charSearch(str,ch.charAt(0)));
    }

    public static int charSearch(String str,char ch)
    {

        return str.chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Object::toString,Collectors.counting()))
                .get(String.valueOf(ch)).intValue();
    }
}
