package com.learn.java.challenges;

import java.util.HashMap;
import java.util.stream.Collectors;

public class MaximumOccuredCahr {
    public static void main(String[] args) {
        String str="elephent";
       char [] cc=str.toCharArray();
       int count=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
       for(int i=0;i<cc.length;i++)
       {
           for(int j=1;j<cc.length;j++)
           {
               if(cc[i]==cc[j])
               {
                   System.out.println(Character.valueOf(cc[i]));
                   count++;
                   hashMap.put(Character.valueOf(cc[i]),count);
               }
               count=0;
           }
       }

       hashMap.forEach((character, integer) -> System.out.println(character+" "+integer));
        System.out.println(str.chars().summaryStatistics());
    }
}
