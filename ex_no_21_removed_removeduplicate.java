import java.util.*;
public class ex_no_21_removed_removeduplicate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] n=new int[a];
for(int i=0;i<a;i++)
{
n[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
boolean b=true;
for(int j=0;j<i;j++)
{
if(n[i]==n[j])
{
b=false;
break;
}
}
if(b==true)
{
System.out.print(" "+n[i]);
}
}
sc.close();
}
}

