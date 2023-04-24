package Arreyexamples;
import  java.util.Scanner;
public class Addinofrow 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner (System.in);

	int row = a.nextInt();
		System.out.println("enter the column size :");
		int clm = a.nextInt();
		int [][] ar= new int [row][clm];
		System.out.println("enter the matrix values :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<clm;j++)
			{
		    ar[i][j]=a.nextInt();
			}
		}
		System.out.println("entered matrix values are :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<clm;j++)
			{
		   System.out.print(ar[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("sum of column values are :");
	for(int i=0;i<clm;i++)
	{int sum=0;//sum=0
	for(int j=0;j<row;j++)
		{ 
			sum=sum+ar[j][i];//
		}
		System.out.println("column"+i+" =  "+sum+ " ");	
		
	}
	}

}
