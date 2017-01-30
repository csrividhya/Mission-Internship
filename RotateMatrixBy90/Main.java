//code to rotate a matrix by 90 degrees
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

	public static void main(String args[])
	{	
		int m=3,n=3;
		int a[][] = new int[m][n];
		int ans[][] = new int[m][n];
		Scanner s = new Scanner(System.in);

		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			{
				a[i][j] = s.nextInt();
			}

			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
				{
					ans[j][m-i-1]=a[i][j];
				}
				System.out.println("AFTER ROTATION: ");
				print(ans,m,n);



			}
		}