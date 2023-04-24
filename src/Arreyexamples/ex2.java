package Arreyexamples;

import java.util.Scanner;
public class ex2 
{
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.print("enter no of rows :");
		int row=a.nextInt();
		System.out.print("enter no of colimn :");
		int colm=a.nextInt();
		int [][] number=new int[row][colm];
		System.out.println("enter matrix values :");
		for (int i=0;i<row;i++)
		 {
		   for (int j=0;j<colm;j++)
		   {
		    number[i][j]=a.nextInt();
		   }
		 }
		System.out.println("output of matrix values :");
		for (int i=0;i<row;i++)
		 {
		   for (int j=0;j<colm;j++)
		     {
		      System.out.print(number[i][j] + " ");
		      }
		    System.out.println();
		  }
		System.out.println("wright down the no you want from matrix :");
		int fnum=a.nextInt();
		for (int i=0;i<row;i++)
		 {
		   for (int j=0;j<colm;j++)
		     {
		     if(number[i][j] == fnum)
		     {
		    	 System.out.println("position of the no is:[" + i +","+j+"]");
		     }
		      }
		    
		  }
	
		
	}

}
