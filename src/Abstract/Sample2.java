package Abstract;


public class Sample2 extends Sample1
{
	int i=15;
	int j=25;
	public void m3() 
	{int sub=super.i-super.j;
	System.out.println(sub);
		System.out.println("method m3 completed in concrete class");
	}
	
	public void m4() 
	{
		System.out.println("method m4 completed in concrete class");
	}
}
