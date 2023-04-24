package Abstract;

public class Prime_no 
{public static void main(String[] args) {
int [] ar =new int [5];
int [] br =new int [4];
br[0]=1;
br[1]=2;
br[2]=3;
br[3]=4;

ar[0]=5;
ar[1]=6;
ar[2]=7;
ar[3]=8;
ar[4]=9;
for(int i=ar.length-1;i>=0;i--)
{
System.out.print(ar[i]+" ");
for(int j=br.length-1;j>=0;j--) 
{System.out.print(br[j]);
}
System.out.println(" ");

}

}}
