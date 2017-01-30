//Code to remove all spaces in a string with '%20'
import java.io.*;
import java.util.*;

public class Main
{
	static void remove_spaces(String a)
	{	
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				a= new StringBuffer(a).deleteCharAt(i).toString();  
				a= new StringBuffer(a).insert(i,"%20").toString();
			}
		}

		System.out.println(a);
	}//eof

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String a = s.nextLine();
		remove_spaces(a);
	}


}