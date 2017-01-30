//Two sum problem Leetcode
import java.io.*;
import java.util.*;

public class p3
{
	public static void main(String args[])
	{
		int[] a={1,2,3,4,5,6,7,8,9};
		int sum=5;
		boolean flag=false;
		ArrayList<Integer> selected = new ArrayList<>();

		HashMap<Integer, Integer>hm= new HashMap<>();

		for(int i=0;i<a.length;i++)
			{
				hm.put(a[i],(sum-a[i]));
				selected.add(a[i]);
			}

		for(int i=0;i<hm.size();i++)
		{
			if(hm.containsValue(a[i]) && selected.contains(a[i]))
			{
				flag=true;
				System.out.println(a[i]+" + "+(sum-a[i])+" = "+sum);
				selected.remove(a[i]);
			}
		}

		if(flag==false)
			System.out.println("None of the numbers add up to given sum");

	}
}
