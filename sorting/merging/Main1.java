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
		int n1=0;
		int n2=b.length;

		for(int i=0;i<a.length;i++)
			if(a[i]!=0)
				n1++;
			
int len = n1+n2-1;
n1-=1;
n2-=1;

	while(n2>=0 && n1>=0)
	{

		if(a[n1]>b[n2])
		{
			a[len]=a[n1];
			len--;
			n1--;
		}

		else if(a[n1]<b[n2])
		{
			a[len]=b[n2];
			len--;
			n2--;
		}
	}

	while(n2>=0)
	{
		a[len]=b[n2];
		len--;
		n2--;
	}

	return a;
}

	public static void main(String args[])
	{
		int[] a;
		a = new int[15];
		a[0]=6;
		a[1]=7;
		a[2]=8;
		a[3]=9;
		int[] b ={1,2,3};
		a = merge(a,b);
		print(a);

	}
}
