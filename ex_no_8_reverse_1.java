import java.util.*;
public class ex_no_8_reverse_1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	sc.close();
	}
}
