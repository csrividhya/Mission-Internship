import java.io.*;
import java.util.Scanner;
import java.util.HashMap;


public class benji
{
public Boolean yo(int a[], int asize, int b[], int bsize,int target)
{
	Boolean ret=false;
HashMap<Integer, Integer> hash = new HashMap<>();

for(int i=0;i<asize;i++)
{
	hash.put(target-a[i],i);
}//for

for(int i=0;i<bsize;i++)
{
	if(hash.containsKey(b[i]))
		return true;
}

return ret;
}//yo


public static void main(String []args)
{
int asize,bsize,target=8; 
benji obj = new benji();
Scanner in = new Scanner(System.in);
System.out.println("enter size of 1st array");
asize=in.nextInt();
System.out.println(asize);

System.out.println("enter size of 2nd array");
bsize=in.nextInt();
System.out.println(bsize);

int a[]= new int[asize];
int b[]= new int[bsize];

System.out.println("enter 1st array");
for(int i=0;i<asize;i++)
{
a[i]=in.nextInt();
}//for
System.out.println("enter 2nd array");
for(int i=0;i<bsize;i++)
{
b[i]=in.nextInt();
}//for

Boolean return_value;
return_value = obj.yo(a,asize,b,bsize,target);
System.out.println("result: "+return_value);

}//main

}//benji