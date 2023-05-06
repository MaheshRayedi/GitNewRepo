package exceptionhandling;

import java.util.Scanner;

public class TrycatchException1 {

	public static void main(String[] args) {
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number:");
			int num = s.nextInt();
			System.out.println(10/num);
			System.out.println("ratan".charAt(12));
		}
		//child to parent
		catch(ArithmticException ae)
		{
			System.out.println("Durgasoft");
		}
		catch(Exception e)
		{
			System.out.println("Ratan");
		}
	}

}
