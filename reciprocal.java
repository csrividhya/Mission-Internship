import java.io.*;
import java.util.*;
import java.lang.*;

public class reciprocal
{
	

public static void main(String args[])
{
int n;
int start=0;
//creating arraylist of the decimal values after 0.
ArrayList<Integer> decimal = new ArrayList<Integer>();
ArrayList<Integer> r = new ArrayList<Integer>();

Scanner s = new Scanner(System.in);
System.out.println("Enter number:");
n=s.nextInt();
//temp is dividend (make it multiple of 10 that's greater than n)
//n - divisor
int temp=1;
int count=0;

while(temp<=n)
{
temp = temp *10;
count++;
}//while

if(temp==n)
	{
		System.out.println(1/n);
		flag=true;
		break;
	}


for(int i=0;i<count-1;i++)
{
decimal.add(0);
}//for

int remainder=1;
float quotient;
float q;
Boolean repeating=false;
Boolean flag=false;

while(remainder!=0)
{
	
remainder = temp%n;
if(r.contains(remainder)==true)
{
start = r.indexOf(remainder);
repeating=true;
}
else
r.add(remainder);
quotient=temp/n;
q=quotient;
decimal.add(Math.round(q));
temp = remainder;
while(temp<=n)
	temp*=10;

if(repeating==true)
	break;
}//while
if(flag==false)
{
int i=0;
String recur="0.";
while(i<decimal.size())
{
recur=recur+decimal.get(i);
i++;
}
System.out.println("reciprocal is "+recur);
}
}//main
}//reciprocal
