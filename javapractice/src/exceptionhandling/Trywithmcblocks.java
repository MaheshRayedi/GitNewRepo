package exceptionhandling;

import java.util.Scanner;

public class Trywithmcblocks {

	public static void main(String[] args) {
		
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number:");
			int num = s.nextInt();
			System.out.println(10/num);
			System.out.println("ratan".charAt(12));
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ratani.com");
		}
		catch(StringIndexOutOfBoundException e)
		{
			System.out.println("Durgasoft");
		}
		System.out.println("rest of the app....");
	}

}
