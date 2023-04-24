package Arreyexamples;

import java.util.Arrays;

public class Ex3 
{
public static void main(String[] args)
{
M1(5);	
}
public static void M1(int n)
{
	int ar [] = {20,10,50,40,30} ;//new int[n];
//	ar[0]=20;
//	ar[1]=10;
//	ar[2]=50;
//	ar[3]=40;
//	ar[4]=30;
	for(int i=0;i<ar.length;i++) {
	System.out.print(ar[i]+" ");}
System.out.println();
	Arrays.sort(ar);
	for(int i=0;i<ar.length;i++) 
	{
	System.out.print(ar[i]+" ");	
	}	
	System.out.println();
	Arrays.sort(ar);
	for(int i=0;i<ar.length;i++) 
	{
	System.out.print(ar[i]+" ");	
	}
}
}
