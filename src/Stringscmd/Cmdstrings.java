package Stringscmd;

import java.util.Scanner;

public class Cmdstrings 
{
	public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int clm = sc.nextInt();
	System.out.println("Enter the value of matrix 1: ");
	int [][] ar = new int [row][clm];
	System.out.println("Enter the value of matrix 2: ");
	int [][] ar1 = new int [row][clm];
	int[][] ar2 = new int [row][clm];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<clm;j++)
		{
			ar[i][j]=sc.nextInt();
		}
	}
	//2 2=======> 1 2
	     //       3 4        ar[2] [1]
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<clm;j++)
		{
			ar1[i][j]=sc.nextInt();
		}
	}
	//2 2=======> 5 6
    //            7 8   ar1[2] [1]

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<clm;j++)
		{ 
			ar2[i][j]=ar[i][j]+ar1[i][j];
			System.out.print(ar2[i][j]+" ");
		}
		System.out.println();
	}
}

}
