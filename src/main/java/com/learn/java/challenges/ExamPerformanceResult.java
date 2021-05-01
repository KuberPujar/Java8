package com.learn.java.challenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//the function accepts five Integer arrays and return Integer ArrayList

class ExamPerformanceResult {

    public static ArrayList<Integer> performance(Integer[] tamil, Integer[] english, Integer[] maths, Integer[] science,
                                                 Integer[] social) {
        //write your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> tamilList= getArrayToList(tamil);
        ArrayList<Integer> englishList=getArrayToList(english);
        ArrayList<Integer> mathsList= getArrayToList(maths);
        ArrayList<Integer> scienceList=getArrayToList(science);
        ArrayList<Integer> socialList= getArrayToList(social);

        //average
        list.add(getAverage(tamilList));
        list.add(getAverage(englishList));
        list.add(getAverage(mathsList));
        list.add(getAverage(scienceList));
        list.add(getAverage(socialList));

        //higjhest
        list.add(getOptionalValue(getHighest(tamilList)));
        list.add(getOptionalValue(getHighest(englishList)));
        list.add(getOptionalValue(getHighest(mathsList)));
        list.add(getOptionalValue(getHighest(scienceList)));
        list.add(getOptionalValue(getHighest(socialList)));

        //lowest
        list.add(getOptionalValue(getMin(tamilList)));
        list.add(getOptionalValue(getMin(englishList)));
        list.add(getOptionalValue(getMin(mathsList)));
        list.add(getOptionalValue(getMin(scienceList)));
        list.add(getOptionalValue(getMin(socialList)));

        //failed students
        list.add(getFailedStudents(tamilList));
        list.add(getFailedStudents(englishList));
        list.add(getFailedStudents(mathsList));
        list.add(getFailedStudents(scienceList));
        list.add(getFailedStudents(socialList));

           return  list;
    }

    private static Optional<Integer> getHighest(List<Integer> list)
    {
        return list.stream().reduce(Integer::max);
    }

    private static Optional<Integer> getMin(List<Integer> list)
    {
        return list.stream().reduce(Integer::min);
    }

    private static int getAverage(List<Integer> list)
    {
        Optional<Integer> sum= list.stream().reduce(Integer::sum);
        return sum.get()/list.size();
    }

    private static <T> ArrayList<T> getArrayToList(T arr[])
    {
        ArrayList<T> list=new ArrayList<T>();
        for(T t:arr)
        {
            list.add(t);
        }
        return list;
    }

    private static int getFailedStudents(List<Integer> list)
    {
        return list.stream().filter(s->s<35)
                .collect(Collectors.toList())
                .size();
    }

    private static int getOptionalValue(Optional<Integer> optional)
    {
        return optional.get();
    }

}



