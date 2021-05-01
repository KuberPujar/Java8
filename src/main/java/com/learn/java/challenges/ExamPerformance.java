package com.learn.java.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ExamPerformance {

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(b.readLine().trim());
        Integer[] tamil = new Integer[n];
        for (int i = 0; i < n; i++) {
            tamil[i] = Integer.parseInt(b.readLine().trim());
        }
        Integer[] english = new Integer[n];
        for (int i = 0; i < n; i++) {
            english[i] = Integer.parseInt(b.readLine().trim());
        }
        Integer[] maths = new Integer[n];
        for (int i = 0; i < n; i++) {
            maths[i] = Integer.parseInt(b.readLine().trim());
        }
        Integer[] science = new Integer[n];
        for (int i = 0; i < n; i++) {
            science[i] = Integer.parseInt(b.readLine().trim());
        }
        Integer[] social = new Integer[n];
        for (int i = 0; i < n; i++) {
            social[i] = Integer.parseInt(b.readLine().trim());
        }
        b.close();

        ArrayList<Integer> solution = ExamPerformanceResult.performance(tamil, english, maths, science, social);
        for (int i = 0; i < solution.size(); i++) {
            System.out.println(solution.get(i));
        }

    }

}
