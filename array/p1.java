//find subarray with largest sum

import java.io.*;
import java.util.*;

public class p1
{
	public static int sumo(int[] a)
	{
		int sum=0,maxsum=0;
		String s=" ";

		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
			if(sum>=maxsum)
				{
					maxsum=sum;
					s=s+" "+a[i];
				}
			else if(sum<0)
			{
				sum=0;
			}
			else
				sum-=a[i];
		}
	System.out.println("Numbers in the lingest stuff are: "+s);
	return sum;

	}

	public static void main(String[] args)
	{
		int[] a = {1,-100,19,-2,4};
		int num=a.length;
		System.out.println("Highest sum= "+sumo(a)); //array,sum,startIndex
	}
}