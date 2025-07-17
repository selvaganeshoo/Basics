import java.util.Scanner;
public class greet_name
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		String name=sc.next();
		System.out.println("Hi, Hello"+name);
		sc.close();
	}
}
