package com.learn.java.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfKeyValue = scanner.nextInt();
        scanner.nextLine();
        Map<Integer, String> stringMap = new HashMap<>();
        for (int i = 0; i < noOfKeyValue; i++) {
            String keyValuePair = scanner.nextLine();
            String[] strArr = keyValuePair.split(" ", 2);
            for(int j=0;j<strArr.length;j++)
            {
                stringMap.put(Integer.parseInt(String.valueOf(strArr[0])),strArr[1]);
            }
        }
        int keToFind=scanner.nextInt();
        if(stringMap.containsKey(keToFind))
        {
            System.out.println(stringMap.get(keToFind));
        }
        else
        {
            System.out.println(-1);
        }
    }
}
