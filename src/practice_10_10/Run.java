package practice_10_10;

public class Run 
{
int i;
int j;
int	k=10;
Run()
{
	i=10;
	j=20;
}
Run(int p,int q)
{   i=15;
    j=30;
	k=k+p;
}

public  void M1()
{	
	i=i+k;
int q=i+j;
	
	System.out.println(q);
	}
public  void M2()
{	
	int r=i+j+k;
	System.out.println(r);
	}
}


