import java.io.*;
import java.util.*;

public class Main
{

	static String sortchars(String a)
	{
		char[] x = a.toCharArray();
		int len=a.length();

		for(int i=0;i<len;i++)
			for(int j=0;j<len-i-1;j++)
				if(x[j]>x[j+1])
				{
					char temp = x[j+1];
					x[j+1]=x[j];
					x[j]=temp;
				}
		String hey = new String(x);
		return hey;

	}

	static boolean anagramcheck(String a, String b)
	{
		String tempa=sortchars(a);
		String tempb=sortchars(b);
		if(tempa.equals(tempb))
			return true;
		else
			return false;
	}

	static int check(String[] big, String a)
	{
		int flag=1;
		for(int i=0;i<big.length;i++)
			if(big[i].equals(a))
			{
				flag=0;
				break;
			}
		return flag;
	}

	static void sort(String[] a)
	{
		
		int max=a.length;
		//String[] temp = new String[a.length];
		String[] anagrams = new String[max];
		for(int i=0;i<max;i++)
			anagrams[i]="";
		int ax=0;
		String[] notanagrams = new String[max];

		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
			{
					//System.out.println("YOLO");
					boolean flag = anagramcheck(a[i],a[j]);
					if(flag)
					{
						//System.out.println("YOLO");
						if(check(anagrams,a[i])==1)
							{
								anagrams[ax]=a[i];
								//System.out.println(a[i]+" ");
								ax++;
							}
						 if(check(anagrams,a[j])==1)
							{
								anagrams[ax]=a[j];
								//System.out.println(a[j]+" ");
								ax++;
							}	
					}

				}
		print(anagrams);
	}

	static void print(String[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of strings: ");
		int n = s.nextInt();
		String[] a = new String[n];
		System.out.println("Enter strings: ");
		for(int i=0;i<n;i++)
			a[i]=s.next();
		sort(a);

	}
}