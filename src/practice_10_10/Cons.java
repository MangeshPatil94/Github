package practice_10_10;

public class Cons 
{
int i;
int j;
Cons (int k, int l)
{
k=k+10;	
i=k;
j=l;

}
public static void main(String[] args)
{
	Cons u=new Cons(10,20);
	u.M1();
	u.M2();
}
public void M1()
{
	int q=i+j;
	System.out.println(q);
}
public void M2()
{
	int e=i+j;
	System.out.println(e);
}

}
