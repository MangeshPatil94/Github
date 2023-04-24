package practice_10_10;

public class Sample2 extends Sample1
{
	public void M1()
	{
		// abcdabcdabcdabcd
		String s="hi ram is here";
		String q[]=s.split(" ");
		for(int i=9-6;i>=0;i--)
		{
			System.out.print(q[i]+" ");
		}
		System.out.println();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
