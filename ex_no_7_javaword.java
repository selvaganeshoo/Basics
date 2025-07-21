import java.util.Scanner;
public class ex_no_7_javaword
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		name=name.toLowerCase();
		if(name.contains("java"))
		{
			System.out.println("contains java");
		}
		else
		{
			System.out.println("does not contain java");
		}
	sc.close();
	}
}

