//swapping 2 numbers using bitwise operators
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("enter a");
		a=s.nextInt();
		System.out.println("enter b");
		b=s.nextInt();

		a=a^b;
		b=b^a;
		a=a^b;

		System.out.println("After swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);



			
	}
}