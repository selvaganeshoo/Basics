import java.util.*;
public class ex_no_20_removegivenchar
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char c=sc.next().charAt(0);
String n=a.replaceAll(String.valueOf(c), "");
System.out.println(n);
sc.close();
}
}
