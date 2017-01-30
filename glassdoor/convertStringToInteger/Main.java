import java.io.*;
import java.util.*;

public class Main
{
    static int return_num(char c)
    {
        int x=0;

        switch(c)
        {
            case '0' : x= 0; break;
            case '1' : x=1; break;
            case '2' : x=2; break;
            case '3' : x= 3; break;
            case '4' : x=4; break;
            case '5' : x=5; break;
            case '6' : x= 6; break;
            case '7' : x= 7; break;
            case '8' : x= 8; break;
            case '9' : x=9; break;
        }

        return x;
    }
    
    public static void main(String args[])
    {
        String a ="123";
        char c[]=a.toCharArray();
        int len=a.length();
        int sum=0;
        for(int i=0;i<len;i++)
        {
            int digit = return_num(c[i]);
            sum+=(digit*Math.pow(10,(len-1-i)));
        }
       System.out.println(a+" +1 = "+(sum+1));
    }
}