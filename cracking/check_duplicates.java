//DETERMINE IF GIVEN STRING CONTAINS DUPLICATES WITHOUT USING ANY OTHER DS FOR RESCUE

import java.io.*;
import java.util.*;

public class check_duplicates
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String a;
		System.out.println("Enter input string");
		a=s.next();
		//System.out.println(a);
		int len = a.length();
		int i=0,j=1,flag=1;

		//Windowing technique

		while(i<len && j<len)
		{	
			if(a.charAt(i)!=a.charAt(j))
				j++;
			else if(a.charAt(i)==a.charAt(j))
			{
				flag=0;
				break;
			}

			if(j==len-2)
				{
					++i;
					j=i+1;
				}

			
		}
//USING NESTED FOR LOOP

		/*for(i=0;i<len;i++)
			for(j=i+1;j<len;j++)
				if(a.charAt(i)==a.charAt(j))
					{
						flag=0;
						break;
				}
*/


if(flag==0)
	System.out.println("Contains duplicates bruh!");
else if(flag==1)
	System.out.println("Does not Contains duplicates bruh!");

	}//main
}