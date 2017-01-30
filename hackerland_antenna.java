import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerland_antenna 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        int count=0;
        int start;
        int available=0;
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
        int temp;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(x[i]<x[j])
                    {
                        temp=x[i];
                        x[i]=x[j];
                        x[j]=temp;
                    }
        
        int distance=x[n-1]-x[0];
        distance/=2;
        if(k>=distance)
            count=1;

    int previous_umb=0;
    int previous_house=x[0];

    int axis=0;
    while(axis<=n-1)
    {
        if(axis+1>=n)
        {
            count+=1;
            break;
        }
        if(x[axis+1]-x[axis] >k)
        {
            previous_umb=axis;
            previous_house=x[axis];
            count=count+1;
            axis=axis+1;
        }

        for(int i=1;i<k;i++)
        {

            int difference = x[axis+i]-x[axis];
            if(difference>k)
            {
                previous_umb=axis+i-1;
                count+=1;
                axis=axis+i;
            }
        }

    }//while

    System.out.println(count);
 }
}
