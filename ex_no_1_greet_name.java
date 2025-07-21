import java.util.Scanner;
public class ex_no_1_greet_name
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		String name=sc.next();
		System.out.println("Hi, Hello"+name);
		sc.close();
	}
}
