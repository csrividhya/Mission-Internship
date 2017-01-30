import java.io.*;
import java.util.*;

public class Main
{
    static int[] swap(int[]a, int i, int j)
    {
        int c=a[i];
        a[i]=a[j];
        a[j]=c;
        return a;
    }
    
    static void remove_zero(int[] a)
    {
        int len = a.length;
        int end=len-1;
        
        for(int i=0;i<len;i++)
            if(a[i]==0)
                if(a[end]!=0)
                a=swap(a,i,end);
                
          for(int i=0;i<len;i++)
            System.out.print(a[i]+" ");
               
                       
    }
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n=s.nextInt();
        int a[]= new int[n];
        
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        
        remove_zero(a);
        
        
    }
}