import java.util.*;
public class ex_no_18_fibonacci_series
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int f=sc.nextInt();
int a=0,b=1;
for(int i=0;i<f;i++)
{
int c=a+b;
System.out.print(a+ " ");
a=b;
b=c;
}
sc.close();
}
}
