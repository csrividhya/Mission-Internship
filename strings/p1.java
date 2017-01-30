//find longest palindromic substring given a string 

import java.io.*;
import java.util.*;

public class p1
{
	public static String find(String ip)
	{
		int len=ip.length();
		int start=0;
		int end=len-1;
		char[] a = ip.toCharArray();
		int X=0, Y=len-1;


		boolean[][] table = new boolean[len][len];
		//init table to false
		for(int i=0;i<len;i++)
			for(int l=0;l<len;l++)
				table[i][l]=false;

		//each character is a substring
		int maxLen=1;
		for(int i=0;i<len;i++)
		{
			table[i][i]=true;
			X=Y=i;
			maxLen=1;
		}
		
		//for strings of length = 2, if both chars are equal, it's a palindrome
		for(int i=0;i<len-1;i++)
			if(a[i]==a[i+1])
			{
				X=i;
				table[i][i+1]=true;
				maxLen=2;
				System.out.println("YOLO2");
			}

			
		//for bigger strings (len>=3)
			for(int k=3;k<=len;k++) //possible lengths possible
			{
				for(int j=0;j<=len-k;j++)
				{
					end=j+k-1;

					if(a[j]==a[end] && (table[j+1][end-1]==true))
					{
						X=j;;
						System.out.println("YOLO3");
						Y=end+1;
						table[j][end]=true;
						maxLen=k;

					}
				}
			}

			System.out.println("Longest palindromic length is: "+maxLen);
			return ip.substring(X,Y);
		}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = s.nextLine();
		System.out.println(find(a));
	}
}
