package inharitance;

public class Operato
{
public static void main(String[] args)
{
	int a=10;
	int b=25;
	int d=a--;//d=9
	
	int c=d+b;//d=9,
	System.out.println(c);//34
	c=d+a;//d=9
	System.out.println(c);//18
	System.out.println(c);
	if(c==18)
	{	
		System.out.println("hi");
	}
	if(c!=18)
	{
		Syste	m.out.println("hello");
	}
	
}
}
