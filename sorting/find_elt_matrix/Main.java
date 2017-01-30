import java.io.*;
import java.util.*;

public class Main
{

	

	static void find(int[][] matrix, int r, int c,int x,int row)
	{
		
		if(r!=row && c>=0)
		{
			if(matrix[r][c]>x)
				find(matrix,r,--c,x,row);
			else if(matrix[r][c]<x)
				find(matrix,++r,c,x,row);
			else
				System.out.println("FOUND at matrix["+r+"]["+c+"]");
		}
		else
		{
			System.out.println("NOT FOUND");
			return;
		}




	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int row,col,x;

		System.out.println("Enter number of rows in the matrix: ");
		row=s.nextInt();
		System.out.println("Enter number of cols in the matrix: ");
		col=s.nextInt();
		int matrix[][] = new int[row][col];

		System.out.println("Enter matrix elements:");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		System.out.println("Enter number to search in the matrix: ");
		x=s.nextInt();
			find(matrix,0,col-1,x,row);
	}
}