//Code to set row and col to zero if any elt in that row & col =0 in a MxN matrix

import java.io.*;
import java.util.*;

public class Main
{

	static void print(int[][] matrix, int m , int n)
	{
		for(int i=0;i<m;i++)
		{	for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	static void check(int[][] matrix, int m , int n)
	{
		HashSet<Integer> visitedr = new HashSet<Integer>();
		HashSet<Integer> visitedc = new HashSet<Integer>();
		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(visitedc.contains(j)==false && visitedr.contains(i)==false)
					if(matrix[i][j]==0)
					{
						visitedr.add(i);
						visitedc.add(j);
							
							for(int k =0;k<n;k++) //change row=0
								matrix[i][k]=0;
							for(int k =0;k<m;k++)
								matrix[k][j]=0;
					}
			System.out.println(" Transformed matrix is: ");
			print(matrix,m,n);
	}

	public static void main(String args[])
	{
		int m,n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter num of rows in m*n matrix: ");
		m = s.nextInt();
		System.out.println("enter num of columns in m*n matrix: ");
		n = s.nextInt();
		
		int matrix[][]= new int[m][n];

		System.out.println("Enter matrix elements: ");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			{
				matrix[i][j]= s.nextInt();
			}
			System.out.println(" Original matrix is: ");
			print(matrix,m,n);
			check(matrix,m,n);

	}
}