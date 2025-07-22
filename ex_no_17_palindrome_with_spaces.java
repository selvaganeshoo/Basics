import java.util.*;
public class ex_no_17_palindrome_with_spaces
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String a=sc.nextLine();

a=a.replaceAll("\\s","");
StringBuilder b=new StringBuilder(a);

b.reverse();

if((b.toString()).equals(a))
{
System.out.println(true+" palindrome");
}
else
{
System.out.println(false+" Not a plaindrome");
}
sc.close();
}
}
