import java.util.Scanner;
public class ex_no_4_C_to_F
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter celcius");
		int c=sc.nextInt();
		System.out.println((c*9/5)+32);
		sc.close();
	}
}

