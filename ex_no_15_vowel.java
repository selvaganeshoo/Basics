import java.util.*;
public class ex_no_15_vowel
{
public static void main(String[] args)
{
int v=0;
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char arr[]=a.toCharArray();
for(int i=0;i<a.length();i++)
{
if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U')
{
v++;
}
}
if(v>0)
{
System.out.println(true);
}
else
{
System.out.println(false);
}
sc.close();
}
}
