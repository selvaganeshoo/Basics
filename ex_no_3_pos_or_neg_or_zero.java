import java.util.Scanner;
public class ex_no_3_pos_or_neg_or_zero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("number is positive");
		}
		else if(a<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
		sc.close();
	}
}

