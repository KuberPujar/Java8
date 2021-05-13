package com.learn.java.challenges;

import java.io.*;
import java.util.Arrays;

public class PatternMatching {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(System.getenv("OUPUT_PATH")));
        String input_string=bufferedReader.readLine();
        int start_index=Integer.parseInt(bufferedReader.readLine().trim());
        int end_index=Integer.parseInt(bufferedReader.readLine().trim());
        int result=count_matches(input_string,start_index,end_index);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();*/
        System.out.println(count_matches("elephenthpddsdhpsfshp",3,4));
    }
    public  static int count_matches(String input_string,int start_index,int end_index)
    {
       char c1= input_string.charAt(start_index);
       char c2= input_string.charAt(end_index);
       StringBuffer bf=new StringBuffer();
       bf.append(c2).append(c1);
       System.out.println(bf.toString());
       int count=0;
      if(input_string.contains(bf.toString()))
      {
          count++;
      }
        return count;

    }
}
