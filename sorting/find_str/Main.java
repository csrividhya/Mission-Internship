import java.io.*;
import java.util.*;

public class Main
{
	static void find(String[] a, String temp, int beg, int end)
	{
		int middle=(beg+end)/2;
		int index=0;
		boolean flag=false;

		if(beg<=end && flag!=true)
		{
			if(a[middle]!="")
			{
				if(a[middle].charAt(0)<temp.charAt(0))
				{
					end=middle-1;
				}
				else if(a[middle].equals(temp)==true)
				{
					index=middle;
					flag=true;
				}
				else
				{
					beg=middle+1;
				}
			}
			else
			{
				find(a,temp,beg,middle-1);
				find(a,temp,middle+1,end);
			}
		}

		if(flag==true)
		System.out.println(temp+" is found at index "+index);
		else
		System.out.println(temp+" is NOT found");


	}

	public static void main(String args[])
	{
		String[] s={"at","","","","ball","","","car"};
		String temp="ball";
		int beg=0;
		int end=s.length-1;
		int middle = (beg+end)/2;
		find(s,temp,beg,end);
	}
}