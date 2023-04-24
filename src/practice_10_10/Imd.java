package practice_10_10;

public class Imd
{
public static void main(String[] args)
{
	Imd r=new Imd();
	String d =r.aray();
 int p=M1(10,20);
System.out.println(p+p);

int w =r.Sname("ram");

System.out.println(w);
}
public static int M1(int i,int j)
{   int p=i+j;
	System.out.println(i+j);
	return p;
}
public int Sname(String name)
{
	int h=name.length();
	return h;
}
public String aray()
{
	char a[]=new char[5];
	String b="motiv";
for(int i=0;i<=4;i++)
{char h=b.charAt(i);
	a[i]=h;	
}
for(int i=0;i<=4;i++)
{
System.out.print(a[i]+" ");	
}
return b;
}
}

