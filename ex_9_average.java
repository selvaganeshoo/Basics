import java.util.*;
public class ex_9_average
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] q=new int[a];
int sum=0;

for(int i=0;i<a;i++)
{
System.out.println("enter value for "+i+" index"); 
q[i]=sc.nextInt();
sum+=q[i];
}
System.out.println("the average is "+(double)sum/a);
}
}
