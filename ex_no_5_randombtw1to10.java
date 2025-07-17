import java.util.Scanner;
import java.util.Random;
public class ex_no_5_randombtw1to10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number between 1 to 10");
		byte a=sc.nextByte();
		Random r=new Random();
		byte k=(byte) (r.nextInt(10)+1);
		if(k==a)
		{
			System.out.println("you guessed right");
		}
		else if(k>a)
		{
			System.out.println("your guess is low");
		}
		else
		{
			System.out.print("your guess is high");
		}
		sc.close();
	}
}

