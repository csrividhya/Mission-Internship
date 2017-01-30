//code to covert string to number
import java.io.*;
import java.util.*;

public class atoi
{
	public static int returnDigitValue(char c)
	{	
		int val;

		switch(c)
		{
			case '0': val=0; break;
			case '1': val=1; break;
			case '2': val=2; break;
			case '3': val=3; break;
			case '4': val=4; break;
			case '5': val=5; break;
			case '6': val=6; break;
			case '7': val=7; break;
			case '8': val=8; break;
			case '9': val=9; break;
			default: val=0;
		}
		return val;
	}

	public static int convert(char[] c, int len)
	{
		if(len==0)
			return 0;
		boolean flag=false;
		
		char[] digit = new char[len];
		int k=0; //index of digit

		for(int i=0;i<len;i++)
			if(Character.isDigit(c[i]))
			{
				digit[k++]=c[i];
				flag=true;
			}

		if(flag==false) //no valid digit present
			return 0;

		//actual conversion 
			int sum=0;
		for(int i=0;i<k;i++)
		{
			int val = returnDigitValue(digit[i]);
			sum+=(val*Math.pow(10,k-i-1));
		}

		if(sum<Integer.MAX_VALUE && sum> Integer.MIN_VALUE)
			return sum;
		else
			return 0;
	}

	public static void main(String args[])
	{
		String ip = new String();
		Scanner s = new Scanner(System.in);
		ip = s.nextLine();
		char c[] = ip.toCharArray();
		int len = c.length;
		int ans = convert(c,len);
		System.out.println("Answer is: "+ans);
	}
}