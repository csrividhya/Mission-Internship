import java.io.*;
import java.util.*;

public class Main
{
	static int check(HashMap<Character,Integer> map, String a)
	{
		int flag =1;
		for(int i=0;i<map.size();i++)
		{
			if(map.get(a.charAt(i))!=1)
				{
					flag=0;
					break;
				}
		}
		return flag;
	}

	static void generate_hashmap(String a)
	{	
		String original = a;
		StringBuffer alpha = new StringBuffer();

		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<a.length();i++)
		{
			if(map.containsKey(a.charAt(i))==false)
				{
					map.put(a.charAt(i),1);
					alpha.append(a.charAt(i));
				}
			else
			{
				int temp = map.get(a.charAt(i));
				map.remove(a.charAt(i));
				map.put(a.charAt(i),temp+1);
			}

		}
		int result;

		result = check(map,original);

		if(result==0)
			compress(map,alpha.toString());
		else
			System.out.println("Compressed string is :"+a);

	}

	static void compress(HashMap<Character,Integer> map, String alpha)
	{
		int len =  map.size();
		StringBuffer c= new StringBuffer();
		int count=0;
		
		for(int i=0;i<alpha.length();i++)
		{
			count=map.get(alpha.charAt(i));
			c.append(alpha.charAt(i));
			c.append(count);
		}

		String yo = c.toString();
		System.out.println("Compressed string is: "+yo);
	}


	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = s.next();
		int len = a.length();

		generate_hashmap(a);
	
		
	}
}