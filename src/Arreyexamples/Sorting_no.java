package Arreyexamples;
import java.util.Arrays;
public class Sorting_no 
{
public static void main(String[] args) 
{
	int [] ar= {10,20,40,50,30};
	System.out.println(ar.length);
	for(int i=0;i<ar.length-1;i++) 
	{
	System.out.println(ar[i]+" ");
	}
	System.out.println("array length is :"+ ar.length);
	Arrays.sort(ar);
	for(int i=0;i<ar.length-1;i++)
	{
	System.out.println(ar[i]);	
    }
	}

}
