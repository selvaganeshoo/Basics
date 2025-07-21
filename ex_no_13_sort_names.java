import java.util.*;
public class ex_no_13_sort_names
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
String[] a=new String[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextLine();
}
Arrays.sort(a);
System.out.println(Arrays.toString(a));
}
}

