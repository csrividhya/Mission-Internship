//Code to find if 1 string is a rotation of another string using only one call to issubstring() 
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String a = s.next();
		int alen = a.length();

		System.out.println("Enter string2: ");
		String b = s.next();
		int blen = b.length();

		if(alen != blen)
			System.out.println("NOt a rotation");
		else
		{
			String temp=a+a;
			boolean flag = temp.contains(b);
			if(flag==true)
				System.out.println("Is a rotation");
			else 
				System.out.println("NOt a rotation");
		}
	}
}
