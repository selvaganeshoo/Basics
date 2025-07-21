import java.util.*;
public class ex_no_12_lar_and_smal_without_sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] arr=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
int temp=arr[0];
int k=arr[0];
for(int i=1;i<a;i++)
{
if(temp<arr[i])
{
temp=arr[i];
}
else if(k>arr[i])
{
k=arr[i];
}
}
System.out.println(temp);
System.out.println(k);
}

}
