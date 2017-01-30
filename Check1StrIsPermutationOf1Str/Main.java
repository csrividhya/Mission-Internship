//Java program to check if 1 string is the permutation of another string
import java.io.*;
import java.util.*;

public class Main
{
	public static HashMap<Character, Integer> generateMap(String a)
	{
		HashMap<Character, Integer> alpha = new HashMap<Character,Integer>();
			for(int i=0;i<a.length();i++) //find distinct alphabets present in string a
			{

				if(alpha.containsKey(a.charAt(i))==false)
					alpha.put(a.charAt(i),0);
				else if(alpha.containsKey(a.charAt(i))==true)
				{
					int temp = alpha.get(a.charAt(i));
					alpha.remove(a.charAt(i));
					alpha.put(a.charAt(i),temp+1);
				}
			}
			return alpha;
	}//eof

	public static int checkequality(HashMap<Character, Integer> a, 	HashMap<Character, Integer>b)
	{
		if(a.equals(b)==true)
			return 1;
		else 
			return 0;
	}//eof

	public static int check(String a, String b)
	{
		if(a.length()!=b.length())
			return 0;
		else
		{
			HashMap<Character, Integer>a_map= new HashMap<Character, Integer>();
			a_map=generateMap(a);

			HashMap<Character, Integer> b_map= new HashMap<Character, Integer>();
			b_map=generateMap(b);
			
			int c = checkequality(a_map,b_map);
			if(c==1)
				return 1;
			else 
				return 0;

		}//else
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Code to check if 1 is a permutation of the other: ");
		System.out.println("enter string1: ");
		String a = s.next();
		System.out.println("enter string2: ");
		String b = s.next();

		int x =check(a,b);

		if(x==1)
			System.out.println("permutation");
		else
			System.out.println("Not a permutation");
	}
}