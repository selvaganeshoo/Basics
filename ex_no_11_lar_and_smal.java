import java.util.*;
public class ex_no_11_lar_and_smal
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int [n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.print(a[0]+" "+a[n-1]);
sc.close();
}
}
