package Arreyexamples;
import java.util.Scanner;
public class Ex5
{int a,b,c,d,e,f,g,h;
Ex5()
{
	
}
 
	public void M1()
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int clm = sc.nextInt();
		System.out.println("Enter the value of matrix 1: ");
		int [][] ar = new int [row][clm];
		int [][] ar1 = new int [row][clm];
		//int[][]ar2 = new int [][];
		for(a=0;a<row;a++)
		{
			for(b=0;b<clm;b++)
			{
				ar[a][b]=sc.nextInt();
			}
		}
		System.out.println("Enter the value of matrix 2: ");
		for(c=0;c<row;c++)
		{
			for(d=0;d<clm;d++)
			{
				ar1[c][d]=sc.nextInt();
			}
		}
		for(e=0;e<row;e++)
		{
			for(f=0;f<clm;f++)
			{
				System.out.print(ar[e][f]+" ");
			}
			System.out.println();
//			for(f=0;f<clm;f++)
//			{
//				System.out.print(ar1[e][f]+" ");
//			}
//			System.out.println();
		}
		//System.out.println(ar[e][f]+" ");	
	}
	public static void main(String[] args) 
	{
    	Ex5 q=new Ex5();
    	q.M1();
    }
}