import java.io.*;
import java.util.Scanner;

public class remove 
{

	public String remover(String num,int index)
	{
		char[] c = num.toCharArray();

		for(int i=index;i<(num.length()-1);i++)
			{
				c[i]=c[i+1];
			}//for
			c[num.length()-1]=' ';
			String ret = new String(c);
			return ret;
	}//remover

	public String fn(String num, int removed)
	{
		Boolean flag=true;

		if(removed == 0)	
			return num;
		else if(removed >= num.length())
			return "0";
	

		while(removed>0)
			{
				for(int i=0;i<num.length()-1;i++)
					if(Character.getNumericValue(num.charAt(i))>Character.getNumericValue(num.charAt(i+1)))
						{
							num = remover(num,i);
							removed-=1;
							flag=false;
							break;
					

					}//if
				if(flag==true)
				num = remover(num,num.length()-1);
				removed-=1;
			}//while

			

				return num;
	}//fn

public static void main(String []args)
{
	Scanner s = new Scanner(System.in);
	String num="";
	int removed=0;
	System.out.println("Enter number: ");
	num = s.nextLine();
	System.out.println("Enter remove: ");
	removed = s.nextInt();
	//System.out.println(num);
	String result = new remove().fn(num,removed);
	System.out.println(result);
}//main
}//class