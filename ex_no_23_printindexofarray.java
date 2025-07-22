import java.util.*;
public class ex_no_23_printindexofarray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter find element");
int f=sc.nextInt();
for(int i=0;i<n;i++)
{
if(a[i]==f)
{
System.out.println(i);
}
else{
c++;
}
}
if(c==n)
{
System.out.println(-1);
}
sc.close();
}
}
