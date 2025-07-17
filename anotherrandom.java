import java.util.Scanner;
import java.util.Random;
public class anotherrandom
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=0;
		Random r=new Random();
		short k=(short) (r.nextInt(10)+1);
		short a=sc.nextShort();
		while(a!=k)
		{
			if(a>k)
			{
				System.out.println("too high");
			}
			else 
			{
				System.out.println("too low");
			}
		m++;
		}
		System.out.println("your are right your attempt is"+ m);
}
} 
