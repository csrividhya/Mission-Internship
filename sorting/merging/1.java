import java.io.*;
import java.util.*;

public class Main1
{
	static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}

	static int[] merge(int[] a, int[] b)
	{
		int n1=-1;
		int n2=b.length()-1;
		int len = n1+n2-1;

		for(int i=0;i<a.length;i++)
			if(a[i])
				n1++;

	while(n2>=0)
		{
			if(a[n1]>b[n2])
			{
				int temp = a[len];
				a[len]=a[n1];
				a[n1]=temp;
				len--;
				n1--;
			}
		else if(a[n1]<b[n2])
		{
			a[n1+1]=b[n2--];
		}

	}

	return a;
}

	public static void main(String args[])
	{
		int[] a = new int[15];
		a= {1,2,3,4,5};
		int[] b ={6,7,8};
		a= merge(a,b);
		print(a);

	}
}
