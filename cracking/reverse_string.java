import java.io.*;
import java.util.*;

public class reverse_string
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String a;
		System.out.println("Enter input string");
		a=s.next();
		char yolo[] = a.toCharArray();
		int len = a.length();
		char temp;
		for(int i=0;i<len/2;i++)
		{	
			temp = yolo[i];
			yolo[i]=yolo[len-i-1];
			yolo[len-i-1]=temp;
		}

		String b = new String(yolo);
		System.out.println(b);
	}
}