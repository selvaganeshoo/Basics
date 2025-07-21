import java.util.Scanner;
import java.util.Random;
public class ex_no_6_rannobtw1to100
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		short a;
		Random r=new Random();
		short k= (short) (r.nextInt(100)+1);
		int c=0;
	do
	{
		a=sc.nextShort();
		if(k>50)
		{
			System.out.println("the number is upper half");
			c++;
		}
		else if(k<50)
		{
			System.out.println("the number is lower half");
			c++;
		}
		else
		{
			System.out.println("invalid number");
		}
	}
	while(a!=k);
		System.out.println("u guessed right and the number is "+k+" and count is "+c);

		sc.close();
	}
}
		
