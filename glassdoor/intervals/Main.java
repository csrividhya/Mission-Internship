import java.io.*;
import java.util.*;

public class Main
{
	static void find_overlaps(int[][] a)
	{
		int n =a.length-2;
		int count=0;

		for(int i=0;i<n;i++)
		{
			if(a[i][1]<a[i+1][0])
				count++;
		}

		System.out.println("Num. of overlaps are:"+count);

	}

	static int[][] sort(int[][]a)
	{
		int n = a.length;
		for(int i=0;i<n;i++)
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j][0]>a[j+1][0])
				{
					int temp=a[j][0];
					a[j][0]=a[j+1][0];
					a[j+1][0]=temp;
				}
			}
		return a;
	}

	static void print(int[][]a)
	{
		int n = a.length;
		System.out.println("ACTIVITY SCHEDULE:");
		for(int i=0;i<n;i++)
		{
			System.out.println("activity "+i+"'s interval: "+a[i][0]+" - "+a[i][1]); 	
		}
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of intervals: ");
		int n = s.nextInt();
		int a[][]= new int[n][2];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter activity "+i+"'s interval: ");
			a[i][0]=s.nextInt();
			a[i][1]=s.nextInt();	
		}
		a=sort(a);
		print(a);
		find_overlaps(a);
	}
}