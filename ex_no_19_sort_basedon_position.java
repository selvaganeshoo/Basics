import java.util.*;
public class ex_no_19_sort_basedon_position
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
Integer o[]=new Integer[n/2];
Integer e[]=new Integer[(n+1)/2];
int j=0,k=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(i%2==0)
{
e[j]=a[i];
j++;
}
else
{
o[k]=a[i];
k++;
}
}
Arrays.sort(e,Collections.reverseOrder());
Arrays.sort(o);
System.out.println(Arrays.toString(e));
System.out.println(Arrays.toString(o));
j=0;
k=0;
for(int i=0;i<n;i++)
{
if(i%2==0)
{System.out.println(e[j]);j++;
}
else
{
System.out.println(o[k]);
k++;
}
}
sc.close();
}
}

