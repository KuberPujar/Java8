package com.learn.java.challenges;

public class ScalarQuiz {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<100)
        {
            sum+=i;
            sum=i+sum;
            i+=1;
        }
        System.out.println(sum);
        System.out.println(functionB(100,2000));
        System.out.println(feb(6));
        printTribe(6);
    }

    static int functionB(int a, int b)
    {
      if(b==0)
      {
          return  a;
      }
      else
      {
            return functionB(b,a%b);
      }
    }
    static int feb(int n)
    {
        if(n<=1)
            return n;
        return feb(n-1)+feb(n-2);
    }
    static int tribeRec(int c)
    {
        if(c==0 || c==1 || c==2)
        {
            return  0;
        }

        if(c==3)
        {
            return 1;
        }
        else
        {
            return tribeRec(c-1)+tribeRec(c-2)+tribeRec(c-3);
        }
    }
    static  void printTribe(int n)
    {
        for(int i=1;i<n;i++)
        {
            System.out.println(tribeRec(i)+" ");
        }
    }
}
