import java.util.*;
public class ex_no_10_palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
StringBuilder k=new StringBuilder(a);
StringBuilder b=k.reverse();
if(a.equals(b.toString()))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
sc.close();
}
}
