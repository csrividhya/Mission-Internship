import java.io.*;
import java.util.*;

//question is given a string A and substring X, figure out if X is a substring of A. X can have one widcard charcter 

public class expedia 
{
public static void main(String [] args)
{
String a,x;
Scanner s = new Scanner(System.in);
System.out.println("Enter input string:");
a=s.nextLine();
System.out.println("Enter substring:");
x=s.nextLine();

int len1=a.length(); 
int len2=x.length();

String star="*";

String[] splitted;

//check if wildcard character is there substring
if(x.contains(star)==true)
{
//CASE 1 - * in beginning
if(x.indexOf(star)==0)
{
StringBuilder sb = new StringBuilder(x);
sb.deleteCharAt(0);
x=sb.toString();
if(a.contains(x)==true)
{
int index=a.indexOf(x);
if(index>0)
	System.out.println(x+" is a subtring of "+a);
else if(index==0)
{
	int temp_index = a.indexOf(x,len2-1);
	if(temp_index==-1)
		System.out.println(x+" is not a subtring of "+a);
	else
		System.out.println(x+" is a subtring of "+a);
}
}//if
else
	System.out.println(x+" is not a subtring of "+a);
}//case1

else if(x.indexOf(star)==(len2-1))
{

StringBuilder sb = new StringBuilder(x);
sb.deleteCharAt(len2-1);
x=sb.toString();
if(a.contains(x)==true)
{
int index = a.indexOf(x);
if(index+len2>len1)
	System.out.println(x+" is not a subtring of "+a);
else
	System.out.println(x+" is a subtring of "+a);
}//if
else
	System.out.println(x+" is not a subtring of "+a);
}//case 2 - star is at the end

else 
{
splitted = x.split("\\*"); 
String temp1 = splitted[0];
String temp2 = splitted[1];
int length_one = temp1.length();
int length_two=temp2.length();

int index1 = a.indexOf(temp1);
int index2 = a.indexOf(temp2, index1+length_one);
if(index1 !=-1 && index2!=-1 && ((index1+index2+length_one+length_two)<=len1))
	System.out.println(x+" is a subtring of "+a);
else 
	System.out.println(x+" is not a subtring of "+a);
}

}//if
else //wildcard is not there in x
{
boolean flag = a.contains(x);
if(flag==true)
	System.out.println(x+" is a substring of "+a);
else
	System.out.println(x+" is NOT a substring of "+a);
}
}//main
}//expedia
