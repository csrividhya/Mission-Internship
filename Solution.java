import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students");
        int num=in.nextInt();
 
        System.out.println("Enter times");
        int[] t = new int[num];

        for(int i=0;i<num;i++)
        {
        	t[i]=in.nextInt();
        }

        int start=0;
        int time=0;
        int count=0;
        int finished=0;
        int max=0;
        int answer=0;

       for(start=0;start<=num-1;start++)
       {
            int n = start;
            count=0;
            finished=0;
            time=0;
            while(count<num)
            {
                if(n==num-1)
                    n=0;

                if(t[n]<=time)
                    finished+=1;
                n++;
                
                count++;
                time=time+1;
            }//while
            if(finished>max)
            {
                max=finished;
                answer=start;
            }
       }//for
    System.out.println(answer+1);

    }
}