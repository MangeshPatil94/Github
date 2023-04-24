package Arreyexamples;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int clm = sc.nextInt();
	System.out.println("Enter the value of matrix 1: ");
	int [][] ar = new int [row][clm];
	int [][] ar1 = new int [row][clm];
	int[][] ar2 = new int [row][clm];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<clm;j++)
		{
			ar[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Enter the value of matrix 2: ");
	for(int a=0;a<row;a++)
	{
		for(int b=0;b<clm;b++)
		{
			ar1[a][b]=sc.nextInt();
		}
	}
	
//	
//	for( c=0;c<row;c++)
//	{
//		for(d=0;d<clm;d++)
//		{
//			//ar2[c][d]=sc.nextInt();
//		}
//	}
	
	
	System.out.println("addition of matrix is : ");
	
	for(int e=0;e<row;e++)
	{
		for(int f=0;f<clm;f++)
		{
			ar2[e][f]=ar[e][f]+ar1[e][f];
			System.out.print(ar2[e][f]+ " ");			
		}
		System.out.println();
	}
	for(int a=0;a<clm;a++)
	{int sum=0;
		for(int b=0;b<row;b++)
		{
			sum=sum+ar2[b][a]];
		}
		System.out.println(sum);
	}
	
    }

}
