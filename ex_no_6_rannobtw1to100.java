import java.util.Scanner;
import java.util.Random;
public class ex_no_6_rannobtw1to100
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		short a=sc.nextShort();
		Random r=new Random();
		short k= (short) (r.nextInt(100)+1);
		if(a==k)
		{
			System.out.println("You guessed right");
		}
		else if(k>50)
		{
			System.out.println("the number is above 50");
		}
		else
		{
			System.out.println("the number is less 50");
		}
		sc.close();
	}
}
