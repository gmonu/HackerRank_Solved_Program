package Java;

import java.util.Scanner;

public class Formatting_String {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++)
		{
		String str = sc.nextLine();
		
		System.out.println(str);
		}
		sc.close();
	}

}
