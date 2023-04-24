package Abstract;

abstract public class Sample1 
{
	protected int i=10;
	protected  int j=15;
	//complete method
	 public void m1()          //method declaration
	{
		 int add=i+j;
		 System.out.println(add);
	 System.out.println("method m1 completed in abstract ");
	}
	
	//complete method
	public void m2()          //method declaration
	{
		System.out.println("method m2 completed in abstract class");      //method defination
	}
	
	//incomplete mthod
	abstract public void m3();

	//incomplete mthod
	abstract public void m4();

}
