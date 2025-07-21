import java.util.Scanner;
import java.util.Random;
public class ex_no_5_randombtw1to10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		byte a;
		Random r=new Random();
		byte k=(byte) (r.nextInt(10)+1);
		System.out.println("Enter number between 1 to 10");
		int count=0;
		do
		{
			System.out.println("enter  ur guess");
			a=sc.nextByte();
			if(k>a)
			{
				System.out.println("ur number is less");
				count++;
			}
			else if(k<a)
			{
				System.out.println("ur number is more");
				count++;
			} 
		}while(k!=a);
		System.out.println("ur right ur attempt is : "+ count);
		sc.close();
	}
}

