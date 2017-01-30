import java.io.*;
import java.util.*;

public class permutation
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String a,b;
		System.out.println("Enter string1");
		a=s.next();
		System.out.println("Enter string2");
		b=s.next();
		int flag=1;

		if(a.length()!=b.length())
			flag=0;

		if(flag==0)
			System.out.println("Not a permutation");
		else
			System.out.println("permutation");
			
	}

}