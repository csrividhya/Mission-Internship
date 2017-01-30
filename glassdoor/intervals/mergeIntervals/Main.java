import java.io.*;
import java.util.*;

class interval
{
int start,end;

    public interval(int s,int e)
    {
        start = s;
        end = e;
    }
    
    public void print(int x)
    {
        System.out.println("Interval "+x+": "+this.start+"-"+this.end);
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getEnd()
    {
        return end;
    }

    public void set(int s, int e)
    {
        start = s;
        end = s;
    }
}//end of Class interval

public class Main
{
    static void print_array(interval[] a)
    {
        for(int i=0;i<a.length;i++)
            a[i].print(i);
    }
    
    static interval[] sort(interval[] a)
    {
        int n = a.length;
        interval temp;
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n-i-1;j++)
                {
                    if(a[j].getStart() > a[j+1].getStart())
                       {
                           temp=a[j];
                           a[j]=a[j+1];
                           a[j+1]=temp;
                           
                       }
                }
                
        return a;
    }
    
    static void merge(interval[] a)
    {
        int n = a.length;
        Stack<interval> stack = new Stack<interval>();
        stack.push(a[0]);
        interval top;
        int maxEnd=0;

        for(int i=1;i<n;i++)
        {
            top=stack.peek();

            if(a[i].getStart() < top.getEnd())
            {
                top = stack.pop();
                int topEnd = top.getEnd();
                int iEnd =a[i].getEnd();
                if(topEnd > iEnd)
                    maxEnd = topEnd;
                else if(iEnd >= topEnd)
                    maxEnd = iEnd;

                int s = top.getStart();
                interval new_top = new interval(s,maxEnd);
                stack.push(new_top);

            }
            else if(a[i].getStart() > top.getEnd())
            {
                stack.push(a[i]);
            }
        }

        //print stack contents

        while(!stack.empty())
        {
            top = stack.peek();
            System.out.println(top.getStart()+" - "+top.getEnd());
            stack.pop();
        }
        
        
    } 
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num of intervals: ");
        int n = s.nextInt();
        interval[] o = new interval[n];
        int st,e;
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter interval"+i+"'s start time:");
            st=s.nextInt();
            System.out.println("Enter interval"+i+"'s end time:");
            e=s.nextInt();
            o[i]=new interval(st,e);
            
        }
        
        print_array(o);
        o=sort(o);
        merge(o);
        
        
        
    }
}
