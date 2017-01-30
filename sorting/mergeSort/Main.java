import java.io.*;
import java.util.*;

public class Main
{
	public static void printarray(int[] a)
	{
		System.out.println("Array contains:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	static void mergesort(int[] a, int low, int high)
	{
		if(low<high)
		{
			
			int middle = (low+high)/2;
			mergesort(a,low,middle);
			mergesort(a,middle+1,high);
			merge(a,low,high,middle);
		}

	}

	static void merge(int[] a, int low, int high, int middle)
	{
		int [] helper = new int[a.length];
		for(int i=0;i<a.length;i++)
			helper[i]=a[i];

		int left=low, right = middle +1;
		int i=0;
		while(left<=middle && right <=high)
		{
			if(helper[left]<helper[right])
				a[i++]=helper[left++];
			else if(helper[left]>helper[right])
				a[i++]=helper[right++];
		}

	
	for(int x =0;i<middle-left;i++)
		a[i++]=helper[x+left];


		printarray(a);
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num of elements: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
			
			mergesort(a,0,n-1);
		

	}
}