package Arreyexamples;

public class Ex4_2dArray 
{
	public static void main(String[] args)
	{
 int ar[][]={{10,34,24},{65,24,98}}  ;
 int a=24;
 int i,j;
 for( i=0;i<2;i++)// row=0,row=1
 {
	 for( j=0;j<3;j++)
	 {
		 System.out.print(ar[i][j]+" ");//(0,2)(1,1)
	 }
	 System.out.println();//10,23,67
	                      //54,35,78
 }
 if(ar[i][j] == a)
 {
	 System.out.println("the position of the no is : "+ i + j );
 }
}
}









//new int[2][3];
//ar[0][0]=10; sc.nextInt();
//ar[0][1]=23; sc.nextInt();
//ar[0][2]=67;
//ar[1][0]=54;
//ar[1][1]=35;
//ar[1][2]=78;