import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter number to check if it's a power of 2:");
		int a = s.nextInt();
		System.out.println("Sign is: "+(0>a?-1:1));
		int flag=0;
		while(a>0)
		{
			a= a >> 1; //doing right shift by a bit is equivalent to dividing number with 2
			if(a==2)
				{
					flag=1;
					break;
				}

		}

		if(flag==1)
			System.out.println("Power of 2");
		else
			System.out.println("NOT a Power of 2");
	}
}