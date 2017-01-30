import java.io.*;
import java.util.*;

public class p
{
	public static void find_subsets(int[] a)
	{
		int n = a.length; 
		//num of possible subsets = 2^n

		//double total = Math.pow(2,n);

		for(int i=0;i<(Math.pow(2,n));i++)
		{
			System.out.print("[");	
			for(int j=0;j<n;j++)
				if((i &(1<<j))>0) //jth bit is 1
				{
					System.out.print("["+a[j]+"]");
				}

			System.out.println("]");
		}

	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of set: ");
		int n = s.nextInt();
		int ip[]= new int[n];

		System.out.println("Enter the set: ");
		for(int x=0;x<n;x++)
			ip[x]=s.nextInt();

		find_subsets(ip);

		
	}
}


/*
import java.io.IOException;
 
public class p
{
    // Print all subsets of given set[]
    static void printSubsets(char set[])
    {
        int n = set.length;
 
        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (Math.pow(2,n)); i++)
        {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);
    }
}

*/