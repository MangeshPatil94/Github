package Arreyexamples;

import java.util.Scanner;

public class Ex5Sys_2dArray 
{public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter length of the row : ");
int row=sc.nextInt();                          //3
System.out.print("Enter length of the column : ");
int clm=sc.nextInt();                          //3
int [][] ar= new int[row][clm];//array deceleration
System.out.println("Enter the values of matrix : ");

for(int i=0;i<row;i++)  //i=0,1
{
	for(int j=0;j<clm;j++)//j=(0,0),(0,1),(0,2)//j=(0,0),(0,1),(0,2)
	{
	 ar[i][j]=sc.nextInt();//5,8,7
	}
}
System.out.println("the out put matrix is : ");
int i=10;
for(int i=0;i<row;i++)
{
	for(int j=0;j<clm;j++)
	{
	  System.out.print(ar[i][j] + " ");  
	}
	System.out.println();	
}
//int a=sc.nextInt();
System.out.println(ar[0][1]);
//for(int i=0;i<row;i++)
//{
//	for(int j=0;j<clm;j++)
//	{
//		System.out.println(ar[0][1]);
////		if(ar[i][j]==a)
////		{
////			
//////	    System.out.print(a);
//////		System.out.print("["+i  + j+"]");
////		}
//	}	
//}
}
}
